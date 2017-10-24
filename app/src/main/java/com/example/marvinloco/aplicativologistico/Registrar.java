package com.example.marvinloco.aplicativologistico;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
    EditText edi1, edi2, edi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        edi1 = (EditText) findViewById(R.id.etnomb);
        edi2 = (EditText) findViewById(R.id.btn_1);
        edi3 = (EditText) findViewById(R.id.etcont);


    }

    public void ingresar (View v) {

        String nombre = edi1.getText().toString();
        String usuario = edi2.getText().toString();
        String contraseña = edi3.getText().toString();

        DBHelper admin = new DBHelper(Registrar.this, "aplicativo", null, 1);

        if (admin!= null) {
            SQLiteDatabase db = admin.getWritableDatabase();
            ContentValues values = new ContentValues();

            values.put("nombre", nombre);
            values.put("usuario", usuario);
            values.put("contrasena", contraseña);
            long insertado = db.insert("usuarios", null, values);
            db.close();
            if (insertado > 0) {
                Toast.makeText(Registrar.this, "Se ha ingresado con exito", Toast.LENGTH_SHORT).show();
                edi1.setText("");
                edi2.setText("");
                edi3.setText("");
            }else{
                Toast.makeText(Registrar.this, "No se ingreso", Toast.LENGTH_SHORT).show();
            }
        }
        Intent ven = new Intent(this, Login.class);
        startActivity(ven);

    }


    public void salir(View v) {
        Intent ven = new Intent(this, Login.class);
        startActivity(ven);
    }
}



