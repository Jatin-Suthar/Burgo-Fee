package com.example.burgofee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    ImageView Profile_Image;
    ImageView Profile_Food_Image;
    ImageView Profile_balance;
    ImageView Profile_logout;
    TextView Person_name;
    TextView Profile_User_name;
    TextView Profile_Food_name;
    TextView Profile_Food_count;
    TextView Profile_Balance;
    TextView Profile_upi;
    TextView Profile_phone;
    TextView Profile_dot;
    TextView Profile_email;
    TextView Edit_Profile;
    TextView Last_payment;
    TextView Date_Time;
    TextView Logout_text;
    TextView Profile_cart;
    TextView Cart_item;
    ImageView Home_btn;
    ImageView GotoCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //setViews
        setViewAll();

        Profile_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, SignInActivity.class));
                finish();
            }
        });

        GotoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, FoodCart.class));
            }
        });

        Home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, DashBoard.class));
                finish();
            }
        });
    }

    private void setViewAll() {
        Profile_Image = findViewById(R.id.image_logo);
        Profile_Food_Image = findViewById(R.id.foodOrdered);
        Profile_balance = findViewById(R.id.account_balance_logo);
        Profile_logout = findViewById(R.id.profile_logout_btn);
        Person_name = findViewById(R.id.person_name);
        Profile_User_name = findViewById(R.id.person_userName);
        Profile_Food_name = findViewById(R.id.food_name);
        Profile_Food_count = findViewById(R.id.food_count);
        Profile_Balance = findViewById(R.id.account_balance);
        Profile_upi = findViewById(R.id.account_upi_id);
        Profile_phone = findViewById(R.id.profile_phone);
        Profile_dot = findViewById(R.id.profile_dot);
        Profile_email = findViewById(R.id.profile_email);
        Edit_Profile = findViewById(R.id.profile_edit_text);
        Last_payment = findViewById(R.id.last_payment);
        Date_Time = findViewById(R.id.date_time);
        Logout_text = findViewById(R.id.profile_logout);
        Profile_cart = findViewById(R.id.profile_cart);
        Cart_item = findViewById(R.id.profile_cart_item);
        Home_btn = findViewById(R.id.profile_home_image);
        GotoCart = findViewById(R.id.profile_cart_image);
    }
}