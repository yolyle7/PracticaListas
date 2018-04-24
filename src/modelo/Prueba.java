package modelo;

public class Prueba {
	public static void main(String[] args) {
		Lista instancia = new Lista();
		instancia.addLista(Colores.amarillo);
		instancia.addLista(Colores.naranja);
		instancia.addLista(Colores.naranja);
		instancia.addLista(Colores.naranja);
		instancia.addLista(Colores.azul);
		//System.out.println(instancia.busquedaColor(Colores.naranja));
		instancia.borrarColores(instancia.busquedaColor(Colores.naranja));
		System.out.println(instancia.borrarColores(instancia.busquedaColor(Colores.naranja)));
	}
}
