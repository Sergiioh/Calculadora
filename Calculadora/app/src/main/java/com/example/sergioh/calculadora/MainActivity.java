package com.example.sergioh.calculadora;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private Toast toast;
    Context context;
    private int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Numeros ingresados
        num1 =(EditText)findViewById(R.id.editText);
        num2 =(EditText)findViewById(R.id.editText2);

    }

    public void sumar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int sum=n1+n2;
        mostrar(sum);
    }
    public void Restar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        this.sum =n1-n2;
        mostrar(sum);
    }
    public void Multiplicar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int sum=n1*n2;
        mostrar(sum);
    }
    public void Dividir(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int sum=n1/n2;
        mostrar(sum);
    }
    private void mostrar(int sum ){
        this.sum = sum;
        Context context = getApplicationContext();
        CharSequence text = " "+sum+" ";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM, 0, 0);

        toast.show();
    }
}
