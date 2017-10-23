package com.example.marvinloco.aplicativologistico;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registrar extends AppCompatActivity {
    EditText edi1, edi2, edi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        edi1 = (EditText) findViewById(R.id.etnomb);
        edi2 = (EditText) findViewById(R.id.etcedu);
        edi3 = (EditText) findViewById(R.id.etcont);


    }

    public void ingresar (View v) {
        DBHelper admin = new DBHelper(this, "aplicativo", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String nombre = edi1.getText().toString();
        String usuario = edi2.getText().toString();
        String contraseña = edi3.getText().toString();

        ContentValues values = new ContentValues();

        values.put("nombre", nombre);
        values.put("usuario", usuario);
        values.put("contrasena", contraseña);

        db.insert("usuarios", null, values);
        db.close();

        Intent ven = new Intent(this, Login.class);
        startActivity(ven);

    }


    public void salir(View v) {
        Intent ven = new Intent(this, Login.class);
        startActivity(ven);
    }
}



