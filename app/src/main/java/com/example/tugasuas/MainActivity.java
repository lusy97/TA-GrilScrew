package com.example.tugasuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //List1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Jams and Honey");
        nestedList1.add("Pickles and Chutneys");
        nestedList1.add("Readymade Meals");
        nestedList1.add("Health Food");
        nestedList1.add("Pasta and Soups");
        nestedList1.add("Sauce and Ketchups");
        nestedList1.add("Snacks");
        nestedList1.add("Spreads");

        //List2 Stationary
        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Books");
        nestedList2.add("Pens");
        nestedList2.add("Pencils");
        nestedList2.add("Rulers");
        nestedList2.add("Ink");
        nestedList2.add("Sauce and Ketchups");
        nestedList2.add("Snacks");
        nestedList2.add("Spreads");

        //List3 Stationary
        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Books");
        nestedList3.add("Pens");
        nestedList3.add("Pencils");
        nestedList3.add("Rulers");
        nestedList3.add("Ink");
        nestedList3.add("Sauce and Ketchups");
        nestedList3.add("Snacks");
        nestedList3.add("Spreads");

        //List4 Stationary
        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("Books");
        nestedList4.add("Pens");
        nestedList4.add("Pencils");
        nestedList4.add("Rulers");
        nestedList4.add("Ink");
        nestedList4.add("Sauce and Ketchups");
        nestedList4.add("Snacks");
        nestedList4.add("Spreads");

        //List5 Stationary
        List<String> nestedList5 = new ArrayList<>();
        nestedList5.add("Books");
        nestedList5.add("Pens");
        nestedList5.add("Pencils");
        nestedList5.add("Rulers");
        nestedList5.add("Ink");
        nestedList5.add("Sauce and Ketchups");
        nestedList5.add("Snacks");
        nestedList5.add("Spreads");

        //List6 Stationary
        List<String> nestedList6 = new ArrayList<>();
        nestedList6.add("Books");
        nestedList6.add("Pens");
        nestedList6.add("Pencils");
        nestedList6.add("Rulers");
        nestedList6.add("Ink");
        nestedList6.add("Sauce and Ketchups");
        nestedList6.add("Snacks");
        nestedList6.add("Spreads");

        //List7 Stationary
        List<String> nestedList7 = new ArrayList<>();
        nestedList7.add("Books");
        nestedList7.add("Pens");
        nestedList7.add("Pencils");
        nestedList7.add("Rulers");
        nestedList7.add("Ink");
        nestedList7.add("Sauce and Ketchups");
        nestedList7.add("Snacks");
        nestedList7.add("Spreads");

        mList.add(new DataModel(nestedList1, "Instant Food"));
        mList.add(new DataModel(nestedList2, "Instant Stationary"));
        mList.add(new DataModel(nestedList3, "Instant Fashion"));
        mList.add(new DataModel(nestedList4, "Personal Care"));
        mList.add(new DataModel(nestedList5, "Grocery"));
        mList.add(new DataModel(nestedList6, "Pet Care"));
        mList.add(new DataModel(nestedList7, "BabyCare"));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);

    }
}