package com.example.burgofee;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputLayout;

public class DashBoard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final float END_SCALE = 0.7f;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView Dashboard_main_menu_image;
    TextView Dashboard_app_name;
    ImageView Dashboard_profile_image;
    RadioButton Dashboard_check1;
    TextView Dashboard_online_opt;
    RadioButton Dashboard_check2;
    TextView Dashboard_dine_in_opt;
    TextView Dashboard_view_menu;
    CardView Dashboard_sandwiches_card;
    TextView Dashboard_sandwiches_card_text;
    CardView Dashboard_pizza_card;
    TextView Dashboard_pizza_card_text;
    CardView Dashboard_beverage_card;
    TextView Dashboard_beverage_card_text;
    CardView Dashboard_desserts_card;
    TextView Dashboard_desserts_card_text;
    TextView Dashboard_best_seller;
    AutoCompleteTextView Dashboard_margarita_autoComplete_text;
    CardView Dashboard_card_margarita;
    TextInputLayout Dashboard_margarita_quantity_layout;
    Button Dashboard_margarita_add_btn;
    AutoCompleteTextView Dashboard_new_york_autoComplete_text;
    CardView Dashboard_card_new_york;
    TextInputLayout Dashboard_new_york_quantity_layout;
    Button Dashboard_new_york_add_btn;
    AutoCompleteTextView Dashboard_coca_cola_autoComplete_text;
    CardView Dashboard_card_coca_cola;
    TextInputLayout Dashboard_coca_cola_quantity_layout;
    Button Dashboard_coca_cola_add_btn;
    AutoCompleteTextView Dashboard_strawberry_autoComplete_text;
    CardView Dashboard_card_strawberry;
    TextInputLayout Dashboard_strawberry_quantity_layout;
    Button Dashboard_strawberry_add_btn;
    AutoCompleteTextView Dashboard_paneer_autoComplete_text;
    CardView Dashboard_card_paneer;
    TextInputLayout Dashboard_paneer_quantity_layout;
    Button Dashboard_paneer_add_btn;
    AutoCompleteTextView Dashboard_french_fries_autoComplete_text;
    CardView Dashboard_card_french_fries;
    TextInputLayout Dashboard_french_fries_quantity_layout;
    Button Dashboard_french_fries_add_btn;
    ImageView Dashboard_margarita_star;
    ImageView Dashboard_new_york_star;
    ImageView Dashboard_coca_cola_star;
    ImageView Dashboard_strawberry_star;
    ImageView Dashboard_paneer_star;
    ImageView Dashboard_french_fries_star;
    LinearLayout contentValues;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        getAllView();

        Dashboard_desserts_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, DessertActivity.class));
                finish();
            }
        });

        Dashboard_profile_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, ProfileActivity.class));
                finish();
            }
        });

        navigationDrawer();

        Dashboard_sandwiches_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, SandwichActivity.class));
                finish();
            }
        });

        Dashboard_pizza_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, PizzaActivity.class));
                finish();
            }
        });

        Dashboard_beverage_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, BeverageActivity.class));
                finish();
            }
        });

        String[] no = {"1","2","3","4","5","6","7","8","9","10"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.sandwiches_drop_down, no);
        Dashboard_margarita_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Dashboard_margarita_autoComplete_text.setAdapter(arrayAdapter);

        Dashboard_new_york_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Dashboard_new_york_autoComplete_text.setAdapter(arrayAdapter);

        Dashboard_coca_cola_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Dashboard_coca_cola_autoComplete_text.setAdapter(arrayAdapter);

        Dashboard_strawberry_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Dashboard_strawberry_autoComplete_text.setAdapter(arrayAdapter);

        Dashboard_paneer_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Dashboard_paneer_autoComplete_text.setAdapter(arrayAdapter);

        Dashboard_french_fries_autoComplete_text.setText(arrayAdapter.getItem(0).toString(), false);
        Dashboard_french_fries_autoComplete_text.setAdapter(arrayAdapter);
    }

    private void getAllView() {
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        Dashboard_main_menu_image = findViewById(R.id.dashboard_menu);
        Dashboard_app_name = findViewById(R.id.dashboard_logo_name);
        Dashboard_profile_image = findViewById(R.id.dashboard_profile);
        Dashboard_check1 = findViewById(R.id.dashboard_online_check);
        Dashboard_online_opt = findViewById(R.id.dashboard_online);
        Dashboard_check2 = findViewById(R.id.dashboard_dine_in_check);
        Dashboard_dine_in_opt = findViewById(R.id.dashboard_dine_in);
        Dashboard_view_menu = findViewById(R.id.dashboard_view_menu_text);
        Dashboard_sandwiches_card = findViewById(R.id.dashboard_open_card1);
        Dashboard_sandwiches_card_text = findViewById(R.id.dashboard_sandwiches_menu);
        Dashboard_pizza_card = findViewById(R.id.dashboard_open_card2);
        Dashboard_pizza_card_text = findViewById(R.id.dashboard_pizzas_menu);
        Dashboard_beverage_card = findViewById(R.id.dashboard_open_card3);
        Dashboard_beverage_card_text = findViewById(R.id.dashboard_beverage_menu);
        Dashboard_desserts_card = findViewById(R.id.dashboard_open_card4);
        Dashboard_desserts_card_text = findViewById(R.id.dashboard_desserts_menu);
        Dashboard_best_seller = findViewById(R.id.dashboard_best_seller_text);
        Dashboard_margarita_autoComplete_text = findViewById(R.id.margarita_dashboard_autocomplete_quantity);
        Dashboard_card_margarita = findViewById(R.id.dashboard_margarita_card);
        Dashboard_margarita_quantity_layout = findViewById(R.id.dashboard_margarita_quantity_layout);
        Dashboard_margarita_add_btn = findViewById(R.id.dashboard_margarita_add_btn);
        Dashboard_new_york_autoComplete_text = findViewById(R.id.new_york_dashboard_autocomplete_quantity);
        Dashboard_card_new_york = findViewById(R.id.dashboard_new_york_card);
        Dashboard_new_york_quantity_layout = findViewById(R.id.dashboard_new_york_quantity_layout);
        Dashboard_new_york_add_btn = findViewById(R.id.dashboard_new_york_add_btn);
        Dashboard_coca_cola_autoComplete_text = findViewById(R.id.coca_cola_dashboard_autocomplete_quantity);
        Dashboard_card_coca_cola = findViewById(R.id.dashboard_coca_cola_card);
        Dashboard_coca_cola_quantity_layout = findViewById(R.id.dashboard_coca_cola_quantity_layout);
        Dashboard_coca_cola_add_btn = findViewById(R.id.dashboard_coca_cola_add_btn);
        Dashboard_strawberry_autoComplete_text = findViewById(R.id.strawberry_dashboard_autocomplete_quantity);
        Dashboard_card_strawberry = findViewById(R.id.dashboard_strawberry_card);
        Dashboard_strawberry_quantity_layout = findViewById(R.id.dashboard_strawberry_quantity_layout);
        Dashboard_strawberry_add_btn = findViewById(R.id.dashboard_strawberry_add_btn);
        Dashboard_paneer_autoComplete_text = findViewById(R.id.paneer_dashboard_autocomplete_quantity);
        Dashboard_card_paneer = findViewById(R.id.dashboard_paneer_card);
        Dashboard_paneer_quantity_layout = findViewById(R.id.dashboard_paneer_quantity_layout);
        Dashboard_paneer_add_btn = findViewById(R.id.dashboard_paneer_add_btn);
        Dashboard_french_fries_autoComplete_text = findViewById(R.id.french_fries_dashboard_autocomplete_quantity);
        Dashboard_card_french_fries = findViewById(R.id.dashboard_french_fries_card);
        Dashboard_french_fries_quantity_layout = findViewById(R.id.dashboard_french_fries_quantity_layout);
        Dashboard_french_fries_add_btn = findViewById(R.id.dashboard_french_fries_add_btn);
        Dashboard_margarita_star = findViewById(R.id.dashboard_margarita_star);
        Dashboard_new_york_star = findViewById(R.id.dashboard_new_york_star);
        Dashboard_coca_cola_star = findViewById(R.id.dashboard_coca_cola_star);
        Dashboard_strawberry_star = findViewById(R.id.dashboard_strawberry_star);
        Dashboard_paneer_star = findViewById(R.id.dashboard_paneer_star);
        Dashboard_french_fries_star = findViewById(R.id.dashboard_french_fries_star);
        contentValues = findViewById(R.id.dashboard_slide_layout);
    }

    private void navigationDrawer() {

        //Navigation Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        Dashboard_main_menu_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {

        //Add any color or remove it to use the default one!
        //To make it transparent use Color.Transparent in side setScrimColor();
        //drawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                // Scale the View based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentValues.setScaleX(offsetScale);
                contentValues.setScaleY(offsetScale);

                // Translate the View, accounting for the scaled width
                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentValues.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentValues.setTranslationX(xTranslation);
            }
        });

    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}