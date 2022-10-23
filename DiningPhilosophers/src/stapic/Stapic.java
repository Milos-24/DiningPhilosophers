package stapic;

public class Stapic {
	private boolean free;
	
	public Stapic()
	{
		this.free=true;
	}

	public synchronized void take()
	{
		if(!free)
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		free=false;
	}
	
	public synchronized void release()
	{
		free = true;
		notify();
	}
}
