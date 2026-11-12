package ex2;

public class ParcAttraction {
	private String nom;
	private Attraction[] lesAttractions;
	private int nb_attraction;

	public ParcAttraction(String nom, int taille) {
		this.nom = nom;
		this.lesAttractions = new Attraction[taille];
		this.nb_attraction = 0;
	}
	
	public void ajouterAttraction(Attraction a) {
		if (nb_attraction < lesAttractions.length) {
			lesAttractions[nb_attraction] = a;
			nb_attraction++;
		}
		else {
			System.out.println("Erreur : Le parc est plein, impossible d'ajouter l'attraction.");
		}
	}
	public double getRecette() {
		double somme= 0;
		for (int i = 0 ; i < nb_attraction ; i++) {
			somme += lesAttractions[i].getRecette();
		}
		return somme;
	}
	public void affiche(){
		System.out.println("nom du parc : " + nom);
		for (int i = 0 ; i < nb_attraction ; i++) {
			System.out.println("Attraction : " + lesAttractions[i].getNom() + "Recette : " + lesAttractions[i].getRecette());
		}
	}
}

