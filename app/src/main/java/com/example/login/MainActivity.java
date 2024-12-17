package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    String getUname,getPass;
    int pass;
    String s1="admin";
    String s2="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    ed1=(EditText) findViewById(R.id.uname);
    ed2=(EditText) findViewById(R.id.pass);
    b1=(Button) findViewById(R.id.login);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getUname=ed1.getText().toString();
            getPass=ed2.getText().toString();
            //pass=Integer.parseInt(getPass);
            if(getPass.equals(s2) && getUname.equals(s1))
                {
                    Toast.makeText(getApplicationContext(),"LOGIN SUCCESS",Toast.LENGTH_LONG).show();
                    Intent obj1=new Intent(getApplicationContext(), MENU.class);
                    startActivity(obj1);


                }
            else
                {
                    Toast.makeText(getApplicationContext(),"INVALID CREDENTIALS",Toast.LENGTH_LONG).show();

                }



        }
    });

    }
}