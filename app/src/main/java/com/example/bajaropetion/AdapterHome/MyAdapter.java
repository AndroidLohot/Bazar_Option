package com.example.bajaropetion.AdapterHome;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bajaropetion.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<String> arrayList;

    public MyAdapter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String name=arrayList.get(position);

        holder.tvOwnerName.setText(name);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvOwnerName,tvOwnerItem,tvOwnerItemPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvOwnerName=(TextView)itemView.findViewById(R.id.tvOwnerName);
            tvOwnerItem=(TextView)itemView.findViewById(R.id.tvOnerItem);
            tvOwnerItemPrice=(TextView)itemView.findViewById(R.id.tvItemPrice);

        }
    }
}
