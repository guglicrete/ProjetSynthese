package ca.qc.cgodin.Modele;

public abstract class Client {
	protected String id;
	protected String nom;
	protected Adresse adr;
	protected Telephone tel;
	protected String courriel;
	
	
	public Client(String id, String nom, Adresse adr, Telephone tel, String courriel) {
	
		this.id = id;
		this.nom = nom;
		this.adr = adr;
		this.tel = tel;
		this.courriel = courriel;
	}
	
	
	
	
}
