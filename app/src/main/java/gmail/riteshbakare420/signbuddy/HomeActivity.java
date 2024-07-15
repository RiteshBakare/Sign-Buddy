package gmail.riteshbakare420.signbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import gmail.riteshbakare420.signbuddy.learning.LearningContentActivity;
import gmail.riteshbakare420.signbuddy.quiz.QuizActivity;
import gmail.riteshbakare420.signbuddy.realtime.CombineLettersActivity;
import gmail.riteshbakare420.signbuddy.texttosign.TextToSignActivity;


public class HomeActivity extends AppCompatActivity {

    private static final int CAMERA_PERMISSION_REQUEST_CODE = 100;

    ImageView btnLangRecognition, btnLangLearning, btnLangQuiz, btnTextToSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLangRecognition = findViewById(R.id.btnRecognition);
        btnLangLearning = findViewById(R.id.btnLearning);
        btnLangQuiz = findViewById(R.id.btnQuize);
        btnTextToSign = findViewById(R.id.btnTextToSign);


        btnLangRecognition.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), CombineLettersActivity.class));
        });

        btnLangLearning.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), LearningContentActivity.class));
        });

        btnLangQuiz.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), QuizActivity.class));
        });

        btnTextToSign.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), TextToSignActivity.class));
        });

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED) {

        } else if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
        } else {
            // Request camera permission
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.CAMERA},
                    CAMERA_PERMISSION_REQUEST_CODE);
        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == CAMERA_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            } else {
                Toast.makeText(this, "Camera permission denied.", Toast.LENGTH_SHORT).show();
            }
        }

    }
}