import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Course {

	public static void main(String[] args) {
// proposer au joueur de jouer 
	Scanner Scanner = new Scanner (System.in);
	
	boolean play = true; 
	
	while(play) {
		System.out.println("Souhaitez-vous jouer ? Oui/Non");
		String response = Scanner.nextLine();
	
		if (response.equals("Oui") || response.equals("oui")) {
			Set <Integer>horse=horseRace();
			showResult(horse);
		
		}else{
			System.out.println("à bientôt");
			play = false;
		}
	}
	Scanner.close();
	
}
	
		// générer un nombre 
public static Set <Integer> horseRace() {
	Random random = new Random();
// le set est une collection qui permet de ne pas faire de doublon on s'assure que chaque numéro de cheval est unique
	Set < Integer> horse = new HashSet<>();//HashSet stocke des éléments et permet d'ajouter et de suprimer ce qui a déjà été suggéré par la méthode random
//selectionner 3 chevaux
	while (horse.size() <3) {
		int randomNumber =random.nextInt(20)+1;
		horse.add(randomNumber);
			
	}
	return horse;
}
		
public static void showResult(Set<Integer>horse) {
//iterator permet de parcourir les éléments du HashSet des horses et les affiches. Sans cela ça ne fonctionne pas
	Iterator<Integer>iterator = horse.iterator();
	while (iterator.hasNext()){
		int horseWin = iterator.next();
		System.out.println("les chevaux " + horseWin + "" + "ont gagné la course");
	}
		
	
}
		
}

		

	


//créer un programme simulant une course de chevaux 
// afficher aléatoirement les trois premiers arrivés
// propose au joueur d'arrêter ou non le jeu'