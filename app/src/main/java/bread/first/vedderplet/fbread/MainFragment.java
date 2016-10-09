package bread.first.vedderplet.fbread;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.app.Activity;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;


import org.json.JSONObject;
import org.w3c.dom.Text;

/**
 * Facebook Login Fragment.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    private TextView mTextDetails;
    private AccessTokenTracker mTokenTracker;
    private ProfileTracker mProfileTracker;
    private CallbackManager mCallbackManager;
    private FacebookCallback<LoginResult> mCallback = new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            AccessToken accessToken = loginResult.getAccessToken();
            Profile profile = Profile.getCurrentProfile();
            displayWelcomeMessage(profile);
            Intent i = new Intent(MainFragment.this.getActivity(), bread.first.vedderplet.fbread.Menu.class);
            startActivity(i);


        }

        @Override
        public void onCancel() {

        }

        @Override
        public void onError(FacebookException error) {

        }
    };




    public MainFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
        mCallbackManager = CallbackManager.Factory.create();




        mTokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(AccessToken oldToken, AccessToken newToken) {

            }
        };
        mProfileTracker = new ProfileTracker() {
            @Override
            protected void onCurrentProfileChanged(Profile oldProfile, Profile newProfile) {
                displayWelcomeMessage(newProfile);

            }
        };
        mTokenTracker.startTracking();
        mProfileTracker.startTracking();
    }

    public void onClick(View view){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);

    }



    private void displayWelcomeMessage(Profile profile) {
        if (profile != null) {
            mTextDetails.setText("Welcome " + profile.getName());
        }
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoginButton loginButton = (LoginButton) view.findViewById(R.id.login_button);
        loginButton.setReadPermissions("user_friends");
        loginButton.setFragment(this);
        loginButton.registerCallback(mCallbackManager, mCallback);

        mTextDetails = (TextView) view.findViewById(R.id.text_details);



    }

    @Override
    public void onResume() {
        super.onResume();
        Profile profile = Profile.getCurrentProfile();
        displayWelcomeMessage(profile);
    }

    @Override
    public void onStop() {
        super.onStop();
        mTokenTracker.stopTracking();
        mProfileTracker.stopTracking();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);

    }
}
