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

public class PizzaActivity extends AppCompatActivity {

    AutoCompleteTextView Pizza_margarita_autoComplete_text;
    ImageView Pizza_back_image;
    TextView Pizza_app_name;
    ImageView Pizza_goto_cart;
    RadioButton Pizza_check1;
    TextView Pizza_online_opt;
    RadioButton Pizza_check2;
    TextView Pizza_dine_in_opt;
    TextView Pizza_menu_text;
    CardView Pizza_card_margarita;
    TextInputLayout Pizza_margarita_quantity_layout;
    Button Pizza_margarita_add_btn;
    AutoCompleteTextView Pizza_new_york_autoComplete_text;
    CardView Pizza_card_new_york;
    TextInputLayout Pizza_new_york_quantity_layout;
    Button Pizza_new_york_add_btn;
    AutoCompleteTextView Pizza_non_veg_autoComplete_text;
    CardView Pizza_card_non_veg;
    TextInputLayout Pizza_non_veg_quantity_layout;
    Button Pizza_non_veg_add_btn;
    AutoCompleteTextView Pizza_onion_capsicum_autoComplete_text;
    CardView Pizza_card_onion_capsicum;
    TextInputLayout Pizza_onion_capsicum_quantity_layout;
    Button Pizza_onion_capsicum_add_btn;
    AutoCompleteTextView Pizza_corn_autoComplete_text;
    CardView Pizza_corn_capsicum;
    TextInputLayout Pizza_corn_quantity_layout;
    Button Pizza_corn_add_btn;
    ImageView Pizza_margarita_star;
    ImageView Pizza_new_york_star;
    ImageView Pizza_non_veg_star;
    ImageView Pizza_onion_Capsicum_star;
    ImageView Pizza_corn_star;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        getAllViewsPizza();

        Pizza_goto_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PizzaActivity.this, FoodCart.class));
                finish();
            }
        });

        Pizza_back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PizzaActivity.this, DashBoard.class));
                finish();
            }
        });

        String[] no = {"1","2","3","4","5","6","7","8","9","10"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.sandwiches_drop_down, no);
        Pizza_margarita_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Pizza_margarita_autoComplete_text.setAdapter(arrayAdapter);


        Pizza_new_york_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Pizza_new_york_autoComplete_text.setAdapter(arrayAdapter);


        Pizza_non_veg_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Pizza_non_veg_autoComplete_text.setAdapter(arrayAdapter);


        Pizza_onion_capsicum_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Pizza_onion_capsicum_autoComplete_text.setAdapter(arrayAdapter);

        Pizza_corn_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Pizza_corn_autoComplete_text.setAdapter(arrayAdapter);
    }

    private void getAllViewsPizza() {
        Pizza_margarita_autoComplete_text = findViewById(R.id.margarita_pizza_autocomplete_quantity);
        Pizza_back_image = findViewById(R.id.pizza_back_image);
        Pizza_app_name = findViewById(R.id.pizza_logo_name);
        Pizza_goto_cart = findViewById(R.id.pizza_cart);
        Pizza_check1 = findViewById(R.id.pizza_online_check);
        Pizza_online_opt = findViewById(R.id.pizza_online);
        Pizza_check2 = findViewById(R.id.pizza_dine_in_check);
        Pizza_dine_in_opt = findViewById(R.id.pizza_dine_in);
        Pizza_menu_text = findViewById(R.id.pizza_menu_text);
        Pizza_card_margarita = findViewById(R.id.pizza_margarita_card);
        Pizza_margarita_quantity_layout = findViewById(R.id.pizza_margarita_quantity_layout);
        Pizza_margarita_add_btn = findViewById(R.id.pizza_margarita_add_btn);
        Pizza_new_york_autoComplete_text = findViewById(R.id.new_york_pizza_autocomplete_quantity);
        Pizza_card_new_york = findViewById(R.id.pizza_new_york_card);
        Pizza_new_york_quantity_layout = findViewById(R.id.pizza_new_york_quantity_layout);
        Pizza_new_york_add_btn = findViewById(R.id.pizza_new_york_add_btn);
        Pizza_non_veg_autoComplete_text = findViewById(R.id.nonVeg_pizza_autocomplete_quantity);
        Pizza_card_non_veg = findViewById(R.id.pizza_nonVeg_card);
        Pizza_non_veg_quantity_layout = findViewById(R.id.pizza_nonVeg_quantity_layout);
        Pizza_non_veg_add_btn = findViewById(R.id.pizza_nonVeg_add_btn);
        Pizza_onion_capsicum_autoComplete_text = findViewById(R.id.onion_capsicum_pizza_autocomplete_quantity);
        Pizza_card_onion_capsicum = findViewById(R.id.pizza_onion_capsicum_card);
        Pizza_onion_capsicum_quantity_layout = findViewById(R.id.pizza_onion_capsicum_quantity_layout);
        Pizza_onion_capsicum_add_btn = findViewById(R.id.pizza_onion_capsicum_add_btn);
        Pizza_corn_autoComplete_text = findViewById(R.id.corn_pizza_autocomplete_quantity);
        Pizza_corn_capsicum = findViewById(R.id.pizza_corn_card);
        Pizza_corn_quantity_layout = findViewById(R.id.pizza_corn_quantity_layout);
        Pizza_corn_add_btn = findViewById(R.id.pizza_corn_add_btn);
        Pizza_margarita_star = findViewById(R.id.pizza_margarita_star);
        Pizza_new_york_star = findViewById(R.id.pizza_new_york_star);
        Pizza_non_veg_star = findViewById(R.id.pizza_nonVeg_star);
        Pizza_onion_Capsicum_star = findViewById(R.id.pizza_onion_capsicum_star);
        Pizza_corn_star = findViewById(R.id.pizza_corn_star);
    }
}