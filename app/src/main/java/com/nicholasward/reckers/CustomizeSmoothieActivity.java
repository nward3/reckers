package com.nicholasward.reckers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class CustomizeSmoothieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_smoothie);
    }

    /**
     * determine the size of the smoothie
     * @param view
     */
    public void onSizeRadioButtonClicked(View view) {
        // check if a payment method has been specified
        boolean checked = ((RadioButton) view).isChecked();

        // determine which payment method was clicked
        switch (view.getId()) {
            case R.id.size_regular:
                if (checked) {
                    // set payment method to flex points
                }
                break;
            case R.id.size_large:
                if (checked) {
                    // set payment method to domer dollars
                }
                break;
        }
    }

    /**
     * adds the current item to the cart
     * @param view
     */
    public void addToCart(View view) {
        // add item to the user's cart


        // transition to CartPreview activity
        Intent cartPreviewIntent = new Intent(CustomizeSmoothieActivity.this, CartPreviewActivity.class);

        // start the new activity
        startActivity(cartPreviewIntent);
    }
}
