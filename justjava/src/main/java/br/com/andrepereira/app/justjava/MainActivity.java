package br.com.andrepereira.app.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitOrder(View view){
        String priceMessage = "$" + quantity*5 + "\nThank you!" ;
        displayMessage(priceMessage);

    }

    public void increment(View view){
        quantity++;
        display(quantity);

    }

    public void decrement(View view){
        quantity--;
        display(quantity);
    }



    public void display(int numberOfCoffees){

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);

    }


    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("" + message);
    }


}
