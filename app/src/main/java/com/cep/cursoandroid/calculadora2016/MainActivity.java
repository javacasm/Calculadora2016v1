package com.cep.cursoandroid.calculadora2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvVisor=null;
    // Variables de clases que guardan los valores para la operación
    int iOperando1;
    int iIDBotonOperador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View vVisor=findViewById(R.id.tvVisor);
        tvVisor=(TextView)vVisor;
    }

    public void botonIgual(View v)
    {
        // obtener operando2
        String strOperando2=tvVisor.getText().toString();
        int iOperando2=Integer.parseInt(strOperando2);

        String resultado="0";
        switch (iIDBotonOperador)
        {
            case R.id.btMas:
                resultado= String.valueOf(iOperando1+iOperando2);
                break;

            case R.id.btMenos:
                resultado=String.valueOf(iOperando1-iOperando2);
                break;

            case R.id.btPor:
                resultado=String.valueOf(iOperando1*iOperando2);
                break;
            case R.id.btDividido:
                try
                {
                    resultado=String.valueOf(iOperando1/iOperando2);
                    // TODO: Usar resultado decimal
                }
                catch (Exception e)
                {
                    resultado=e.getMessage();
                }
                break;
        }
        // Mostrar resultado
        tvVisor.setText(resultado);

    }

    public void botonBorrado(View v)
    {
        // Poner el texto en 0
        //tvVisor.setText("0"); //mejor usar el string traducido
        tvVisor.setText(R.string.visor_por_defecto);
    }
    public void botonOperador(View v)
    {
        // Guardo el operando1
            // Recupero la cadena de Visor
            // Convierto a int
        String strOperando1=tvVisor.getText().toString();

        iOperando1=Integer.parseInt(strOperando1);

        // Guardo el operador (signo)
        iIDBotonOperador= v.getId();

        // Borramos el visor

        tvVisor.setText(getText(R.string.visor_por_defecto));
    }

    public void botonNumerico(View v)
    {
        // saber el boton: su ID  getID()
        // saber el texto boton  getText()
        Button boton=(Button)v;
        String strBoton=boton.getText().toString();

    //    // recuperar texto visor
    //    View vVisor=findViewById(R.id.tvVisor);
    //    TextView tvVisor=(TextView)vVisor;

        String strVisor=tvVisor.getText().toString();
        // concatenar strVisort + strBoton
        // TODO: tener en cuenta el caso de que sea el primer cero
        String strNuevoVisor;
        if(strVisor.equals(getString(R.string.visor_por_defecto) ) )
        {    strNuevoVisor=strBoton; }
        else
        {    strNuevoVisor=strVisor+strBoton; }

        // Guardar nuevo texto en el visor  setText(

        // TODO: poner número máximo de dígitos
        tvVisor.setText(strNuevoVisor);

    }
}






















