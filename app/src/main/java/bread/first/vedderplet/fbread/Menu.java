package bread.first.vedderplet.fbread;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

// Clean & rebuild for symbols. Quite annoying

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void profile(View view){
        Intent i = new Intent(this,ProfileSettings.class);
        startActivity(i);

    }

    public void chase(View view){
        Intent c = new Intent(this,ChaseActivity.class);
        startActivity(c);
    }

    public void search(View view){
        Intent s = new Intent(this, Search.class);
        startActivity(s);
    }


    @Override
    protected void onStart() {
        super.onStart();

        setContentView(R.layout.activity_menu);
    }
}
