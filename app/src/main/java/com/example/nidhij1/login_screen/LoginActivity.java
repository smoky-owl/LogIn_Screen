package com.example.nidhij1.login_screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onSubmit(View v) {
        Toast.makeText(getApplicationContext(), "Submitted!", Toast.LENGTH_SHORT).show();
    }
}
