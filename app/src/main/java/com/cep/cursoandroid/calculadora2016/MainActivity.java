package com.cep.cursoandroid.calculadora2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonIgual(View v)
    {
    }


    public void botonBorrado(View v)
    {
    }

    public void botonOperador(View v)
    {
    }

    public void botonNumerico(View v)
    {
        // saber el boton: su ID  getID()
        // saber el texto boton  getText()
        Button boton=(Button)v;
        String strBoton=boton.getText().toString();
        // recuperar texto visor
        // concatenar strVisort + strBoton
        // Guardar nuevo texto en el visor  setText(

    }
}
