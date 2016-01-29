package ejbm.mac.com.debug01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById( R.id.tv1 ) ;


        Log.i("EJBM", "INFO: " + tv) ;
        Log.d("EJBM", "DEBUG: " + tv);
        Log.e("EJBM", "ERROR: " + tv);

        tv.setText( "- Log register: \n\t>I\n\t>D\n\t>E\n-Break Point -_-'\n-Change value on variable while debuging");


    }
}
