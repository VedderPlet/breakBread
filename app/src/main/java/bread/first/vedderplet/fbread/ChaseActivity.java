package bread.first.vedderplet.fbread;

        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.content.Intent;

        import java.net.NetworkInterface;

public class ChaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chase);
    }

    public void back(View view){
        Intent b = new Intent(this,Menu.class);
        startActivity(b);
    }


}
