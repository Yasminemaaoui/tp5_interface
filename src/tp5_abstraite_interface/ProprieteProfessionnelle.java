package tp5_abstraite_interface;

public class ProprieteProfessionnelle extends Propriete{
	private int nbEmploye;
	private Boolean estEtatique;
	
	
	public ProprieteProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmploye,
			Boolean estEtatique) {
		super(id, responsable, adresse, surface);
		this.nbEmploye = nbEmploye;
		this.estEtatique = estEtatique;
	}
	
	
	
	public int getNbEmploye() {
		return nbEmploye;
	}



	public void setNbEmploye(int nbEmploye) {
		this.nbEmploye = nbEmploye;
	}



	public Boolean getEstEtatique() {
		return estEtatique;
	}



	public void setEstEtatique(Boolean estEtatique) {
		this.estEtatique = estEtatique;
	}


	
	@Override
	public String toString() {
		return super.toString()+"ProprieteProfessionnelle [nbEmploye=" + nbEmploye + ", estEtatique=" + estEtatique + "]";
	}


    @Override
    public double calculImpot() {
        if (estEtatique) {
            return 0;
        } else {
            return (100 * getSurface() / 100) + (30 * nbEmploye);
        }
    }
	
	
	
}
