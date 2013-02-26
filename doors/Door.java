package doors;

public class Door {
	boolean open = false;
	
	public void toggle() {
		open = !open;
	}	
	
	public  boolean isOpen(){
		return open;
	}
}
