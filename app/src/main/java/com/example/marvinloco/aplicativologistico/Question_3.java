package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question_3 extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6;
    Button btn_1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_3);

        c1 = (CheckBox) findViewById(R.id.cb1);
        c2 = (CheckBox) findViewById(R.id.cb2);
        c3 = (CheckBox) findViewById(R.id.cb3);
        c4 = (CheckBox) findViewById(R.id.cb4);
        c5 = (CheckBox) findViewById(R.id.cb5);
        c6 = (CheckBox) findViewById(R.id.cb6);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked()==true) {
                    Toast.makeText(Question_3.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_3.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c2.isChecked()==true) {
                    Toast.makeText(Question_3.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_3.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c3.isChecked()==true) {
                    Toast.makeText(Question_3.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_3.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c4.isChecked()==true) {
                    Toast.makeText(Question_3.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_3.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c5.isChecked()==true) {
                    Toast.makeText(Question_3.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_3.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c6.isChecked()==true) {
                    Toast.makeText(Question_3.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_3.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });       
        
        
        btn_1 = (Button) findViewById(R.id.etcedu);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Question_3.this, Final.class);
                Question_3.this.startActivity(itemintent);
                finish();
            }
        });
    }
}