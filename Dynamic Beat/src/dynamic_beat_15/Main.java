 package dynamic_beat_15;

public class Main {
	
	public static final int SCREEN_WIDTH = 1280;	//screen width
	public static final int SCREEN_HEIGHT = 720;	//screen height
	
	public static final int NOTE_SPEED = 3;		//speed that note drops
	public static final int SLEEP_SPEED = 10;	//delay before note drops
	public static final int REACH_TIME = 2;

	public static void main(String[] args) {
		 
		new DynamicBeat();
		
	}
}
