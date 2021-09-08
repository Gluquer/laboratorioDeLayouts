package com.example.laboratoriodelayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void monedas(View vista){
    	Intent vMoneda = new Intent(this,conversionMonedas.class);
    	startActivity(vMoneda);
    }
    public void grados(View vista){
    	Intent vGrados = new Intent(this,conversionGrados.class);
    	startActivity(vGrados);
    }
    public void medidas(View vista){
    	Intent vMedidas = new Intent(this,conversionMedidas.class);
    	startActivity(vMedidas);
    }
   
    public void finalizar(View vista){
    	finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
