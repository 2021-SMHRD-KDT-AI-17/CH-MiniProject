package Music;

public class Music {

	// 1) 경로
	private String path;
 	// 2) 제목 
	private String title;
	
	
	public Music(String path, String title) {
		super();
		this.path = path;
		this.title = title;
	}
	
	// Getter / Setter 
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
