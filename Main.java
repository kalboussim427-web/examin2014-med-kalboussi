package ex2;

public class Main {
	public static void main(String[] args) {
		ParcAttraction monParc = new ParcAttraction("Carthage Land" , 3);
		
		Personne p1 = new Personne("Ali", 16 , 175);
		Personne p2 = new Personne("Sami", 10, 140);
		Personne p3 = new Personne ("Mouna", 20, 165);
		
		
		ConditionAge cond12 = new ConditionAge(12);
		
		Attraction a1 = new Attraction("Montagnes Russes" , 5.0 , cond12);
		Attraction a2 = new Attraction("Bateau Pirates" , 3.5 , cond12);
	
		monParc.ajouterAttraction(a1);
		monParc.ajouterAttraction(a2);
		
		a1.utilise(p1);
		a1.utilise(p2);
		a2.utilise(p3);
		
		System.out.println("Etat du parc et recettes");
		monParc.affiche();
		
		System.out.println("Recette total  : " + monParc.getRecette() + " Dinars");
		
	}


}
