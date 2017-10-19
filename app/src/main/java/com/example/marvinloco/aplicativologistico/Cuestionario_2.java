package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Cuestionario_2 extends AppCompatActivity implements View.OnClickListener {
    LinearLayout lay1,lay2,lay3 ;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;
    Button btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario_2);

        lay1 = (LinearLayout) findViewById(R.id.layout1);
        lay2 = (LinearLayout) findViewById(R.id.layout2);
        lay3 = (LinearLayout) findViewById(R.id.layout3);

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

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);

    }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_1:
                    if (lay1.getVisibility() == View.GONE)
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.GONE);
                        lay3.setVisibility(View.GONE);
                    }else
                    {
                        lay1.setVisibility(View.GONE);
                    }
                    break;
                case R.id.btn_2:
                    if (lay2.getVisibility() == View.GONE)
                    {
                        lay2.setVisibility(View.VISIBLE);
                        lay1.setVisibility(View.GONE);
                        lay3.setVisibility(View.GONE);
                    }else
                    {
                        lay2.setVisibility(View.GONE);
                    }
                    break;
                case R.id.btn_3:
                    if (lay3.getVisibility() == View.GONE)
                    {
                        lay3.setVisibility(View.VISIBLE);
                        lay1.setVisibility(View.GONE);
                        lay2.setVisibility(View.GONE);
                    }else
                    {
                        lay3.setVisibility(View.GONE);
                    }
                    break;
            }

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c1.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c2.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c3.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c4.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c5.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c6.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c7.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c8.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });
            c9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c9.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c10.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c11.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c12.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c13.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c14.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c15.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO SI", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO SI", Toast.LENGTH_SHORT).show();
                    }
                }

            });

            c16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (c16.isChecked()==true) {
                        Toast.makeText(Cuestionario_2.this, "ACTIVADO NO", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cuestionario_2.this, "DESACTIVADO NO", Toast.LENGTH_SHORT).show();
                    }
                }

            });

        btn_4 = (Button) findViewById(R.id.btn_1);

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Cuestionario_2.this, Cuestionario_3.class);
                Cuestionario_2.this.startActivity(itemintent);
                finish();   }
        });


    }
}