package com.lala.fapp.contact.memoryday;

public class ContactMemorydayDto {

	private String seq;
	private int main;
	private String type;
	private String date;
	private int solar;
	private String contact_seq;
	
	public String getSeq() {
		return seq;
	}
	
	public void setSeq(String seq) {
		this.seq = seq;
	}
	
	public int getMain() {
		return main;
	}
	
	public void setMain(int main) {
		this.main = main;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getSolar() {
		return solar == 1 ? "양력" : "음력";
	}
	
	public void setSolar(int solar) {
		this.solar = solar;
	}
	
	public String getContact_seq() {
		return contact_seq;
	}
	
	public void setContact_seq(String contact_seq) {
		this.contact_seq = contact_seq;
	}

}
