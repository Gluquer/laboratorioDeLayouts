package com.example.laboratoriodelayouts;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class conversionMonedas extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monedas);
    }
    public void convertir(View vista){
    	DecimalFormat formato = new DecimalFormat("#.##");
    	EditText pbol=(EditText) findViewById(R.id.acceso);
    	float bol = Float.parseFloat(pbol.getText().toString());
    	
    	EditText pdolar=(EditText) findViewById(R.id.editText2);
    	float dolar= (float) (bol / 6.96);
    	pdolar.setText(formato.format(dolar)+"");
    	
    	EditText peuro=(EditText) findViewById(R.id.editText3);
    	float euro= (float) (bol / 7.52);
    	peuro.setText(formato.format(euro)+"");
    	
    	EditText psoles=(EditText) findViewById(R.id.editText4);
    	float soles= (float) (bol / 2.23);
    	psoles.setText(formato.format(soles)+"");
    	
    	EditText pchile=(EditText) findViewById(R.id.editText5);
    	float chile= (float) (bol / 0.011354);
    	pchile.setText(formato.format(chile)+"");
    	
    	EditText preal=(EditText) findViewById(R.id.editText6);
    	float real= (float) (bol / 2.2852);
    	preal.setText(formato.format(real)+"");
    	
    	EditText pchina=(EditText) findViewById(R.id.editText7);
    	float china= (float) (bol / 1.1379);
    	pchina.setText(formato.format(china)+"");
    	
    	EditText pjapon=(EditText) findViewById(R.id.editText8);
    	float japon= (float) (bol / 0.05849034);
    	pjapon.setText(formato.format(japon)+"");
    }
    public void limpiar(View vista){
    	EditText pbol = (EditText) findViewById(R.id.acceso);
    	EditText pdolar = (EditText) findViewById(R.id.editText2);
    	EditText peuro = (EditText) findViewById(R.id.editText3);
    	EditText psoles = (EditText) findViewById(R.id.editText4);
    	EditText pchile = (EditText) findViewById(R.id.editText5);
    	EditText preal = (EditText) findViewById(R.id.editText6);
    	EditText pchina = (EditText) findViewById(R.id.editText7);
    	EditText pjapon = (EditText) findViewById(R.id.editText8);
    	pbol.setText("");
    	pdolar.setText("");
    	peuro.setText("");
    	psoles.setText("");
    	pchile.setText("");
    	preal.setText("");
    	pchina.setText("");
    	pjapon.setText("");
    }
	public void retornar (View vista){
		finish();
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
