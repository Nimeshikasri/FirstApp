package com.example.firstapp;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>{

    String[] mCountries; // will store the countries but its empty now

    public CountriesAdapter(String[] mCountries) {
        this.mCountries = mCountries;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_row_plank,parent,false);
        return new CountriesViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.rowTextView.setText(mCountries[position]);
    }

    @Override
    public int getItemCount() {
        return mCountries.length; // no of items!
    }

    class CountriesViewHolder extends RecyclerView.ViewHolder {

        TextView rowTextView;

        public CountriesViewHolder(@NonNull View itemView) {
            super(itemView);
            rowTextView = itemView.findViewById(R.id.tvRow);
        }
    }
}
