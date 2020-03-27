package com.example.bajaropetion.BazarHome;

import android.os.Bundle;
import android.support.v4.app.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bajaropetion.AdapterHome.MyAdapter;
import com.example.bajaropetion.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowList extends Fragment {

    private ArrayList<String> arrayList;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView listOfItems;

    public ShowList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_show_list, container, false);

        listOfItems=(RecyclerView)view.findViewById(R.id.listCon);
        listOfItems.setHasFixedSize(true);
        linearLayoutManager=new LinearLayoutManager(getContext());
        arrayList=new ArrayList<>();
        MyAdapter adapter=new MyAdapter(arrayList);
        listOfItems.setAdapter(adapter);
        listOfItems.setLayoutManager(new LinearLayoutManager(getContext()));

        // Testing for recyclerView
        arrayList.add("Yogesh");

        return view;
    }
}

