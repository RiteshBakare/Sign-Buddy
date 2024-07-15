package gmail.riteshbakare420.signbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;



import org.opencv.android.OpenCVLoader;

import gmail.riteshbakare420.signbuddy.realtime.CameraActivity;
import gmail.riteshbakare420.signbuddy.realtime.CombineLettersActivity;

public class MainActivity extends AppCompatActivity {
    static {
        if(OpenCVLoader.initDebug()){
            Log.d("SIGN_BUDDY: ","Opencv is loaded");
        }
        else {
            Log.d("SIGN_BUDDY: ","Opencv failed to load");
        }
    }

    private Button camera_button,camera_combine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        camera_button=findViewById(R.id.camera_button);
        camera_combine=findViewById(R.id.camera_combine);

        camera_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CameraActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });


        camera_combine.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CombineLettersActivity.class) .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
        });
    }
}