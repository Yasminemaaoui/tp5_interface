package tp5_abstraite_interface;

public class Villa extends ProprietePrivee{
	private Boolean avecPicine;

	public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, Boolean avecPicine) {
		super(id, responsable, adresse, surface, nbPieces);
		this.avecPicine = avecPicine;
	}

	public Boolean getAvecPicine() {
		return avecPicine;
	}

	public void setAvecPicine(Boolean avecPicine) {
		this.avecPicine = avecPicine;
	}

	@Override
	public String toString() {
		return super.toString()+"Villa [avecPicine=" + avecPicine + "]";
	}
	
	
	@Override
	public double calculImpot() {
        if(avecPicine==true) {
        	return super.calculImpot()+200;
        }
		return 0;

	}
	
}
