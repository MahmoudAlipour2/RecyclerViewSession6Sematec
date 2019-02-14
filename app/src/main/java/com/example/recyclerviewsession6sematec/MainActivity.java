package com.example.recyclerviewsession6sematec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orhanobut.hawk.Hawk;

public class MainActivity extends AppCompatActivity {


    Button btnRegister;
    Button btnUsersInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hawk.init(MainActivity.this).build();
        Hawk.delete("UserInfo");

        btnRegister = findViewById(R.id.btnRegister);
        btnUsersInfo = findViewById(R.id.btnUsersInfo);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maintoRegistration = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(maintoRegistration);
            }
        });


        btnUsersInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maintoRecyclerView = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(maintoRecyclerView);
            }
        });

    }

}

