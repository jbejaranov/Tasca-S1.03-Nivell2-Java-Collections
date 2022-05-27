package ex2;

public class Restaurant implements Comparable<Restaurant>{
	String nom;
	int puntuacio;

	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "\n" + nom + "	" + puntuacio;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	@Override
	public int compareTo(Restaurant o) {
		return nom.compareTo(o.getNom());
	}

}
