package com.example.shrav.bikeroute;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shrav on 11/15/2016.
 */
public class itemViewHolder extends RecyclerView.ViewHolder {


    public TextView route_name;
    public TextView start_latitude;
    public TextView start_longitude;
    public TextView end_latitude;
    public TextView end_longitude;
    public TextView used;


    public itemViewHolder(View view) {
        super(view);


        this.route_name = (TextView) view.findViewById(R.id.item_routename);
        this.start_latitude = (TextView) view.findViewById(R.id.startlatitude);
        this.start_longitude = (TextView) view.findViewById(R.id.startlongitude);
        this.end_latitude = (TextView) view.findViewById(R.id.endlatitude);
        this.end_longitude = (TextView) view.findViewById(R.id.endlongitude);
        this.used = (TextView) view.findViewById(R.id.item_used);


    }


}