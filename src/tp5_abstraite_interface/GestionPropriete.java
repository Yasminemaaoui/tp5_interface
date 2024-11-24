package tp5_abstraite_interface;

public interface GestionPropriete {
	
	final int MAX_PROPRIETES=100;
	
	void afficherPropriétés();
	
	boolean ajouter(Propriete p);
	
	boolean supprimer(Propriete p);
	

}
