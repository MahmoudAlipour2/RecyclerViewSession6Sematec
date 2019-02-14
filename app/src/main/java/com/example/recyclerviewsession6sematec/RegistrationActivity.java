package com.example.recyclerviewsession6sematec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;


public class RegistrationActivity extends AppCompatActivity {

    ArrayList<String> names;
    EditText etFirstName;
    EditText etLastName;
    Button btnOk;
    String firstandLast;
    String txtetFirstName;
    String txtetLastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Hawk.init(RegistrationActivity.this).build();
    }

    @Override
    protected void onStart() {
        super.onStart();


        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtetFirstName = etFirstName.getText().toString();
                txtetLastName = etLastName.getText().toString();
                String fullname = txtetFirstName + " " + txtetLastName;


                //Mistake: names =Hawk.get("UserInfo");
                names = Hawk.contains("UserInfo") ? names = Hawk.get("UserInfo") : new ArrayList<String>();
                names.add(fullname);
                Hawk.put("UserInfo", names);
                Toast.makeText(RegistrationActivity.this, " your Information saved, Successfully!", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
