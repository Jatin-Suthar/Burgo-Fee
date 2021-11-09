package com.example.burgofee;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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

public class DessertActivity extends AppCompatActivity {

    AutoCompleteTextView Desserts_choco_roll_autoComplete_text;
    ImageView Desserts_back_image;
    TextView Desserts_app_name;
    ImageView Desserts_goto_cart;
    RadioButton Desserts_check1;
    TextView Desserts_online_opt;
    RadioButton Desserts_check2;
    TextView Desserts_dine_in_opt;
    TextView Desserts_menu_text;
    CardView Desserts_card_choco_roll;
    TextInputLayout Desserts_choco_roll_quantity_layout;
    Button Desserts_choco_roll_add_btn;
    AutoCompleteTextView Desserts_oreo_autoComplete_text;
    CardView Desserts_card_oreo;
    TextInputLayout Desserts_oreo_quantity_layout;
    Button Desserts_oreo_add_btn;
    AutoCompleteTextView Desserts_pancake_autoComplete_text;
    CardView Desserts_card_pancake;
    TextInputLayout Desserts_pancake_quantity_layout;
    Button Desserts_pancake_add_btn;
    AutoCompleteTextView Desserts_strawberry_autoComplete_text;
    CardView Desserts_card_strawberry;
    TextInputLayout Desserts_strawberry_quantity_layout;
    Button Desserts_strawberry_add_btn;
    AutoCompleteTextView Desserts_vanilla_autoComplete_text;
    CardView Desserts_vanilla_capsicum;
    TextInputLayout Desserts_vanilla_quantity_layout;
    Button Desserts_vanilla_add_btn;
    ImageView Desserts_choco_roll_star;
    ImageView Desserts_oreo_star;
    ImageView Desserts_pancake_star;
    ImageView Desserts_strawberry_star;
    ImageView Desserts_vanilla_star;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        getAllViewsDesserts();

        Desserts_goto_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DessertActivity.this, FoodCart.class));
                finish();
            }
        });

        Desserts_back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DessertActivity.this, DashBoard.class));
                finish();
            }
        });

        String[] no = {"1","2","3","4","5","6","7","8","9","10"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.sandwiches_drop_down, no);
        Desserts_choco_roll_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Desserts_choco_roll_autoComplete_text.setAdapter(arrayAdapter);


        Desserts_oreo_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Desserts_oreo_autoComplete_text.setAdapter(arrayAdapter);


        Desserts_pancake_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Desserts_pancake_autoComplete_text.setAdapter(arrayAdapter);


        Desserts_strawberry_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Desserts_strawberry_autoComplete_text.setAdapter(arrayAdapter);

        Desserts_vanilla_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Desserts_vanilla_autoComplete_text.setAdapter(arrayAdapter);
    }

    private void getAllViewsDesserts() {
        Desserts_choco_roll_autoComplete_text = findViewById(R.id.choco_roll_desserts_autocomplete_quantity);
        Desserts_back_image = findViewById(R.id.desserts_back_image);
        Desserts_app_name = findViewById(R.id.desserts_logo_name);
        Desserts_goto_cart = findViewById(R.id.desserts_cart);
        Desserts_check1 = findViewById(R.id.desserts_online_check);
        Desserts_online_opt = findViewById(R.id.desserts_online);
        Desserts_check2 = findViewById(R.id.desserts_dine_in_check);
        Desserts_dine_in_opt = findViewById(R.id.desserts_dine_in);
        Desserts_menu_text = findViewById(R.id.desserts_menu_text);
        Desserts_card_choco_roll = findViewById(R.id.desserts_choco_roll_card);
        Desserts_choco_roll_quantity_layout = findViewById(R.id.desserts_choco_roll_quantity_layout);
        Desserts_choco_roll_add_btn = findViewById(R.id.desserts_choco_roll_add_btn);
        Desserts_oreo_autoComplete_text = findViewById(R.id.oreo_desserts_autocomplete_quantity);
        Desserts_card_oreo = findViewById(R.id.desserts_oreo_card);
        Desserts_oreo_quantity_layout = findViewById(R.id.desserts_oreo_quantity_layout);
        Desserts_oreo_add_btn = findViewById(R.id.desserts_oreo_add_btn);
        Desserts_pancake_autoComplete_text = findViewById(R.id.pancake_desserts_autocomplete_quantity);
        Desserts_card_pancake = findViewById(R.id.desserts_pancake_card);
        Desserts_pancake_quantity_layout = findViewById(R.id.desserts_pancake_quantity_layout);
        Desserts_pancake_add_btn = findViewById(R.id.desserts_pancake_add_btn);
        Desserts_strawberry_autoComplete_text = findViewById(R.id.strawberry_desserts_autocomplete_quantity);
        Desserts_card_strawberry = findViewById(R.id.desserts_strawberry_card);
        Desserts_strawberry_quantity_layout = findViewById(R.id.desserts_strawberry_quantity_layout);
        Desserts_strawberry_add_btn = findViewById(R.id.desserts_strawberry_add_btn);
        Desserts_vanilla_autoComplete_text = findViewById(R.id.vanilla_desserts_autocomplete_quantity);
        Desserts_vanilla_capsicum = findViewById(R.id.desserts_vanilla_card);
        Desserts_vanilla_quantity_layout = findViewById(R.id.desserts_vanilla_quantity_layout);
        Desserts_vanilla_add_btn = findViewById(R.id.desserts_vanilla_add_btn);
        Desserts_choco_roll_star = findViewById(R.id.desserts_choco_roll_star);
        Desserts_oreo_star = findViewById(R.id.desserts_oreo_star);
        Desserts_pancake_star = findViewById(R.id.desserts_pancake_star);
        Desserts_strawberry_star = findViewById(R.id.desserts_strawberry_star);
        Desserts_vanilla_star = findViewById(R.id.desserts_vanilla_star);
    }
}