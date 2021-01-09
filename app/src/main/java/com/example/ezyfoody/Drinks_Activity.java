package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drinks_Activity extends AppCompatActivity {
    RecyclerView recycleView;
    private Button button5;

    String st1[], st2[];
    int images[] = {R.drawable.airmineral, R.drawable.jusapel, R.drawable.jusmangga, R.drawable.jusalpukat, R.drawable.jusmelon, R.drawable.jussemangka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_);

        recycleView = findViewById(R.id.recycleView);

        st1 = getResources().getStringArray(R.array.DrinksName);
        st2 = getResources().getStringArray(R.array.DrinksPrice);


        MyAdapter myAdapter = new MyAdapter(this, st1, st2, images);
        recycleView.setAdapter(myAdapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));

        button5 = (Button) findViewById(R.id.buttonMyOrder);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyOrderActivity();
            }
        });
    }

    public void openMyOrderActivity(){
        Intent intent3 = new Intent(this, MyOrderActivity.class);
        startActivity(intent3);
    }
}