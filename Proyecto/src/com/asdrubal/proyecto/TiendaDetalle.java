package com.asdrubal.proyecto;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class TiendaDetalle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tienda_detalle);
		
		Intent info = getIntent();
		String texto = info.getStringExtra("marca");
		Tienda t = DatosdeTiendas.getTienda(texto);
		
		TextView nombreTienda = (TextView)findViewById(R.id.nombreTienda);
		nombreTienda.setText(texto);
		
		TextView direccionTienda = (TextView)findViewById(R.id.direccionTienda);
		direccionTienda.setText(t.direccion);
		
		TextView telefonoTienda = (TextView)findViewById(R.id.telefonoTienda);
		telefonoTienda.setText(t.telefono);
		
		TextView webTienda = (TextView)findViewById(R.id.webTienda);
		webTienda.setText(t.website);
		
		TextView emailTienda = (TextView)findViewById(R.id.emailTienda);
		emailTienda.setText(t.email);

		TextView horariosTienda = (TextView)findViewById(R.id.horariosTienda);
		horariosTienda.setText(t.horarios);

		
		
		
	
		//TextView telTienda = (TextView)findViewById(R.id.telefono);
		//telTienda.setText(t.telefono);
			
		
		
		//int pos = info.getIntExtra("pos", i);
		//MainActivity.tinedas[pos].wbe
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tienda_detalle, menu);
		return true;
	}

}
