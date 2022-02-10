package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class VolunteerHome extends AppCompatActivity {
    Button bp,bq,bf,be;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volunteerhome);
        bp=(Button)findViewById(R.id.btnProfile);
        bq=(Button) findViewById(R.id.btnQuarant);
        bf=(Button) findViewById(R.id.btnFood);
        be=(Button) findViewById(R.id.btnEmgc);
    }
}