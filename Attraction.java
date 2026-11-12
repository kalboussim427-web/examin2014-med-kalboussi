package ex2;

public class Attraction {
	private String nom;
	private double cout;
	private ConditionAge conditionAge;
	private int nbPersonnes;
	private double recette;
	
	public Attraction (String nom, double cout , ConditionAge conditionAge) {
		this.nom=nom;
		this.cout=cout;
		this.conditionAge = conditionAge;
		this.nbPersonnes = 0;
		this.recette = 0;
	}
	public void affiche() {
		System.out.println("Attraction: " + nom + ", Cout: " + cout);
		
	}
	public void utilise(Personne p) {
		if (conditionAge.accesPossible(p)) {
			nbPersonnes++;
			recette+=cout;
		}
		else {
			System.out.println("Acces Interdit pour " + p.getNom() + "(condition d'age respectee)");
		}
	}
	public double getRecette() {
		return recette;
	}
	public String getNom() {
		return nom;
	}
	
	
}
