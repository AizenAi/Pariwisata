package com.example.pariwisata;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private List<Recycleitem> recycleList;
    private RecyclerView recyclerView;
    private Recycleadapter recycleadapter;

    public HomeFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        recycleList = generaterecycleitem();
        recyclerView = rootView.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycleadapter = new Recycleadapter(recycleList);
        recyclerView.setAdapter(recycleadapter);

        return rootView;

    }
    private List<Recycleitem> generaterecycleitem(){
        List<Recycleitem> videoItem = new ArrayList<>();
        videoItem.add(new Recycleitem(R.drawable.fuji,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Tokyo, Japan","Gunung Fuji","4.8/5"));
        videoItem.add(new Recycleitem(R.drawable.andres,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Andes, South","Andes","4.7/5"));
        videoItem.add(new Recycleitem(R.drawable.fuji,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Tokyo, Japan","Gunung Fuji","4.8/5"));
        videoItem.add(new Recycleitem(R.drawable.andres,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Andes, South","Andes","4.7/5"));
        videoItem.add(new Recycleitem(R.drawable.fuji,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Tokyo, Japan","Gunung Fuji","4.8/5"));
        videoItem.add(new Recycleitem(R.drawable.andres,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Andes, South","Andes","4.7/5"));
        videoItem.add(new Recycleitem(R.drawable.fuji,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Tokyo, Japan","Gunung Fuji","4.8/5"));
        videoItem.add(new Recycleitem(R.drawable.andres,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Andes, South","Andes","4.7/5"));
        videoItem.add(new Recycleitem(R.drawable.fuji,R.drawable.baseline_location_on_24,R.drawable.baseline_star_outline_24, "Tokyo, Japan","Gunung Fuji","4.8/5"));
        return videoItem;
    }

}
