package com.example.shrav.bikeroute;

/**
 * Created by shrav on 11/15/2016.
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class RouteFragment extends Fragment {
    private View view;
    private static RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.route_fragment, container, false);

        setRecyclerView();
        Button new_route=(Button)view.findViewById(R.id.new_route);
        final Context context=getActivity();
        new_route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,StoreRoute.class);
                startActivity(intent);
            }
        });
        return view;

    }
    //Setting recycler view
    private void setRecyclerView() {

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));//Linear Items

        List<Route> arrayList = new ArrayList<>();
        arrayList.add(new Route("RouteName","StartLatitude","StartLongitude","EndLatitude","EndLongitude","Used"));
        for (int i = 0; i <10; i++) {
            arrayList.add(new Route(""+i,""+i,""+i,""+i,""+i,""+i));
        }
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), arrayList);
        recyclerView.setAdapter(adapter);// set adapter on recyclerview

    }
}


