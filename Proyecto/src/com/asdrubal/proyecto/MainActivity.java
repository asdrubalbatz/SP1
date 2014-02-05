package com.asdrubal.proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends ListActivity{

	String NOMBRE = "nombre";
	String DIRECCION = "direccion";
	
	public List<HashMap<String,String>> tiendas = new ArrayList<HashMap<String,String>>();
	
	//HashMap<String,String> temp = new HashMap<String,String>();
	//String[] tienditas = {"Zara", "Pull & Bear", "Cemaco", 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

				
		ArrayList<Tienda> lista = DatosdeTiendas.ListadeTiendas(); 
				
		for (Tienda tiendax : lista) {
		
			HashMap<String, String> temp = new HashMap<String,String>();
			temp.put(NOMBRE,tiendax.nombre);
			temp.put(DIRECCION,tiendax.direccion);
			tiendas.add(temp);
		}
		
		
		ListView listaNueva = (ListView) findViewById(android.R.id.list);
		
		SimpleAdapter sadapter = new SimpleAdapter(
				getBaseContext(), tiendas,
				android.R.layout.simple_list_item_1,
				new String[] {NOMBRE, DIRECCION}, new int[] {android.R.id.text1, android.R.id.text2}
				);
		
		setListAdapter(sadapter);
		
		listaNueva.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Intent cambioaTienda = new Intent(getApplicationContext(), TiendaDetalle.class);
				String nombre= tiendas.get(position).get(NOMBRE);
				cambioaTienda.putExtra("marca", nombre);
				startActivity(cambioaTienda);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
