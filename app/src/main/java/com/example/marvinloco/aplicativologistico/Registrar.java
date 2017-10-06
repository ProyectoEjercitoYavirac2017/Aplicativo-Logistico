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

        edi1 = (EditText) findViewById(R.id.etcodi);
        edi2 = (EditText) findViewById(R.id.etusua);
        edi3 = (EditText) findViewById(R.id.etcont);
    }

    public void registrar(View v) {
        DBHelper admin = new DBHelper(this, "aplicativo", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String codigo = edi1.getText().toString();
        String usuario = edi2.getText().toString();
        String contrasena = edi3.getText().toString();

        ContentValues values = new ContentValues();
        values.put("codigo", codigo);
        values.put("usuario", usuario);
        values.put("contrasena", contrasena);

        db.insert("usuarios", null, values);
        Toast.makeText(getApplicationContext(), "Direccionando...", Toast.LENGTH_SHORT).show();
        db.close();

        Intent ven = new Intent(this, Secundaria.class);
        startActivity(ven);

    }


    public void salir(View v) {
        Intent ven = new Intent(this, Secundaria.class);
        startActivity(ven);
    }
}



