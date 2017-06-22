package main;

import view.AddressBook;

/**
 * <code>Run</code> est une classe qui va lancer notre application {@link AddressBook}.
 * Elle contient une méthode main qui initialise tous les éléments pour démarrer l'application.
 * 
 * @author DJABIRI Abalkassim
 *
 */
public class Run {

	/**
	 * Crée un {@link AddressBook} et ensuite le lance.
	 * 
	 * @param args Dans notre cas, il n'y a pas besoin d'arguments au lancement
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		AddressBook carnet = new AddressBook();
	}

}
