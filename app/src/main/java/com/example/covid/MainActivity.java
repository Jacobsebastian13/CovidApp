package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button blgn,bsp;
    EditText usr,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blgn=(Button) findViewById(R.id.btnlogin);
        bsp=(Button) findViewById(R.id.btnsignup);
        blgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home=new Intent(getApplicationContext(),VolunteerHome.class);
                startActivity(home);
            }
        });
    }
}