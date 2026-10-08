import java.util.Scanner;
public class GestionNotes{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int choix;
        do{
            System.out.println("=====GESTION DES NOTES=====");
            System.out.println("nom de l etudiant");
            String nom = sc.nextLine();
            System.out.println("note1:");
            double note1 = sc.nextDouble();
             System.out.println("note2:");
            double note2 = sc.nextDouble();
             System.out.println("note3:");
            double note3 = sc.nextDouble();
            sc.nextLine();
            double moyenne=(note1+note2+note3)/3;
            System.out.println("la moyenne est :"+ moyenne);
            if(moyenne >= 10){
                System.out.println("Admis");
 		if(moyenne >= 16){
                 System.out.println("Mention Tres Bien");
            	}
            	else if(moyenne >= 14){
                 	System.out.println("Mention Bien");
            	}
            	else if(moyenne >= 12){
                 	System.out.println("Mention Assez Bien");
            	}
            	else if(moyenne >= 10){
                	 System.out.println("Mention Passable");
            	}

            	}
            else{
                 System.out.println("Ajournee");
            }
           
            	
            System.out.println("voulez  vous recommencer");
            choix =sc.nextInt();
            sc.nextLine();
        }while(choix==1);
         System.out.println("Fin du programme");

    }
}