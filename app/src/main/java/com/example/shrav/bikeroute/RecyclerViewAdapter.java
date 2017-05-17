package com.example.shrav.bikeroute;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by shrav on 11/15/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<itemViewHolder> {
    List<Route> list = Collections.emptyList();
    Context context;

    public RecyclerViewAdapter(Context context,List<Route> list ) {
        this.list = list;
        this.context = context;
    }

    @Override
    public itemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        itemViewHolder holder = new itemViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(itemViewHolder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.route_name.setText(list.get(position).route_name);
        holder.start_latitude.setText(list.get(position).start_latitude);
        holder.start_longitude.setText(list.get(position).start_longitude);
        holder.end_latitude.setText(list.get(position).end_latitude);
        holder.end_longitude.setText(list.get(position).end_longitude);
        holder.used.setText(list.get(position).used);




    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, Route data) {
        list.add(position, data);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(Route data) {
        int position = list.indexOf(data);
        list.remove(position);
        notifyItemRemoved(position);
    }

}