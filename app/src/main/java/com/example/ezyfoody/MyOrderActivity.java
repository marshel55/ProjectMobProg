package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyOrderActivity extends AppCompatActivity {
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        button3 = (Button) findViewById(R.id.buttonPay);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderCompleteActivity();
            }
        });
    }

    public void openOrderCompleteActivity(){
        Intent intent4 = new Intent(this, OrderCompleteActivity.class);
        startActivity(intent4);
    }
}