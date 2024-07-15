package gmail.riteshbakare420.signbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class StartActivity extends AppCompatActivity {

    LottieAnimationView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start2);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        logo = findViewById(R.id.appSplashScreen);

        logo.playAnimation();

        Handler handler = new Handler();

        Runnable runnable = () -> {
            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            finish();
        };

        // Post the Runnable with a delay
        handler.postDelayed(runnable, 2500);

    }


}