package com.nicholasward.reckers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CartPreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_preview);
    }

    /**
     * return to menu to add another item to order
     * @param view
     */
    public void continueOrderingClicked(View view) {
        // add purchase to list of user's active orders


        // transition to MenuActivity
        Intent menuIntent = new Intent(CartPreviewActivity.this, MenuActivity.class);
        startActivity(menuIntent);
    }

    /**
     * proceed to the CheckoutActivity to confirm time and payment
     * @param view
     */
    public void proceedToCheckoutClicked(View view) {
        // add purchase to list of user's active orders


        // transition to active orders page
        Intent checkoutIntent = new Intent(CartPreviewActivity.this, CheckoutActivity.class);
        startActivity(checkoutIntent);
    }
}
