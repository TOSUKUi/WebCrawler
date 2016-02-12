package crawler.data;

import java.util.Date;

public class Project {
	
	
	public Project(int total_maney, String title, int purpose_money, String projector, int num_supporter, int likes,
			Date continue_until, int progress, Date date_get) {
		super();
		this.total_money = total_maney;
		this.title = title;
		this.purpose_money = purpose_money;
		this.projector = projector;
		this.num_supporter = num_supporter;
		this.likes = likes;
		this.continue_until = continue_until;
		this.progress = progress;
		this.date_get = date_get;
	}

	private int total_money;
	private String title;
	private int purpose_money;
	private String projector;
	private int num_supporter;
	private int likes;
	
	private Date continue_until;
	private int progress;
	private Date date_get;
	
	public int getTotal_maney() {
		return total_money;
	}
	public void setTotal_maney(int total_money) {
		this.total_money = total_money;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPurpose_money() {
		return purpose_money;
	}
	public void setPurpose_money(int purpose_money) {
		this.purpose_money = purpose_money;
	}
	public String getProjector() {
		return projector;
	}
	public void setProjector(String projector) {
		this.projector = projector;
	}
	public int getNum_purple() {
		return num_supporter;
	}
	public void setNum_purple(int num_purple) {
		this.num_supporter = num_purple;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Date getContinue_until() {
		return continue_until;
	}
	public void setContinue_until(Date continue_until) {
		this.continue_until = continue_until;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public Date getDate_get() {
		return date_get;
	}
	public void setDate_get(Date date_get) {
		this.date_get = date_get;
	}
	
	public String toJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		sb.append("\"total_money\":");
		sb.append(this.total_money);
		sb.append("\n");
		sb.append("\"title\":");
		sb.append("\"" + this.title + "\"");
		sb.append("\n");
		sb.append("\"porpose_money\":");
		sb.append(this.purpose_money);
		sb.append("\n");
		sb.append("\"projector\":");
		sb.append("\"" + this.projector + "\"");
		sb.append("\n");
		sb.append("\"num_supporter\":");
		sb.append(this.num_supporter);
		sb.append("\n");
		sb.append("\"likes\":");
		sb.append(this.likes);
		sb.append("\n");		
		sb.append("\"continue_until\":");
		sb.append(this.continue_until);
		sb.append("\n");
		sb.append("\"progress\":");
		sb.append(this.progress);
		sb.append("\n");
		sb.append("\"date_get\":");
		sb.append(this.date_get);
		sb.append("\n}");		
		return sb.toString();
	}
	
	public String toXml(){
		return null;
	}
	public Date getDate_begin() {
		return date_begin;
	}
	public void setDate_begin(Date date_begin) {
		this.date_begin = date_begin;
	}
	

}
