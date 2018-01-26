package com.mukminullah.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_list;

    String classname = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize RecyclerView
        rv_list = (RecyclerView) findViewById(R.id.list_rv);
        //Initialize Layout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        //Implement Linear Layout Manager
        rv_list.setLayoutManager(linearLayoutManager);
        //Add Decoration item
        RDV_list rdv_list = new RDV_list(16);
        rv_list.addItemDecoration(rdv_list);

        //setDummyData
        List<B_list> rows = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            B_list row = new B_list("Rahmad Setiawan Mukminullah", "Teknik Informatika");
            rows.add(i, row);
        }

        //Add adapter
        AV_list av_list = new AV_list(rows, MainActivity.this);

        //Implement adapter
        rv_list.setAdapter(av_list);

    }

    public void doTheActionInActivity(B_list getItem) {
        Toast.makeText(this,
                "Do action in: " + classname
                        + " \nData Item => Nama: " + getItem.getName()
                        + ", Jurusan: " + getItem.getJurusan(),
                Toast.LENGTH_LONG).show();
    }

}