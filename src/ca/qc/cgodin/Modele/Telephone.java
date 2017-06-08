package ca.qc.cgodin.Modele;

public class Telephone {
	protected String principal;
	protected String secondaire;
	protected String mobile;
	protected String telecopieur;
	protected int postePrinc;
	protected int posteSec;
	
	
	public Telephone(String principal, String secondaire, String mobile, String telecopieur, int postePrinc, int posteSec) {
	
		this.principal = principal;
		this.secondaire = secondaire;
		this.mobile = mobile;
		this.telecopieur = telecopieur;
		this.postePrinc = postePrinc;
		this.posteSec = posteSec;
	}


	@Override
	public String toString() {
		return principal + ", " + secondaire + ", " + mobile + ", " + telecopieur + ", " + postePrinc + ", " + posteSec;
	}
	
	
}
