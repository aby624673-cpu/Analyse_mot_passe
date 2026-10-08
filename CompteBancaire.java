import java.util.Scanner;
public class CompteBancaire{
    String titulaire;
    double solde;
    public CompteBancaire(String titulaire, double solde){
        this.titulaire=titulaire;
        this.solde=solde;
    }
    public void afficherCompte(){
        System.out.println("titulaire : " + titulaire + "solde : " + solde);
    }
    public void deposer(double montant){
        this.solde=solde+montant;
    }
    public boolean retirer(double montant){
        if(solde>=montant){
            solde=solde-montant;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean estDecouvert(){
            return solde < 0;
        
    }
    public static void main(String[]args){
        int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("le nombre de compte:");
        int n = sc.nextInt();
        sc.nextLine();
        CompteBancaire[] compte= new CompteBancaire[n];
        for(i=0;i<n;i++){
            System.out.println("titulaire :"+ i+1);
            String titulaire=sc.nextLine();
            System.out.println("solde initial :");
            double solde= sc.nextDouble();
            sc.nextLine();
            compte[i]=new CompteBancaire(titulaire, solde);
        }
        
        for(i=0;i<n;i++){
            
            compte[i].afficherCompte();
        System.out.println("montant a deposer:");
        double montantDeposer=sc.nextDouble();
        compte[i].deposer(montantDeposer);
        }
        

        for(i=0;i<n;i++){
             
            compte[i].afficherCompte();
        System.out.println("montant a retirer:");
        double montant= sc.nextDouble();

        boolean ok = compte[i].retirer(montant);
        if(ok){
            System.out.println("retrait ");
        }else{
             System.out.println("solde insuffisant ");
        }
        if(compte[i].estDecouvert()){
            System.out.println("Attention compte a decouvert");
        }
    }
        sc.close();
    

    }
  

}