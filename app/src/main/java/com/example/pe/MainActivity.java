package com.example.pe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //estas son las variables que vamos a utilizar a lo largo de nuestro codigo

    EditText val1,val2,val3; //quiere decir que llamamos el id de la caja que vamos a utilizar para los valores.
    TextView res;// es el resulado de la operacion
    Button PE;// es el boton que hace el calculo
    Button Salir;// es el boton que sale
    double x,y,z;// variables del calculo
    double resultado;// resultado


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //en esta parte vamos a combinar las variables que estan en el xml con las que pusimos en
        //el archivo .java

        val1=(EditText)findViewById(R.id.valor1);// es para el valor 1
        val2=(EditText)findViewById(R.id.valor2);//es para el valor 2
        val3=(EditText) findViewById(R.id.valor3);//es para el valor 3
        res=(TextView) findViewById(R.id.result);//es para el resultado de la operacion
        PE=(Button) findViewById(R.id.calculo);// es para el calculo que se va a realizar
        Salir=(Button) findViewById(R.id.salir);// es el boton para salir


        //aqui creamos las actividades, y definimos que van a realizar cuando le hagamos clic
        PE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                punto(); // aqui mandamos a llamar el metodo que esta abajo llamado punto
                //que calcula el punto de equilibrio
            }

        });

        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salir();
                //aqui llamamos el metodo salir que es para salir de la app
            }
        });
    }

    //aqui se realiza la operacion del punto de equilibrio
    private void punto (){
        x = Integer.parseInt(val1.getText().toString());// es equivalente a los costos totales
        y = Integer.parseInt(val2.getText().toString());// es equivalente a precio de venta
        z = Integer.parseInt(val3.getText().toString());// es equivalente a costo de ventas

        resultado = x/(y-z); // aqui almacenamos el resultado de la operacion en "resultado"
        res.setText(String.valueOf(resultado));// aqui mostramos el resultado en el edittext de resultado

    }

    private void salir (){
        finish();//aqui ponemos el metdo para salir que esta dado en java por defecto.
    }

}