package com.example.burgofee;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import static android.app.ActivityOptions.*;

public class SignInActivity extends AppCompatActivity {

    private ImageView logoImage;
    private TextView loginText;
    TextInputLayout userNameText;
    TextView signIn_text;
    TextInputLayout emailIdText;
    TextInputLayout passwordText;
    Button signIn;
    Button registerBtn;
    TextView forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        setView();

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, DashBoard.class));
                finish();
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(in);
                finish();
            }
        });
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, ForgotPassword.class));
                finish();
            }
        });
    }

    private void setView() {
        logoImage = findViewById(R.id.logoImage);
        loginText = findViewById(R.id.signInTextView);
        userNameText = findViewById(R.id.username);
        emailIdText = findViewById(R.id.user_emailId);
        passwordText = findViewById(R.id.user_password);
        signIn = findViewById(R.id.login_btn);
        registerBtn = findViewById(R.id.registerButton);
        forgotPass = findViewById(R.id.forgotPassword);
        signIn_text = findViewById(R.id.signIn_text);
    }
}