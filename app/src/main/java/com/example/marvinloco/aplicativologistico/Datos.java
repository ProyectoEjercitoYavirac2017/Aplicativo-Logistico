package com.example.marvinloco.aplicativologistico;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class Datos extends AppCompatActivity  {
    Button btn_1,btn_2;

    EditText t1;
    private int mYearIni, mMonthIni, mDayIni, sYearIni, sMonthIni, sDayIni;
    static final int DATE_ID = 0;
    Calendar C = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        Spinner spinner = (Spinner) findViewById(R.id.sp1);
        String[] valores = {" ","Brigada 1","Brigada 2","Brigada Independencia","Cuartel 1","Cuartel 2","Comando General"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                                                  Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> parent) {

                                              }
        });

        Spinner spinner1 = (Spinner) findViewById(R.id.sp2);
        String[] valores1 = {" ","Camioneta","Furgón","Camión","Vehículo de combate","Carro Blindado"};
        spinner1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores1));
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        btn_1 = (Button) findViewById(R.id.etcedu);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Datos.this, Menu.class);
                Datos.this.startActivity(itemintent);
                finish();
            }
        });

        btn_2 = (Button) findViewById(R.id.btn_2);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Datos.this, Login.class);
                Datos.this.startActivity(itemintent);
                finish();
            }
        });

        sMonthIni = C.get(Calendar.MONTH);
        sDayIni = C.get(Calendar.DAY_OF_MONTH);
        sYearIni = C.get(Calendar.YEAR);
        t1 = (EditText) findViewById(R.id.txtFecha);
        t1.setInputType(InputType.TYPE_NULL);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog(DATE_ID);
            }
        });

    }

    private void colocar_fecha() {
        t1.setText(mDayIni + "-" + (mMonthIni + 1) + "-" + mYearIni+" ");
    }


    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;
                    colocar_fecha();

                }

            };


    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_ID:
                return new DatePickerDialog(this, mDateSetListener, sYearIni, sMonthIni, sDayIni);


        }


        return null;
    }

 }



