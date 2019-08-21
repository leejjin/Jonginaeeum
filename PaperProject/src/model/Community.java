package model;

public class Community {
	
	int commu_id;
	String email;
	String commu_title;
	String commu_content;
	String commu_date;
	int commu_hit;
	int commu_open;
	
	public Community() {}
	
	public Community(int commu_id, String email, String commu_title, String commu_content, String commu_date,
			int commu_hit, int commu_open) {
		this.commu_id = commu_id;
		this.email = email;
		this.commu_title = commu_title;
		this.commu_content = commu_content;
		this.commu_date = commu_date;
		this.commu_hit = commu_hit;
		this.commu_open = commu_open;
	}

	public int getCommu_id() {
		return commu_id;
	}
	public void setCommu_id(int commu_id) {
		this.commu_id = commu_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCommu_title() {
		return commu_title;
	}
	public void setCommu_title(String commu_title) {
		this.commu_title = commu_title;
	}
	public String getCommu_content() {
		return commu_content;
	}
	public void setCommu_content(String commu_content) {
		this.commu_content = commu_content;
	}
	public String getCommu_date() {
		return commu_date;
	}
	public void setCommu_date(String commu_date) {
		this.commu_date = commu_date;
	}
	public int getCommu_hit() {
		return commu_hit;
	}
	public void setCommu_hit(int commu_hit) {
		this.commu_hit = commu_hit;
	}
	public int getCommu_open() {
		return commu_open;
	}
	public void setCommu_open(int commu_open) {
		this.commu_open = commu_open;
	}
	
	@Override
	public String toString() {
		return "Community [commu_id=" + commu_id + ", email=" + email + ", commu_title=" + commu_title
				+ ", commu_content=" + commu_content + ", commu_date=" + commu_date + ", commu_hit=" + commu_hit
				+ ", commu_open=" + commu_open + "]";
	}

	
}
