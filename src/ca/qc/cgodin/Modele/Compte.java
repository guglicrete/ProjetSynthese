package ca.qc.cgodin.Modele;

public class Compte implements Comparable<Compte> {
	private String numero;
	private String type;
	private double solde;
	private String devise;
	


	public Compte(String numero, String type, double solde, String devise) {
		this.numero = numero;
		this.type = type;
		this.solde = solde;
		this.devise = devise;
		
		
	}
	
	public Compte(String numero) {
		this(numero, "Cheque", 0, "CAD");
	}


	public String toString() {
		return numero + " " + type + " " + solde + " " + devise;
	}


	public int compareTo(Compte autre) {
		return this.numero.compareTo(autre.numero);
	}
	
	public boolean equals(Object autre) {
		Compte c = (Compte) autre;
		return this.numero.equalsIgnoreCase(c.numero);
	}

	public String getNumero() {
		return numero;
	}

	public String getType() {
		return type;
	}

	public double getSolde() {
		return solde;
	}

	public String getDevise() {
		return devise;
	}
}
