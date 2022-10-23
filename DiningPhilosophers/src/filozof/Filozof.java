package filozof;
import stapic.Stapic;


public class Filozof extends Thread{
	private int brojFilozofa;
	
	private Stapic prvi;
	private Stapic drugi;
	
	
	
	
	public Filozof(int brojFilozofa, Stapic lijevi, Stapic desni, String tip)
	{
		this.brojFilozofa=brojFilozofa;
		
		if(tip.equals("L"))
		{
			this.prvi=lijevi;
			this.drugi=desni;
		}
		else
		{
			this.prvi=desni;
			this.drugi=lijevi;
		}
		
		
	}
	
	public void run() {
		
			System.out.println("Filozof_" + this.brojFilozofa + " razmislja");
			
			prvi.take();
			System.out.println("Filozof_" + this.brojFilozofa + " je uzeo" + (this.brojFilozofa % 2 == 1 ? " lijevi stapic" : " desni stapic"));
			
			try {
				sleep(1000);
			}catch(Exception e) { }
			
			drugi.take();
			System.out.println("Filozof_" + this.brojFilozofa + " je uzeo" + (this.brojFilozofa % 2 == 1 ? " desni stapic" : " lijevi stapic"));
			
			System.out.println("Filozof_" + this.brojFilozofa + " jede...");
			
			this.prvi.release();
			this.drugi.release();
			
			
			System.out.println("Filozof_" + this.brojFilozofa + " je zavrsio sa jelom (spustio stapice)");
			
		
	}
}
