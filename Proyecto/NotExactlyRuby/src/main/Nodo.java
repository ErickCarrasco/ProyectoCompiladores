package main;
import java.util.ArrayList;

public class Nodo {
	public String etiqueta;
	public ArrayList<Nodo> hijos = new ArrayList<>();
	public String valor;
	public int id;
	

	// etiqueta
	public void setEtiqueta(String e) {
		etiqueta = e;
	}
	public String getEtiqueta() { return etiqueta; } 

	// hijos
	public void addHijos(Nodo n) {
		hijos.add(n);
	}

	//Duplication a lo Suazo
	public void addHijos(ArrayList<Nodo> n) {
		hijos.addAll(n);
	}

	public ArrayList<Nodo> getHijos() { return hijos; }

	// valor
	public void setValor(String v) {
		valor = v;
	}
	public String getValor() { return valor; }

	// id
	public void setID(int i) {
		id = i;
	}
	public int getID() { return id; }

}