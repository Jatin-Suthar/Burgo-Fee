package com.example.burgofee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class ForgotPassword extends AppCompatActivity {

    private ImageView forgotImageView;
    private TextView note_line;
    TextInputLayout forgot_email;
    TextInputLayout forgot_password;
    TextInputLayout forgot_new;
    private Button done_btn;
    private Button long_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        setViewsId();

        long_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPassword.this, SignInActivity.class));
                finish();
            }
        });
    }

    private void setViewsId() {
        forgotImageView = findViewById(R.id.forgotImageView);
        note_line = findViewById(R.id.info);
        forgot_email = findViewById(R.id.assigned_email);
        forgot_password = findViewById(R.id.new_password);
        forgot_new = findViewById(R.id.con_pass);
        done_btn = findViewById(R.id.forgot_done);
        long_back = findViewById(R.id.long_back);
    }
}