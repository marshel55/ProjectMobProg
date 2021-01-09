package com.example.ezyfoody;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1[], data2[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String st1[], String st2[], int img[]){
        context = ct;
        data1 = st1;
        data2 = st2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mytext1.setText(data1[position]);
        holder.mytext2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);

        holder.layoutMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(context, OrderActivty.class);
                intent3.putExtra("data1", data1[position]);
                intent3.putExtra("data2", data2[position]);
                intent3.putExtra("myImage", images[position]);
                context.startActivity(intent3);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mytext1, mytext2;
        ImageView myImage;
        ConstraintLayout layoutMain;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mytext1 = itemView.findViewById(R.id.mytext1);
            mytext2 = itemView.findViewById(R.id.mytext2);
            myImage = itemView.findViewById(R.id.myImage);
            layoutMain = itemView.findViewById(R.id.layoutmain);
        }
    }
}
