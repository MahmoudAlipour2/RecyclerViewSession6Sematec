package com.example.recyclerviewsession6sematec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.orhanobut.hawk.Hawk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        Hawk.init(RecyclerViewActivity.this).build();

     /*   List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        names.add("g");
        names.add("h");*/

       // names = Hawk.contains("UserInfo") ?  names = Hawk.get("UserInfo"): new ArrayList<String>();

        names = Hawk.get("UserInfo");

        // Intent getRegistrationtoRecyclerView = getIntent();
        // String userInfo = getRegistrationtoRecyclerView.getStringExtra("UserInfo");
        // Toast.makeText(RecyclerViewActivity.this, userInfo, Toast.LENGTH_SHORT).show();

       /* names.add(userInfo);

        Hawk.put("UserInfo",names);
        names = Hawk.get("UserInfo");*/

        Adapter adapter = new Adapter(names); //in Adapter haman Adapter.java ast ke sakhteim.

        recycler = findViewById(R.id.recyclerView);

        recycler.setAdapter(adapter);

        recycler.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this, RecyclerView.VERTICAL, false));


    }
}
