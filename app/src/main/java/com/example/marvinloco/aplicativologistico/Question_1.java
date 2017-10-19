package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question_1 extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
    Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);
        
        c1 = (CheckBox) findViewById(R.id.cb1);
        c2 = (CheckBox) findViewById(R.id.cb2);
        c3 = (CheckBox) findViewById(R.id.cb3);
        c4 = (CheckBox) findViewById(R.id.cb4);
        c5 = (CheckBox) findViewById(R.id.cb5);
        c6 = (CheckBox) findViewById(R.id.cb6);
        c7 = (CheckBox) findViewById(R.id.cb7);
        c8 = (CheckBox) findViewById(R.id.cb8);
        c9 = (CheckBox) findViewById(R.id.cb9);
        c10 = (CheckBox) findViewById(R.id.cb10);
        c11 = (CheckBox) findViewById(R.id.cb11);
        c12 = (CheckBox) findViewById(R.id.cb12);        
        btn_1 = (Button) findViewById(R.id.btn_4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c2.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c3.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c4.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c5.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c6.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c7.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c8.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c9.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c10.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c11.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c12.isChecked()==true) {
                    Toast.makeText(Question_1.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question_1.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Question_1.this, Question_2.class);
                Question_1.this.startActivity(itemintent);
                finish();
            }
        });
    }
}