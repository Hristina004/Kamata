
import java.util.Scanner;
public class kamata {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int depozit;
		int Kamata;
		int depozit_posle_k;
		int depozit_edna_god;
		System.out.println ("Vnesi depozit: ");
	    depozit= input.nextInt();
		
		System.out.println ("Vnesi kamata: ");
		Kamata=input.nextInt();
		depozit_posle_k=((depozit/1000)*(Kamata)+depozit);
		
		System.out.println ("Za 1 mesec ");
		System.out.print(depozit_posle_k);
		System.out.println ("Za 1 god: ");
		depozit_edna_god = depozit_posle_k + ((depozit/100) *(kamata)*12);
		
		System.out.print(depozit_edna_god);
}
	
}