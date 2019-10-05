package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.project_uts.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void handleNextActivity(View view) {
        Intent intent = new Intent(this,NextActivity.class);
        startActivity(intent);
    }
}
