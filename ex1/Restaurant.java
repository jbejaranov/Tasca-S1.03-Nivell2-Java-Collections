package ex1;

public class Restaurant {
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
		return "Restaurant [nom=" + nom + "]";
	}

}
