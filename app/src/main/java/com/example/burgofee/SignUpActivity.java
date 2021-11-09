
package com.example.burgofee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {

    private ImageView logoImage;
    private TextView Title;
    private TextView TagLine;
    TextInputLayout user_name;
    TextInputLayout name;
    TextInputLayout user_email;
    TextInputLayout user_pass;
    TextInputLayout con_pass;
    private Button register_button;
    private TextView signInText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        setViews();

        signInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                finish();
            }
        });
    }

    private void setViews() {
        logoImage = (ImageView) findViewById(R.id.logoImageView);
        Title = (TextView) findViewById(R.id.registerTextView);
        TagLine = (TextView) findViewById(R.id.registerTagLine);
        user_name = (TextInputLayout) findViewById(R.id.user_name);
        name = (TextInputLayout) findViewById(R.id.person_name);
        user_email = (TextInputLayout) findViewById(R.id.email_id);
        user_pass = (TextInputLayout) findViewById(R.id.password);
        con_pass = (TextInputLayout) findViewById(R.id.confirm_password);
        register_button = (Button) findViewById(R.id.register_btn);
        signInText = (TextView) findViewById(R.id.signInText);
    }
}