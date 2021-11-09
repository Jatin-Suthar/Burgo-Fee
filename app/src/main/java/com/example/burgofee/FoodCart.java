package com.example.burgofee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.TimeoutException;

public class FoodCart extends AppCompatActivity {

    ImageView Cart_food_image;
    ImageView Cart_ordered_image;
    ImageView Cart_pin;
    TextView Cart_hotel_name;
    TextView Cart_hotel_address;
    TextView Cart_food_name;
    TextView Cart_food_quantity;
    TextView Cart_food_price;
    TextView Cart_person_location;
    TextView Cart_person_pinCode;
    TextView Cart_address_button;
    CheckBox OptedForNoContactCheck;
    TextView NoContactText;
    TextView NoContactDesc;
    ImageView Cart_coupon;
    TextView Apply_coupon;
    ImageView Open_coupon;
    TextView Bill_details;
    TextView Cart_food_amount_text;
    TextView Cart_food1_amount;
    TextView Cart_Delivery_tip_text;
    TextView Cart_Delivery_tip;
    TextView Cart_tax_text;
    TextView Cart_tax;
    TextView Cart_Total_to_pay_text;
    TextView Cart_Total_to_pay;
    ImageView Cart_order_info_image;
    TextView Cart_order_info_text;
    TextView Cart_order_info_desc;
    TextView Cart_OverView;
    TextView Cart_Policy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_cart);

        getView();
    }

    private void getView() {
        Cart_food_image = findViewById(R.id.cart_food_image);
        Cart_ordered_image = findViewById(R.id.cart_food_ordered_image);
        Cart_pin = findViewById(R.id.car_pin_point);
        Cart_hotel_name = findViewById(R.id.cart_shop_name);
        Cart_hotel_address = findViewById(R.id.cart_shop_address);
        Cart_food_name = findViewById(R.id.cart_food_ordered);
        Cart_food_quantity = findViewById(R.id.cart_food_ordered_amount);
        Cart_food_price = findViewById(R.id.cart_food_ordered_price);
        Cart_person_location = findViewById(R.id.cart_address);
        Cart_person_pinCode = findViewById(R.id.cart_pinCode);
        Cart_address_button = findViewById(R.id.cart_add_address_btn);
        OptedForNoContactCheck  = findViewById(R.id.cart_checkbox);
        NoContactText = findViewById(R.id.cart_no_contact_title);
        NoContactDesc = findViewById(R.id.cart_no_contact_desc);
        Cart_coupon = findViewById(R.id.cart_coupon_image);
        Apply_coupon = findViewById(R.id.cart_apply_coupon);
        Open_coupon = findViewById(R.id.cart_open_coupon);
        Cart_order_info_image = findViewById(R.id.cart_order_info);
        Cart_order_info_text = findViewById(R.id.cart_order_info_text);
        Cart_order_info_desc = findViewById(R.id.cart_order_desc);
        Cart_OverView = findViewById(R.id.cart_overview);
        Cart_Policy = findViewById(R.id.cart_policy);
    }
}