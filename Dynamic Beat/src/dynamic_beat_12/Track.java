package dynamic_beat_12;

public class Track {
	
	private String titleImage;	//Image of title
	private String startImage;	//Image of the song shown on selection page
	private String gameImage;	//Image of the song shown on actual game
	private String startMusic;	//Music of the song playing on selection page
	private String gameMusic;	//Music of the song playing on actual game
	private String titleName;	//Title of the song
	
	//constructor
	public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic, String titleName) {
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
		this.titleName = titleName;
	}
	
	//getter and setter methods
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	
}
