package com.example.bajaropetion.BazarHome;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.bajaropetion.AdapterHome.MyAdapter;
import com.example.bajaropetion.R;

import java.util.ArrayList;


public class Bazar_Home extends Fragment {

    private Button btnSale,btnBay;
    private Spinner itemList;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private Context context;
    private int valPosition;

    public Bazar_Home() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_bazar__home, container, false);

        itemList=(Spinner)view.findViewById(R.id.itemList);
        btnSale=(Button)view.findViewById(R.id.btnSale);
        btnBay=(Button)view.findViewById(R.id.btnBay);

        // Adding data spinner
        arrayList=new ArrayList<>();

        arrayList.add("Select yure opetion");
        arrayList.add("Gehu");
        arrayList.add("Bajary");
        arrayList.add("Methi");
        arrayList.add("Kothumbir");
        arrayList.add("Aamba");
        arrayList.add("Chicku");

        adapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,arrayList);
        itemList.setAdapter(adapter);

        //Item selected user
        itemList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                valPosition=arrayList.indexOf(arrayList.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // If user click BAY button
        btnBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

          fragment_Choice(new ShowList());
          // switch (valPosition)
          // {
          //     case 0:
          //         Toast.makeText(getContext(),"PLZ select yure opetion",Toast.LENGTH_LONG).show();
          //         break;
          //     case 1:
          //         break;
          //     case 2:
          //         break;
          //     case 3:
          //         break;
          //     case 4:
          //         break;
          //     case 5:
          //         break;
          //     case 6:
          //         break;
          // }

            }
        });

        // If user click SALe button
        btnSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (valPosition)
                {
                    case 0:
                        Toast.makeText(getContext(),"PLZ select yure opetion",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
            }
        });

        return view;
    }

    // Create frament choice function
    private void fragment_Choice(Fragment fragment)
    {
        FragmentManager fm=getActivity().getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentCon,fragment);
        ft.commit();
    }
}
