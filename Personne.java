package ex2;

public class Personne {
	private int age ;
	private int taille;
	private String nom;
	
	public Personne(String nom, int age , int taille) {
		this.nom = nom;
		this.age = age ;
		this.taille = taille;
	}
	public int getAge() {
		return age ;
	}
	public String getNom() {
		return nom;
	}
}
