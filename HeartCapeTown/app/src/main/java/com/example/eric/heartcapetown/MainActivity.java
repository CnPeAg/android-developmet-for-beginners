package com.example.eric.heartcapetown;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the information category
        TextView information = (TextView) findViewById(R.id.information);

        // Set a click listener on that View
        information.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent informationIntent = new Intent(MainActivity.this, InformationActivity.class);

                // Start the new activity
                startActivity(informationIntent);
            }
    });

        // Find the View that shows the nature category
        TextView nature = (TextView) findViewById(R.id.nature);

        // Set a click listener on that View
        nature.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);

                // Start the new activity
                startActivity(natureIntent);
            }
        });

        // Find the View that shows the nightlife category
        TextView nightlife = (TextView) findViewById(R.id.nightlife);

        // Set a click listener on that View
        nightlife.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent nightlifeIntent = new Intent(MainActivity.this, NightlifeActivity.class);

                // Start the new activity
                startActivity(nightlifeIntent);
            }
        });

        // Find the View that shows the eat and drink category
        TextView eatAndDrink = (TextView) findViewById(R.id.eat_and_drink);

        // Set a click listener on that View
        eatAndDrink.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent eatAndDrinkIntent = new Intent(MainActivity.this, EatAndDrinkActivity.class);

                // Start the new activity
                startActivity(eatAndDrinkIntent);
            }
        });
}}
