package com.example.oderfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterFood extends RecyclerView.Adapter<AdapterFood.ViewHolder> {

    List<Food> foods;
    IOnClickFood iOnClickFood;

    public AdapterFood(List<Food> foods) {
        this.foods = foods;
    }

    public void setiOnClickFood(IOnClickFood iOnClickFood) {
        this.iOnClickFood = iOnClickFood;
    }

    @NonNull
    @Override
    public AdapterFood.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.rvlistfood,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFood.ViewHolder holder, int position) {
        final Food food = foods.get(position);

        holder.tvNameFood.setText(food.getNameFood());
         holder.tvNameFood.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 iOnClickFood.OnClickFood(food.getNameFood());
             }
         });


    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNameFood;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameFood = itemView.findViewById(R.id.tvNameFood);
        }
    }
}
