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

public class BeverageActivity extends AppCompatActivity {

    AutoCompleteTextView Beverage_cappuccino_autoComplete_text;
    ImageView Beverage_back_image;
    TextView Beverage_app_name;
    ImageView Beverage_goto_cart;
    RadioButton Beverage_check1;
    TextView Beverage_online_opt;
    RadioButton Beverage_check2;
    TextView Beverage_dine_in_opt;
    TextView Beverage_menu_text;
    CardView Beverage_card_cappuccino;
    TextInputLayout Beverage_cappuccino_quantity_layout;
    Button Beverage_cappuccino_add_btn;
    AutoCompleteTextView Beverage_blue_lagoon_cocktail_autoComplete_text;
    CardView Beverage_card_blue_lagoon_cocktail;
    TextInputLayout Beverage_blue_lagoon_cocktail_quantity_layout;
    Button Beverage_blue_lagoon_cocktail_add_btn;
    AutoCompleteTextView Beverage_coca_cola_autoComplete_text;
    CardView Beverage_card_coca_cola;
    TextInputLayout Beverage_coca_cola_quantity_layout;
    Button Beverage_coca_cola_add_btn;
    AutoCompleteTextView Beverage_pepsi_autoComplete_text;
    CardView Beverage_card_pepsi;
    TextInputLayout Beverage_pepsi_quantity_layout;
    Button Beverage_pepsi_add_btn;
    AutoCompleteTextView Beverage_rirri_juice_autoComplete_text;
    CardView Beverage_rirri_juice_capsicum;
    TextInputLayout Beverage_rirri_juice_quantity_layout;
    Button Beverage_rirri_juice_add_btn;
    AutoCompleteTextView Beverage_orange_cocktail_autoComplete_text;
    CardView Beverage_orange_cocktail_capsicum;
    TextInputLayout Beverage_orange_cocktail_quantity_layout;
    Button Beverage_orange_cocktail_add_btn;
    AutoCompleteTextView Beverage_lemon_water_autoComplete_text;
    CardView Beverage_lemon_water_capsicum;
    TextInputLayout Beverage_lemon_water_quantity_layout;
    Button Beverage_lemon_water_add_btn;
    ImageView Beverage_cappuccino_star;
    ImageView Beverage_blue_lagoon_cocktail_star;
    ImageView Beverage_coca_cola_star;
    ImageView Beverage_pepsi_star;
    ImageView Beverage_rirri_juice_star;
    ImageView Beverage_orange_cocktail_star;
    ImageView Beverage_lemon_water_star;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage);

        getAllViewsBeverages();

        Beverage_goto_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BeverageActivity.this, FoodCart.class));
                finish();
            }
        });

        Beverage_back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BeverageActivity.this, DashBoard.class));
                finish();
            }
        });

        String[] no = {"1","2","3","4","5","6","7","8","9","10"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.sandwiches_drop_down, no);
        Beverage_cappuccino_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Beverage_cappuccino_autoComplete_text.setAdapter(arrayAdapter);


        Beverage_blue_lagoon_cocktail_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Beverage_blue_lagoon_cocktail_autoComplete_text.setAdapter(arrayAdapter);


        Beverage_coca_cola_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Beverage_coca_cola_autoComplete_text.setAdapter(arrayAdapter);


        Beverage_pepsi_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Beverage_pepsi_autoComplete_text.setAdapter(arrayAdapter);

        Beverage_rirri_juice_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Beverage_rirri_juice_autoComplete_text.setAdapter(arrayAdapter);

        Beverage_orange_cocktail_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Beverage_orange_cocktail_autoComplete_text.setAdapter(arrayAdapter);

        Beverage_lemon_water_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Beverage_lemon_water_autoComplete_text.setAdapter(arrayAdapter);
    }

    private void getAllViewsBeverages() {
        Beverage_cappuccino_autoComplete_text = findViewById(R.id.cappuccino_beverage_autocomplete_quantity);
        Beverage_back_image = findViewById(R.id.beverage_back_image);
        Beverage_app_name = findViewById(R.id.beverage_logo_name);
        Beverage_goto_cart = findViewById(R.id.beverage_cart);
        Beverage_check1 = findViewById(R.id.beverage_online_check);
        Beverage_online_opt = findViewById(R.id.beverage_online);
        Beverage_check2 = findViewById(R.id.beverage_dine_in_check);
        Beverage_dine_in_opt = findViewById(R.id.beverage_dine_in);
        Beverage_menu_text = findViewById(R.id.beverage_menu_text);
        Beverage_card_cappuccino = findViewById(R.id.beverage_cappuccino_card);
        Beverage_cappuccino_quantity_layout = findViewById(R.id.beverage_cappuccino_quantity_layout);
        Beverage_cappuccino_add_btn = findViewById(R.id.beverage_cappuccino_add_btn);
        Beverage_blue_lagoon_cocktail_autoComplete_text = findViewById(R.id.blue_lagoon_cocktail_beverage_autocomplete_quantity);
        Beverage_card_blue_lagoon_cocktail = findViewById(R.id.beverage_blue_lagoon_cocktail_card);
        Beverage_blue_lagoon_cocktail_quantity_layout = findViewById(R.id.beverage_blue_lagoon_cocktail_quantity_layout);
        Beverage_blue_lagoon_cocktail_add_btn = findViewById(R.id.beverage_blue_lagoon_cocktail_add_btn);
        Beverage_coca_cola_autoComplete_text = findViewById(R.id.coca_cola_beverage_autocomplete_quantity);
        Beverage_card_coca_cola = findViewById(R.id.beverage_coca_cola_card);
        Beverage_coca_cola_quantity_layout = findViewById(R.id.beverage_coca_cola_quantity_layout);
        Beverage_coca_cola_add_btn = findViewById(R.id.beverage_coca_cola_add_btn);
        Beverage_pepsi_autoComplete_text = findViewById(R.id.pepsi_beverage_autocomplete_quantity);
        Beverage_card_pepsi = findViewById(R.id.beverage_pepsi_card);
        Beverage_pepsi_quantity_layout = findViewById(R.id.beverage_pepsi_quantity_layout);
        Beverage_pepsi_add_btn = findViewById(R.id.beverage_pepsi_add_btn);
        Beverage_rirri_juice_autoComplete_text = findViewById(R.id.rirri_juice_beverage_autocomplete_quantity);
        Beverage_rirri_juice_capsicum = findViewById(R.id.beverage_rirri_juice_card);
        Beverage_rirri_juice_quantity_layout = findViewById(R.id.beverage_rirri_juice_quantity_layout);
        Beverage_rirri_juice_add_btn = findViewById(R.id.beverage_rirri_juice_add_btn);
        Beverage_orange_cocktail_autoComplete_text = findViewById(R.id.orange_cocktail_beverage_autocomplete_quantity);
        Beverage_orange_cocktail_capsicum = findViewById(R.id.beverage_orange_cocktail_card);
        Beverage_orange_cocktail_quantity_layout = findViewById(R.id.beverage_orange_cocktail_quantity_layout);
        Beverage_orange_cocktail_add_btn = findViewById(R.id.beverage_orange_cocktail_add_btn);
        Beverage_lemon_water_autoComplete_text = findViewById(R.id.lemon_water_beverage_autocomplete_quantity);
        Beverage_lemon_water_capsicum = findViewById(R.id.beverage_lemon_water_card);
        Beverage_lemon_water_quantity_layout = findViewById(R.id.beverage_lemon_water_quantity_layout);
        Beverage_lemon_water_add_btn = findViewById(R.id.beverage_lemon_water_add_btn);
        Beverage_cappuccino_star = findViewById(R.id.beverage_cappuccino_star);
        Beverage_blue_lagoon_cocktail_star = findViewById(R.id.beverage_blue_lagoon_cocktail_star);
        Beverage_coca_cola_star = findViewById(R.id.beverage_coca_cola_star);
        Beverage_pepsi_star = findViewById(R.id.beverage_pepsi_star);
        Beverage_rirri_juice_star = findViewById(R.id.beverage_rirri_juice_star);
        Beverage_orange_cocktail_star = findViewById(R.id.beverage_orange_cocktail_star);
        Beverage_lemon_water_star = findViewById(R.id.beverage_lemon_water_star);
    }
}