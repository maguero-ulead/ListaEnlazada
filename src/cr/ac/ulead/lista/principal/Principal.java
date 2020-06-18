package cr.ac.ulead.lista.principal;

import cr.ac.ulead.lista.entidades.Lista;
import cr.ac.ulead.lista.entidades.Nodo;

public class Principal {

	public static void main(String[] args) {
		Lista miLista = new Lista();
		System.out.println("Lista vacia?" + miLista.estaVacia());
		for (int i = 1; i < 1000; i +=20) {
			Nodo nuevoNodo = new Nodo(i);
			miLista.agregar(nuevoNodo);
		}
		System.out.println("Lista vacia?" + miLista.estaVacia());
		miLista.imprimirLista();
	}
	
}
