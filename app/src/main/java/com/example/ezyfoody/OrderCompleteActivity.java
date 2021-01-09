package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderCompleteActivity extends AppCompatActivity {
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);

        button4 = (Button) findViewById(R.id.buttonMainMenu);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivty();
            }
        });
    }


    public void openMainActivty(){
        Intent intent5 = new Intent(this, MainActivity.class);
        startActivity(intent5);
    }
}