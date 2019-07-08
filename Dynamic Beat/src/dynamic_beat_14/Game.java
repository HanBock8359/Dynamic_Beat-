package dynamic_beat_14;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game extends Thread{

	// ---- Game: Note judgement line image ----
	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();
	// ---- Game: Note judgement line image ----
	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/jugdementLine.png")).getImage();
	// ---- Game: Note Route line image ----
	private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();
	
	// ---- Game: Note Route line image ----
	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	
	private String titleName;
	private String difficulty;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList = new ArrayList<Note>();
	
	public Game(String titleName, String difficulty, String musicTitle) {
		this.titleName = titleName;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		this.gameMusic = new Music(this.musicTitle, false);
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteSImage, 228, 30, null);
		g.drawImage(noteRouteDImage, 332, 30, null);
		g.drawImage(noteRouteFImage, 436, 30, null);
		g.drawImage(noteRouteSpace1Image, 540, 30, null);
		g.drawImage(noteRouteSpace2Image, 640, 30, null);
		g.drawImage(noteRouteJImage, 744, 30, null);
		g.drawImage(noteRouteKImage, 848, 30, null);
		g.drawImage(noteRouteLImage, 952, 30, null);
		
		g.drawImage(noteRouteLineImage, 224, 30, null);
		g.drawImage(noteRouteLineImage, 328, 30, null);
		g.drawImage(noteRouteLineImage, 432, 30, null);
		g.drawImage(noteRouteLineImage, 536, 30, null);
		g.drawImage(noteRouteLineImage, 740, 30, null);
		g.drawImage(noteRouteLineImage, 844, 30, null);
		g.drawImage(noteRouteLineImage, 948, 30, null);
		g.drawImage(noteRouteLineImage, 1052, 30, null);
		
		//judgement line
		g.drawImage(gameInfoImage, 0, 660, null);
		g.drawImage(judgementLineImage, 0, 580, null);
		
		//draws notes
		for(int i = 0; i < noteList.size(); i++) {
			Note note = noteList.get(i);
			note.screenDraw(g);
		}

		//Text anti-aliasing
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);	//texts are now smooth
		g.setColor(Color.white);
		
		//Artist Info, difficulty info
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702);
		g.drawString(difficulty, 1180, 702);
		
		//Keypad info
		g.setFont(new Font("Arial", Font.PLAIN, 26));
		g.setColor(Color.DARK_GRAY);
		g.drawString("S", 270, 609);
		g.drawString("D", 374, 609);
		g.drawString("F", 478, 609);
		g.drawString("SPACE", 600, 609);
		g.drawString("J", 784, 609);
		g.drawString("K", 889, 609);
		g.drawString("L", 993, 609);

		///Score info
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("000000", 565, 702);
		
		
	}
	
	//change image of corresponding keypads
	public void pressS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBeat1.mp3", false).start();
	}
	public void releaseS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	public void pressD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBeat1.mp3", false).start();
	}
	public void releaseD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	public void pressF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBeat1.mp3", false).start();
	}
	public void releaseF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	public void pressSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBeat1.mp3", false).start();
	}
	public void releaseSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	public void pressJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBeat1.mp3", false).start();
	}
	public void releaseJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	public void pressK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBeat1.mp3", false).start();
	}
	public void releaseK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	public void pressL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBeat1.mp3", false).start();
	}
	public void releaseL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	
	@Override
	public void run() {
		dropNotes();
	}
	
	public void close() {
		gameMusic.close();
		this.interrupt();
	}
	
	//drops notes
	public void dropNotes() {
		Beat[] beats = null;
		
		if(titleName.equals("Joakim Karud - Mighty Love")){
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125;
			beats = new Beat[] {
					new Beat(startTime, "S"),
					new Beat(startTime + gap * 2, "D"),
					new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"),
				};
		}
		else if(titleName.equals("Shahed - Indian Fusion")) {
			int startTime = 1000 - Main.REACH_TIME * 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space"),
				};
		}
		else if(titleName.equals("Tobu - Colors")) {
			int startTime = 1000 - Main.REACH_TIME * 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space"),
				};
		}

		int i = 0;
		
		//music starts
		gameMusic.start();
		
		while(i < beats.length && !isInterrupted()) {
			boolean dropped = false;
			
			if(beats[i].getTime() <= gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName());
				note.start();
				noteList.add(note);
				i++;
				dropped = true;
			}
			
			if(!dropped) {
				try {
					Thread.sleep(5);
				}
				catch (Exception e){
					System.out.println(e.getMessage());
				}
			}
			
		}

	}
	
	
	
}
