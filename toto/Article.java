package toto;

public class Article {
	private int id;
	private String libelle;
	private double prix;
	
	public int getid() {
        return id;
    }

    public String getlibelle() {
        return libelle;
    }

    public void setlibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getprix(){
        return prix;
    }

    public void setprix(double prix) {
        if (prix>0) {
            this.prix = prix;
     }
    }
	@Override
	public String toString() {
		return "Article [id=" + id + ", libelle=" + libelle + ", prix=" + prix + "]";
	}

	public Article (int id, String libelle, double prix) {
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
	}
}
