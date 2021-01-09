package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompleteTopUp extends AppCompatActivity {
    private Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_top_up);

        button7 = (Button) findViewById(R.id.buttonLastOk);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivty();
            }
        });
    }

    public void openMainActivty(){
        Intent intent7 = new Intent(this, MainActivity.class);
        startActivity(intent7);
    }
}