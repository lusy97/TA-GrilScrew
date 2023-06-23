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

        //DAFTAR ISI
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Daftar isi");
        nestedList1.add("Pengantar Fiqih Darah Wanita");
        nestedList1.add("BAB 1 : Pengertian Haid");
        nestedList1.add("A. Bahasa");
        nestedList1.add("B. Istilah");
        nestedList1.add("BAB 2 : Dalil Pensyariatan Terkait Haid");
        nestedList1.add("A. Al-Quran");
        nestedList1.add("B. As-Sunnah");
        nestedList1.add("BAB 3 : Pengertian Nifas");
        nestedList1.add("1. Bahasa");
        nestedList1.add("2. Istilah");
        nestedList1.add("a. Al-Hanafiyah dan Asy-Syafi'iyah");
        nestedList1.add("b. Al-Malikiyah");
        nestedList1.add("c. Al-Hanabilah");
        nestedList1.add("BAB 4 : Dalil Pensyariatan Terkait Nifas");
        nestedList1.add("BAB 5 : Pengertian Istihadhah");
        nestedList1.add("A. Bahasa");
        nestedList1.add("B. Istilah");
        nestedList1.add("1. Mazhab Al-Hanafiyah");
        nestedList1.add("2. Mazhab Asy-Syafi'iyah");
        nestedList1.add("3. Mazhab Al-Hanabilah");
        nestedList1.add("BAB 6 : Yang Termasuk Darah Istihadhah");
        nestedList1.add("1. Darah Sebelum Usia 9 Tahun");
        nestedList1.add("2. Darah Di Masa Suci");
        nestedList1.add("3. Darah Sebelum Melahirkan");
        nestedList1.add("4. Darah Melewati Durasi Maksimal Haid dan Nifas");
        nestedList1.add("BAB 7 : Dalil Pensyariatan Istihadhah");


        //List2 Pengantar Fiqih Darah Wanita
        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Dalam ilmu Fiqih darah yang keluar dari kemaluan wanita ada tiga \n" +
                "macam: haid, nifas dan istihadhah. \n" +
                "Darah haid adalah darah yang keluar dari dalam rahim wanita secara \n" +
                "alami dalam keadaan sehat. Artinya bukan darah karena penyakit dan juga \n" +
                "karena melahirkan.\n" +
                "Darah nifas adalah darah yang keluar setelah melahirkan. Darah yang \n" +
                "keluar sebelum waktu melahirkan tidak dikatakan sebagai nifas. \n" +
                "Darah istihadhah adalah darah yang keluar dari rahim wanita melalui \n" +
                "kemaluannya dimana darah tersebut tidak memenuhi ciri-ciri haid ataupun \n" +
                "nifas");

        //List3 BAB 1 : Pengertian Haid
        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("A. Bahasa\n" +
                "Kata haidh (الحيض (dalam bahasa Arab berasal dari kata dasarnya haadha \n" +
                "(حاض (yang berarti : mengalir. \n" +
                "Dan makna haadhal wadhi (الوادي حاض (adalah bila air mengalir pada suatu \n" +
                "wadi atau lembah. Dan bila disebutkan haadha al-mar'atu (المرأة حاض (\n" +
                "maknanya menjadi : wanita itu darahnya mengalir.\n" +
                "Wanita yang sedang mengalami haidh disebut dengan haa-idh (حائض(. \n" +
                "Walaupun biasanya untuk yang berjenis kelamin wanita ditambahkan ta' \n" +
                "ta'nits, namun karena hanya perempuan saja yang bisa mengalaminya, maka \n" +
                "cukup disebut haa-idh saja dan tidak perlu disebut dengan haa-idhah (حائضة(. \n" +
                "Bila jumlah wanita yang mendapat haidh itu banyak, disebut dengan \n" +
                ".(حوائض) hawaidh dan ) ُحيَّض) hu");
        nestedList3.add("B. Istilah \n" +
                "Al-Khatib As-Syirbini mendefinisikan haid sebagai: \n" +
                "أوقَا ٍت\n" +
                "ِري َسبَ ٍب ِِف َ\n" +
                "مِن غَ\n" +
                "ةحةِ\n" +
                " صِ\n" +
                "ََل َسِبيل ال\n" +
                "ُوِغهَا عَ\n" +
                "ُل\n" +
                "َعَد ب\n" +
                "ب\n" +
                "أةِ\n" +
                "َ\n" +
                "ر\n" +
                "َ\n" +
                "امل\n" +
                "ِ\n" +
                "ِحم\n" +
                "َ\n" +
                "أق ََص ر\n" +
                "َ\n" +
                "ُ ُج مِن\n" +
                "ةٍَّل ََير\n" +
                "َدُم ِجِب\n" +
                "ُوَمةٍ\n" +
                "َمعل\n" +
                "Darah yang keluar dari ujung rahim seorang wanita setelah baligh karena \n" +
                "keadaannya yang sehat tanpa penyebab tertentu dan keluar pada jadwal \n" +
                "waktu yang sudah dikenal1\n" +
                ".");

        mList.add(new DataModel(nestedList1, "Daftar Isi"));
        mList.add(new DataModel(nestedList2, "Pengantar Fiqih Darah Wanita"));
        mList.add(new DataModel(nestedList3, "BAB 1 : Pengertian Haid"));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);

    }
}
