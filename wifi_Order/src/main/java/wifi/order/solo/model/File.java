package wifi.order.solo.model;

public class File {
	
	private int fidx;
	private String origFilename;
	private String filename;
	private String filepath;
	private int iidx;
	
	
	public File() {
		
	}
	
	public File(int fidx, String origFilename, String filename, String filepath, int iidx) {
		super();
		this.fidx = fidx;
		this.origFilename = origFilename;
		this.filename = filename;
		this.filepath = filepath;
		this.iidx = iidx;
	}
	
	public int getFidx() {
		return fidx;
	}
	public void setFidx(int fidx) {
		this.fidx = fidx;
	}
	public String getOrigFilename() {
		return origFilename;
	}
	public void setOrigFilename(String origFilename) {
		this.origFilename = origFilename;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public int getIidx() {
		return iidx;
	}
	public void setIidx(int iidx) {
		this.iidx = iidx;
	}
	
	

}
