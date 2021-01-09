package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivty extends AppCompatActivity {
    ImageView imageView1;
    TextView Menu1, Price1;
    private Button button1;
    private Button button2;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_activty);

        imageView1 = findViewById(R.id.imageView1);
        Menu1 = findViewById(R.id.Menu1);
        Price1 = findViewById(R.id.Price1);

        getData();
        setData();

        button1 = (Button) findViewById(R.id.buttonOrdermore);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrinks_Activity();
            }
        });

        button2 = (Button) findViewById(R.id.buttonOrder);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyOrderActivity();
            }
        });
    }

    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);
        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        Menu1.setText(data1);
        Price1.setText(data2);
        imageView1.setImageResource(myImage);
    }

    public void openDrinks_Activity(){
        Intent intent2 = new Intent(this, Drinks_Activity.class);
        startActivity(intent2);
    }

    public void openMyOrderActivity(){
        Intent intent3 = new Intent(this, MyOrderActivity.class);
        startActivity(intent3);
    }
}