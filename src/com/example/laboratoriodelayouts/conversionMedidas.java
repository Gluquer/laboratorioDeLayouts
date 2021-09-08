package com.example.laboratoriodelayouts;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class conversionMedidas extends Activity{
	DecimalFormat formato = new DecimalFormat("#.######");
	int cont=0;
	EditText pDato;
	Spinner opciones;
	double[] uni={1000,100,10,1,39.370079,39.370079,3.28084,3.28084,1.093613,0.000621,0.001};
	double dat;
	View vista;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medidas);
        pDato = (EditText)findViewById(R.id.acceso);
        opciones = (Spinner)findViewById(R.id.spinner1);
        
        String[] unidades={"mm","cm","dm","m","inch","ft","yd","mile","km"};
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,unidades);
        opciones.setAdapter(ad);
        
        
		convertir(vista);
	}
	public void convertir(View vista){
		dat=0;
		pDato=(EditText) findViewById(R.id.acceso);
		int pos= opciones.getSelectedItemPosition();
		
		try {
			   dat = Double.parseDouble(pDato.getText().toString());
			} catch (NumberFormatException e) {
			   dat = 0;
			}
		//dat=Double.parseDouble(pDato.getText().toString());
        switch(pos){
        case 0:
        	dat=dat/1000;
        	break;
        case 1:
        	dat=dat/100;
        	break;
        case 2:
        	dat=dat/10;
        	break;
        case 3:
        	dat=dat/1;
        	break;
        case 4:
        	dat=dat/39.370079;
        	break;
        case 5:
        	dat=dat/3.28084;
        	break;
        case 6:
        	dat=dat/1.093613;
        	break;
        case 7:
        	dat=dat/0.000621;
        	break;
        case 8:
        	dat=dat/0.001;
        	break;
        }
        
        TextView t3=(TextView)findViewById(R.id.textView3);
        t3.setText(formato.format((double)(dat*uni[0]))+"");
        TextView t5=(TextView)findViewById(R.id.textView5);
        t5.setText(formato.format((double)(dat*uni[1]))+"");
        TextView t7=(TextView)findViewById(R.id.textView7);
        t7.setText(formato.format((double)(dat*uni[2]))+"");
        TextView t9=(TextView)findViewById(R.id.textView9);
        t9.setText(formato.format((double)(dat*uni[3]))+"");
        TextView t11=(TextView)findViewById(R.id.textView11);
        t11.setText(formato.format((double)(dat*uni[4]))+"");
        //TextView t13=(TextView)findViewById(R.id.textView13);
        //t13.setText(formato.format((double)(dat*uni[5]))+"");
        TextView t15=(TextView)findViewById(R.id.textView15);
        t15.setText(formato.format((double)(dat*uni[6]))+"");
        //TextView t17=(TextView)findViewById(R.id.textView17);
        //t17.setText(formato.format((double)(dat*uni[7]))+"");
        TextView t19=(TextView)findViewById(R.id.textView19);
        t19.setText(formato.format((double)(dat*uni[8]))+"");
        TextView t21=(TextView)findViewById(R.id.textView21);
        t21.setText(formato.format((double)(dat*uni[9]))+"");
        TextView t23=(TextView)findViewById(R.id.textView23);
        t23.setText(formato.format((double)(dat*uni[10]))+"");
        
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	int id = item.getItemId();
    	if(id==R.id.action_settings)
    		return true;
    	return super.onOptionsItemSelected(item);
    }
}
