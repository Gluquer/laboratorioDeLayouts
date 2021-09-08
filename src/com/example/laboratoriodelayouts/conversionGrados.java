package com.example.laboratoriodelayouts;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class conversionGrados extends Activity{
	DecimalFormat formato = new DecimalFormat("#.##");
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_grados);
	    }
	    public void aFahrenheit(View vista){
	    	EditText pdato=(EditText) findViewById(R.id.acceso);
	    	
	    	double dato = Double.parseDouble(pdato.getText().toString());
	    	EditText pcentigrados=(EditText) findViewById(R.id.editText2);
	    	double resultado= (double) (dato * 1.8000)+32;
	    	pcentigrados.setText(dato+"°C = "+ formato.format(resultado)+""+"°F");
	    	EditText pformula=(EditText) findViewById(R.id.editText3);
	    	pformula.setText("°F = (°C*1.8000)+32");    	
	    }
	    public void aCentigrados(View vista){
	    	EditText pdato=(EditText) findViewById(R.id.acceso);
	    	
	    	double dato = Double.parseDouble(pdato.getText().toString());
	    	EditText pFahrenheit=(EditText) findViewById(R.id.editText2);
	    	double resultado= (double) (dato -32)/1.8000;
	    	pFahrenheit.setText(dato+"(°F) = "+formato.format(resultado)+""+"(°C)");
	    	
	    	EditText pformula=(EditText) findViewById(R.id.editText3);
	    	pformula.setText("°C = (°F-32)/1.8000");
	    }
	    public void limpiar(View vista){
	    	EditText pdato = (EditText) findViewById(R.id.acceso);
	    	EditText presultado = (EditText) findViewById(R.id.editText2);
	    	EditText pformula = (EditText) findViewById(R.id.editText3);
	    	pdato.setText("");
	    	presultado.setText("");
	    	pformula.setText("");
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
