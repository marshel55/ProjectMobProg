package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button4;
    private Button button5;
    private Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonDrinks);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrinks_Activity();
            }
        });

        button4 = (Button) findViewById(R.id.buttonMyOrder);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyOrderActivity();
            }
        });

        button5 = (Button) findViewById(R.id.buttonTopup);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTopUpActivity();
            }
        });

        button8 = (Button) findViewById(R.id.buttonmaps);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity2();
            }
        });
    }

    public void openDrinks_Activity(){
        Intent intent2 = new Intent(this, Drinks_Activity.class);
        startActivity(intent2);
    }

    public void openMyOrderActivity(){
        Intent intent3 = new Intent(this, MyOrderActivity.class);
        startActivity(intent3);
    }

    public void openTopUpActivity(){
        Intent intent4 = new Intent(this, TopUpActivity.class);
        startActivity(intent4);
    }

    public void openMapsActivity2(){
        Intent intent8 = new Intent(this, MapsActivity2.class);
        startActivity(intent8);
    }
}