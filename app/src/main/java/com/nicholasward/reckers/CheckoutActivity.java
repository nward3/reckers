package com.nicholasward.reckers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.nicholasward.reckers.R.id.confirm_purchase_button;
import static com.nicholasward.reckers.R.id.pizzas;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }

    /**
     * sets the order's pickup time based on the selected radio button
     * @param view
     */
    public void onTimeRadioButtonClicked(View view) {
        // check if a time has been specified
        boolean checked = ((RadioButton) view).isChecked();

        // determine which time option was clicked
        switch (view.getId()) {
            case R.id.time_immediately:
                if (checked) {
                    // set time to now

                }
                break;
            case R.id.set_a_time:
                if (checked) {
                    // set time to specified time
                }
                break;
        }
    }

    /**
     * sets the order's payment method based on the selected radio button
     * @param view
     */
    public void onPaymentRadioButtonClicked(View view) {
        // check if a payment method has been specified
        boolean checked = ((RadioButton) view).isChecked();

        // determine which payment method was clicked
        switch (view.getId()) {
            case R.id.flex_points_payment:
                if (checked) {
                    // set payment method to flex points
                }
                break;
            case R.id.domer_dollars_payment:
                if (checked) {
                    // set payment method to domer dollars
                }
                break;
            case R.id.credit_debit_payment:
                if (checked) {
                    // set payment method to credit/debit card
                }
                break;
        }
    }

    /**
     * confirms the purchase of the order
     * @param view
     */
    public void confirmPurchase(View view) {
        // add purchase to list of user's active orders

        
        // transition to active orders page
        Intent activeOrdersIntent = new Intent(CheckoutActivity.this, ActiveOrdersActivity.class);

        // start the new activity
        startActivity(activeOrdersIntent);
    }
}
