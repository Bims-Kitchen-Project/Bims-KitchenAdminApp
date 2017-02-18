package com.example.prateek.bimsadmin;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by RajeevPC on 2/18/2017.
 */

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder> {

    private List<Order> orderList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, number;


        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.Oname);
            number = (TextView) view.findViewById(R.id.Onumber);

        }
    }


    public OrderAdapter(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_item, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Order order = orderList.get(position);
        holder.name.setText(order.getName());
        holder.number.setText(order.getNumber());

    }


    @Override
    public int getItemCount() {
        return orderList.size();
    }
}
