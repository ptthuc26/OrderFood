package com.example.oderfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OderFood extends AppCompatActivity {
    TextView tvNumberFood, tvPrice, tvThanks, tvNumberAFood;
    Button btnOrder;
    ImageButton btnShopping;
    RecyclerView rvListFood;
    List<Food> foods;
    AdapterFood adapterFood;
    public int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_food);
        setTitle("Order Food");

        tvNumberFood = findViewById(R.id.tvNumberFood);
        tvPrice = findViewById(R.id.tvPrice);
        tvThanks = findViewById(R.id.tvThanks);
        tvNumberAFood = findViewById(R.id.tvNumberAFood);

        rvListFood = findViewById(R.id.rvlistFood);
        foods = new ArrayList<>();

        foods.add(new Food("Pizza Panda","10$",0));
        foods.add(new Food("KFC Super","10$",0));
        foods.add(new Food("Bread Eggs","10$",0));
        foods.add(new Food("Coca Cola","10$",0));
        foods.add(new Food("Chicken Super","10$",0));
        foods.add(new Food("Cup Cake","10$",0));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),
                RecyclerView.VERTICAL,false);
        rvListFood.setLayoutManager(layoutManager);
        adapterFood = new AdapterFood(foods);

        adapterFood.setiOnClickFood(new IOnClickFood() {
            @Override
            public void OnClickFood(String food) {
                index++;
                tvNumberFood.setText(String.valueOf(index));
                tvPrice.setText(String.valueOf(10*index + "$"));
            }
        });
        rvListFood.setAdapter(adapterFood);



        btnOrder = findViewById(R.id.btnOder);
        btnShopping = findViewById(R.id.btnShopping);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvThanks.setText("Thank you! Your order is sent to restaurant");
            }
        });
        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OderFood.this,YourOrder.class);
                startActivity(intent);
            }
        });
    }
}
