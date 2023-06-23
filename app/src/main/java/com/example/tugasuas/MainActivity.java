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
        nestedList1.add("Indomie Goreng");
        nestedList1.add("Indomie Rebus");
        nestedList1.add("Pop Mie Goreng");
        nestedList1.add("Pop Mie Rebus");
        nestedList1.add("Pop Mie Goreng Pedas");
        nestedList1.add("Mie Gelas");
        nestedList1.add("Mi Sedaap Goreng");
        nestedList1.add("Mi Sedaap Rebus");

        //List2
        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Buku Tulis");
        nestedList2.add("Pena");
        nestedList2.add("Pensil");
        nestedList2.add("Penggaris");
        nestedList2.add("Tinta");
        nestedList2.add("Spidol");
        nestedList2.add("Kertas");
        nestedList2.add("Penghapus");

        //List3 Stationary
        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Kaos");
        nestedList3.add("Kemeja");
        nestedList3.add("Celana Panjang");
        nestedList3.add("Celana Pendek");
        nestedList3.add("Topi");
        nestedList3.add("Dasi");
        nestedList3.add("Sepatu");
        nestedList3.add("Batik");

        //List4 Medis
        List<String> nestedList4 = new ArrayList<>();
        nestedList3.add("Bodrex");
        nestedList3.add("Paracetamol");
        nestedList3.add("OBH");
        nestedList3.add("Vitamin C");
        nestedList3.add("Handsaplast");
        nestedList3.add("Alkohol 70%");
        nestedList3.add("Obat Batuk");
        nestedList3.add("Antimo");

        //List5 Elektronik
        List<String> nestedList5 = new ArrayList<>();
        nestedList3.add("Monitor");
        nestedList3.add("Power Supply");
        nestedList3.add("Keyboard");
        nestedList3.add("Mouse");
        nestedList3.add("Printer");
        nestedList3.add("Headset");
        nestedList3.add("Kabel USB");
        nestedList3.add("Router");


        mList.add(new DataModel(nestedList1, "Makanan Instan"));
        mList.add(new DataModel(nestedList2, "Alat Tulis & Kerja"));
        mList.add(new DataModel(nestedList3, "Pakaian"));
        mList.add(new DataModel(nestedList4, "Medis"));
        mList.add(new DataModel(nestedList5, "Elektronik"));
        

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);

    }
}
