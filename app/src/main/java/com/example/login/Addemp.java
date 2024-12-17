package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Addemp extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    String[] arr;

    String getCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addemp);
        b1=(Button) findViewById(R.id.btm);
        ed1=(EditText)findViewById(R.id.empcode);
        ed2=(EditText)findViewById(R.id.empname);
        b1.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View v) {


                Intent obj=new Intent(getApplicationContext(), MENU.class);
                startActivity(obj);
            }
        });

    }
}