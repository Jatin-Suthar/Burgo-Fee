package com.example.burgofee;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class SandwichActivity extends AppCompatActivity {

    AutoCompleteTextView Sandwiches_grilled_autoComplete_text;
    ImageView Sandwiches_back_image;
    TextView Sandwiches_app_name;
    ImageView Sandwiches_goto_cart;
    RadioButton Sandwiches_check1;
    TextView Sandwiches_online_opt;
    RadioButton Sandwiches_check2;
    TextView Sandwiches_dine_in_opt;
    TextView Sandwiches_menu_text;
    CardView Sandwiches_card_grilled;
    TextInputLayout Sandwiches_grilled_quantity_layout;
    Button Sandwiches_grilled_add_btn;
    AutoCompleteTextView Sandwiches_veg_grilled_autoComplete_text;
    CardView Sandwiches_card_veg_grilled;
    TextInputLayout Sandwiches_veg_grilled_quantity_layout;
    Button Sandwiches_veg_grilled_add_btn;
    AutoCompleteTextView Sandwiches_old_school_autoComplete_text;
    CardView Sandwiches_card_old_school;
    TextInputLayout Sandwiches_old_school_quantity_layout;
    Button Sandwiches_old_school_add_btn;
    AutoCompleteTextView Sandwiches_non_veg_autoComplete_text;
    CardView Sandwiches_card_non_veg;
    TextInputLayout Sandwiches_non_veg_quantity_layout;
    Button Sandwiches_non_veg_add_btn;
    ImageView Sandwiches_grilled_star;
    ImageView Sandwiches_veg_grilled_star;
    ImageView Sandwiches_old_school_star;
    ImageView Sandwiches_non_veg_star;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);

        getAllViews();

        Sandwiches_goto_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SandwichActivity.this, FoodCart.class));
                finish();
            }
        });

        Sandwiches_back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SandwichActivity.this, DashBoard.class));
                finish();
            }
        });

        String[] no = {"1","2","3","4","5","6","7","8","9","10"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.sandwiches_drop_down, no);
        Sandwiches_grilled_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Sandwiches_grilled_autoComplete_text.setAdapter(arrayAdapter);


        Sandwiches_veg_grilled_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Sandwiches_veg_grilled_autoComplete_text.setAdapter(arrayAdapter);


        Sandwiches_old_school_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Sandwiches_old_school_autoComplete_text.setAdapter(arrayAdapter);


        Sandwiches_non_veg_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Sandwiches_non_veg_autoComplete_text.setAdapter(arrayAdapter);

    }

    private void getAllViews() {
        Sandwiches_grilled_autoComplete_text = findViewById(R.id.grilled_sandwiches_autocomplete_quantity);
        Sandwiches_back_image = findViewById(R.id.sandwiches_back_image);
        Sandwiches_app_name = findViewById(R.id.sandwiches_logo_name);
        Sandwiches_goto_cart = findViewById(R.id.sandwiches_cart);
        Sandwiches_check1 = findViewById(R.id.sandwiches_online_check);
        Sandwiches_online_opt = findViewById(R.id.sandwiches_online);
        Sandwiches_check2 = findViewById(R.id.sandwiches_dine_in_check);
        Sandwiches_dine_in_opt = findViewById(R.id.sandwiches_dine_in);
        Sandwiches_menu_text = findViewById(R.id.sandwiches_menu_text);
        Sandwiches_card_grilled = findViewById(R.id.sandwiches_grilled_card);
        Sandwiches_grilled_quantity_layout = findViewById(R.id.sandwiches_grilled_quantity_layout);
        Sandwiches_grilled_add_btn = findViewById(R.id.sandwiches_grilled_add_btn);
        Sandwiches_veg_grilled_autoComplete_text = findViewById(R.id.veg_grilled_sandwiches_autocomplete_quantity);
        Sandwiches_card_veg_grilled = findViewById(R.id.sandwiches_veg_grilled_card);
        Sandwiches_veg_grilled_quantity_layout = findViewById(R.id.sandwiches_veg_grilled_quantity_layout);
        Sandwiches_veg_grilled_add_btn = findViewById(R.id.sandwiches_veg_grilled_add_btn);
        Sandwiches_old_school_autoComplete_text = findViewById(R.id.old_school_sandwiches_autocomplete_quantity);
        Sandwiches_card_old_school = findViewById(R.id.sandwiches_old_school_card);
        Sandwiches_old_school_quantity_layout = findViewById(R.id.sandwiches_old_school_quantity_layout);
        Sandwiches_old_school_add_btn = findViewById(R.id.sandwiches_old_school_add_btn);
        Sandwiches_non_veg_autoComplete_text = findViewById(R.id.non_veg_sandwiches_autocomplete_quantity);
        Sandwiches_card_non_veg = findViewById(R.id.sandwiches_non_veg_card);
        Sandwiches_non_veg_quantity_layout = findViewById(R.id.sandwiches_non_veg_quantity_layout);
        Sandwiches_non_veg_add_btn = findViewById(R.id.sandwiches_non_veg_add_btn);
        Sandwiches_grilled_star = findViewById(R.id.sandwiches_grilled_star);
        Sandwiches_veg_grilled_star = findViewById(R.id.sandwiches_veg_grilled_star);
        Sandwiches_old_school_star = findViewById(R.id.sandwiches_old_school_star);
        Sandwiches_non_veg_star = findViewById(R.id.sandwiches_non_veg_star);
    }
}