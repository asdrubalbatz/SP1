package com.asdrubal.proyecto;

import java.util.ArrayList;

public class DatosdeTiendas {
	public static ArrayList<Tienda> lista;
	
	public static ArrayList<Tienda> ListadeTiendas() {
		
		lista = new ArrayList<Tienda>();
		Tienda t1 = new Tienda();
		t1.nombre = "Zara";
		t1.direccion = "21 Ave 4-32 Zona 11, Miraflores, Guatemala";
		t1.telefono = "23531020";
		t1.horarios = "Lunes a viernes 10:00 am - 9:00 pm";
		t1.website = "www.zara.com";
		t1.email = "info@zara.com";
		lista.add(t1);
		
		Tienda t2 = new Tienda();
		t2.nombre = "Walmart";
		t2.direccion = "Calzada Roosevelth, Guatemala";
		t2.telefono = "18010096722";
		t2.horarios = "Lunes a viernes 8:00 am - 9:00 pm";
		t2.website = "www.walmartguatemala.com";
		t2.email = "comunicacion@wal-mart.com";
		lista.add(t2);
		
		Tienda t3 = new Tienda();
		t3.nombre = "Paiz";
		t3.direccion = "11 Calle 15-01 Z.13, Guatemala";
		t3.telefono = "24859595";
		t3.horarios = "Lunes a viernes 8:00 am - 7:00 pm";
		t3.website = "https://www.facebook.com/PaizGuatemala";
		t3.email = "info@paiz.com";
		lista.add(t3);
		
		Tienda t4 = new Tienda();
		t4.nombre = "Pricesmart";
		t4.direccion = "21 avenida 7-90, Zona 11, Miraflores, Guatemala";
		t4.telefono = "24705000";
		t4.horarios = "Lunes a viernes 10:00 am - 08:30 pm";
		t4.website = "www.Pricesmart.com";
		t4.email = "info@pricesmart.com";
		lista.add(t4);
			
		return lista;
	}
	
		public static Tienda getTienda(String nombre){
			for (Tienda tiendax : lista) {
				if (tiendax.nombre.equals(nombre)) {
					return tiendax;
				}
			}
			return null;
		}
		
			
			
}
