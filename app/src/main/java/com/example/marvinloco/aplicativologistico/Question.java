package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;
    Button btn_1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

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
        c13 = (CheckBox) findViewById(R.id.cb13);
        c14 = (CheckBox) findViewById(R.id.cb14);
        c15 = (CheckBox) findViewById(R.id.cb15);
        c16 = (CheckBox) findViewById(R.id.cb16);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c2.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c3.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c4.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c5.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c6.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c7.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c8.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c9.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c10.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c11.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c12.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c13.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c14.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c15.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                }
            }

        });

        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c16.isChecked()==true) {
                    Toast.makeText(Question.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Question.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                }
            }

        });


        
        btn_1 = (Button) findViewById(R.id.btn_4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Question.this, Question_1.class);
                Question.this.startActivity(itemintent);
                finish();
            }
        });
    }
}