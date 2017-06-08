package ca.qc.cgodin.Modele;

public class Adresse {
	protected int numero;
	protected String rue;
	protected String ville;
	protected String province;
	protected String codePostal;
	protected String pays;
	
	public Adresse(int numero, String rue, String ville, String province, String codePostal, String pays) {
	
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.province = province;
		this.codePostal = codePostal;
		this.pays = pays;
	}

	@Override
	public String toString() {
		return numero + ", " + rue + ", " + ville + ", " + province	+ ", " + codePostal + ", " + pays;
	}
	
	
	
	
}
