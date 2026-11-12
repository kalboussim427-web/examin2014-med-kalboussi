package ex2;

public class ConditionAge implements ConditionAccess{
	private int ageMin;
	
	
	public ConditionAge(int ageMin) {
		this.ageMin=ageMin;
	}
	
	public boolean accesPossible(Personne p) {
		return p.getAge() > ageMin;
	}

}
