public class Tarif{
public static void main(String[] args){
	int n = 45;
	double prix;
	
	if(n <= 10){
		prix = n * 0.10;
		
	}
	else if(n > 10 && n <= 30){
		prix = 10 * 0.10 + (n - 10) * 0.08;
		

	}
	else {
		prix = 10 * 0.10 + 20 * 0.08 + (n - 30) * 0.07;
		

	}
	System.out.println("le prix total" + "des nombres des copies est" + prix);
}
}
