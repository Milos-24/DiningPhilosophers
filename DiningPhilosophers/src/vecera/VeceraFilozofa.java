package vecera;
import filozof.Filozof;
import stapic.Stapic;


public class VeceraFilozofa {

	private static int n = 5;
	
	public static void main(String[] args){
		Stapic[] stapici = new Stapic[n];
		Filozof[] filozofi = new Filozof[n];
		
		for(int i = 0 ; i<n ; i++)
		{
			stapici[i] = new Stapic();
		}
		
		for(int i = 0 ; i<n ; i++)
		{
			filozofi[i]=new Filozof(i+1, stapici[(i-1+n)%n], stapici[i], (i+1)%2 == 1 ? "L" : "R");
			filozofi[i].start();
		}
	}

}
