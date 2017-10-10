package com.example.marvinloco.aplicativologistico;

        import android.content.Intent;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;
        import android.widget.EditText;


public class Secundaria extends AppCompatActivity {
    EditText edi1, edi2;
    private Cursor fila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        edi1 = (EditText) findViewById(R.id.etusuario);
        edi2 = (EditText) findViewById(R.id.etcontrasena);
    }

    public void ingresar(View v) {
        DBHelper admin = new DBHelper(this, "aplicativo", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String usuario = edi1.getText().toString();
        String contrasena = edi2.getText().toString();
        fila = db.rawQuery("select usuario,contrasena from usuarios where usuario='" + usuario + "'and contrasena='" + contrasena + "'", null);

         if (fila.moveToFirst()){
            String usua=fila.getString(0);
            String pass=fila.getString(1);
             if (usuario.equals(usua)&& contrasena.equals(pass)) {
                 Intent ven=new Intent(Secundaria.this,Logistica.class);
                 startActivity(ven);
                 Toast.makeText(Secundaria.this, "Ingreso exitoso", Toast.LENGTH_LONG).show();
             }
             else {
                 Toast.makeText(Secundaria.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                 edi1.setText("");
                 edi2.setText("");
             }
             }

         }
    public void registrar(View v) {
        Intent ven = new Intent(this, Registrar.class);
        startActivity(ven);
    }
}



