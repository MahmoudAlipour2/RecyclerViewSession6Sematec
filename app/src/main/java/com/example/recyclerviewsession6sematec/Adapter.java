package com.example.recyclerviewsession6sematec;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.RecyclerViewHolder> {

    List<String> myList;

    public Adapter(List<String> list) {
        myList = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        String data = myList.get(position);
        holder.txt.setText(data);


    }

    @Override
    public int getItemCount() {
        return myList.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txt;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.tvItem);
        }
    }

}
