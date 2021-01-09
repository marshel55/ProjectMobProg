package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopUpActivity extends AppCompatActivity {
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);

        button6 = (Button) findViewById(R.id.buttonOk);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompleteTopUp();
            }
        });
    }

    public void openCompleteTopUp(){
        Intent intent5 = new Intent(this, CompleteTopUp.class);
        startActivity(intent5);
    }
}