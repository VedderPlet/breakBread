package bread.first.vedderplet.fbread;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;

import org.w3c.dom.Text;


public class ProfileSettings extends AppCompatActivity {
    Spinner spinner, guestSpinner, sex, dress;
    ArrayAdapter<CharSequence> adapter, guests, sexAdapter, dressAdapter;
    /* NumberPicker noPicker = null; */
    EditText openerText;
    EditText editAge;
    CheckBox none, other, milk, eggs,peanuts, treenuts,soy, wgbro, fish, shellfish, dander, perfume, dust, hosting, duocook, cook, free = null;


    //Add multiple checkboxes for SharedPreference <3 k thx

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_profile_settings);
        spinner = (Spinner)findViewById(R.id.diet);
        guestSpinner = (Spinner) findViewById(R.id.guest);
        sex = (Spinner) findViewById(R.id.sexSpinner);
        dress = (Spinner) findViewById(R.id.dressSpinner);
        openerText = (EditText) findViewById(R.id.openerText);
        editAge = (EditText) findViewById(R.id.editAge);
        other = (CheckBox) findViewById(R.id.otherCheck);
        none = (CheckBox) findViewById(R.id.noneCheck);
        milk = (CheckBox) findViewById(R.id.milkCheck);
        eggs = (CheckBox) findViewById(R.id.eggsCheck);
        peanuts = (CheckBox) findViewById(R.id.peanutsCheck);
        treenuts = (CheckBox) findViewById(R.id.treeNutsCheck);
        soy = (CheckBox) findViewById(R.id.soyCheck);
        wgbro = (CheckBox) findViewById(R.id.wgbroCheck);
        fish = (CheckBox) findViewById(R.id.fishCheck);
        shellfish = (CheckBox) findViewById(R.id.shellfishCheck);
        dander = (CheckBox) findViewById(R.id.petDander);
        perfume = (CheckBox) findViewById(R.id.pfCheck);
        dust = (CheckBox) findViewById(R.id.dustCheck);
        hosting = (CheckBox) findViewById(R.id.checkHost);
        duocook = (CheckBox) findViewById(R.id.duoCook);
        cook = (CheckBox) findViewById(R.id.checkCook);
        free = (CheckBox) findViewById(R.id.checkFree);



        //Make this much cleaner before Demo
        boolean isChecked = getBooleanFromPreferences("isChecked");
        Log.i("start",""+isChecked);
        none.setChecked(isChecked);
        none.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isChecked");
            }
        });

        boolean isCheckedTwo = getBooleanFromPreferences("isCheckedTwo");
        Log.i("start",""+isChecked);
        milk.setChecked(isCheckedTwo);
        milk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedTwo");
            }
        });

        boolean isCheckedThree = getBooleanFromPreferences("isCheckedThree");
        Log.i("start",""+isChecked);
        eggs.setChecked(isCheckedThree);
        eggs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedThree");
            }
        });

        boolean isCheckedFour = getBooleanFromPreferences("isCheckedFour");
        Log.i("start",""+isChecked);
        peanuts.setChecked(isCheckedFour);
        peanuts.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedFour");
            }
        });

        boolean isCheckedFive = getBooleanFromPreferences("isCheckedFive");
        Log.i("start",""+isChecked);
        treenuts.setChecked(isCheckedFive);
        treenuts.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedFive");
            }
        });

        boolean isCheckedSix = getBooleanFromPreferences("isCheckedSix");
        Log.i("start",""+isChecked);
        soy.setChecked(isCheckedSix);
        soy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedSix");
            }
        });

        boolean isCheckedSeven = getBooleanFromPreferences("isCheckedSeven");
        Log.i("start",""+isChecked);
        wgbro.setChecked(isCheckedSeven);
        wgbro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedTwo");
            }
        });

        boolean isCheckedEight = getBooleanFromPreferences("isCheckedEight");
        Log.i("start",""+isChecked);
        fish.setChecked(isCheckedEight);
        fish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedEight");
            }
        });

        boolean isCheckedNine = getBooleanFromPreferences("isCheckedNine");
        Log.i("start",""+isChecked);
        shellfish.setChecked(isCheckedNine);
        shellfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedNine");
            }
        });

        boolean isCheckedTen = getBooleanFromPreferences("isCheckedTen");
        Log.i("start",""+isChecked);
        dander.setChecked(isCheckedTen);
        dander.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedTen");
            }
        });

        boolean isCheckedEleven = getBooleanFromPreferences("isCheckedEleven");
        Log.i("start",""+isChecked);
        perfume.setChecked(isCheckedEleven);
        perfume.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedNine");
            }
        });

        boolean isCheckedTwelve = getBooleanFromPreferences("isCheckedTwelve");
        Log.i("start",""+isChecked);
        dust.setChecked(isCheckedTwelve);
        dust.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedTwelve");
            }
        });

        boolean isCheckedThirteen = getBooleanFromPreferences("isCheckedThirteen");
        Log.i("start",""+isChecked);
        hosting.setChecked(isCheckedThirteen);
        hosting.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedThirteen");
            }
        });

        boolean isCheckedFourteen = getBooleanFromPreferences("isCheckedFourteen");
        Log.i("start",""+isChecked);
        duocook.setChecked(isCheckedFourteen);
        duocook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedFourteen");
            }
        });

        boolean isCheckedFifteen = getBooleanFromPreferences("isCheckedFifteen");
        Log.i("start",""+isChecked);
        cook.setChecked(isCheckedFifteen);
        cook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedFifteen");
            }
        });

        boolean isCheckedSixteen= getBooleanFromPreferences("isCheckedSixteen");
        Log.i("start",""+isChecked);
        free.setChecked(isCheckedSixteen);
        free.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedSixteen");
            }
        });

        boolean isCheckedSeventeen = getBooleanFromPreferences("isCheckedSeventeen");
        Log.i("start",""+isChecked);
        other.setChecked(isCheckedSeventeen);
        other.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("boolean",""+isChecked);
                ProfileSettings.this.putBooleaninPreferences(isChecked,"isCheckedSeventeen");
            }
        });


        ProfilePictureView profilePictureview;
        profilePictureview = (ProfilePictureView) findViewById(R.id.profileUser);
        profilePictureview.setProfileId(Profile.getCurrentProfile().getId()); //user id add






        adapter = ArrayAdapter.createFromResource(this,R.array.diet, android.R.layout.simple_spinner_item);
        guests = ArrayAdapter.createFromResource(this, R.array.guests, android.R.layout.simple_spinner_item);
        dressAdapter = ArrayAdapter.createFromResource(this, R.array.dress, android.R.layout.simple_spinner_item);
        sexAdapter = ArrayAdapter.createFromResource(this, R.array.sex, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        guests.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dressAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sexAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        guestSpinner.setAdapter(guests);
        dress.setAdapter(dressAdapter);
        sex.setAdapter(sexAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sharedPref.edit().putInt("PREF_SPINNER"), position().commit();
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "is selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        guestSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "is selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        sex.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "is selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dress.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "is selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }

    // Save the users Profile settings
    //fix Age, will not save
    public void saveInfo(View view){
        SharedPreferences sharedPref = getSharedPreferences("profileInfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("profile", openerText.getText().toString());
        editor.putInt("Age", editAge.getId());
        editor.apply();


        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();

    }
            //For some reason this is returning "2131558543" int when saving any int and displaying it. Annoying. MOVE ON FIND ANOTHER WAY.
    public void displayData(View view){
        SharedPreferences sharedPref = getSharedPreferences("profileInfo", Context.MODE_PRIVATE);

        String profileText = sharedPref.getString("profile", "");
        int age = sharedPref.getInt("Age", 0);
        //editAge.setText(age);
       // final TextView txtValue = (TextView) findViewById(R.id.editAge);
        editAge.setText(String.valueOf(age));
        openerText.setText(profileText);

    }

    public void putBooleaninPreferences(boolean isChecked,String key){
        SharedPreferences sharedPreferences = this.getPreferences(Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, isChecked);
        editor.commit();
    }
    public boolean getBooleanFromPreferences(String key){
        SharedPreferences sharedPreferences = this.getPreferences(Activity.MODE_PRIVATE);
        Boolean isChecked = sharedPreferences.getBoolean(key, false);
        return isChecked;
    }




    public void save(View view){
        Intent s = new Intent(this, ChaseActivity.class);
        startActivity(s);
    }

    public void back(View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);

    }








}
