package cr.ac.ulead.lista.entidades;

public class Lista {
	private Nodo inicio = null;
	
	public boolean estaVacia() {
		return inicio == null;
	}
	
	public void agregar(Nodo nuevoNodo) {
		if (inicio == null) {
			inicio = nuevoNodo;
		} else {
			Nodo temp = inicio;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nuevoNodo;
		}
	}
	
	public void imprimirLista() {
		Nodo temp = inicio;
		while (temp != null) {
			System.out.println("Valor del Nodo" + temp.value);
			temp = temp.next;
		}
	}
	
	
	
	
	
	
	
	
	
}
