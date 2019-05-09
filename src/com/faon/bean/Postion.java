package com.faon.bean;

import java.sql.Date;

public class Postion {
	
	private int postionId;
	private Date adate;
	private String  advert_postion;
	private int is_del;
	private Advert  advert;
	public int getPostionId() {
		return postionId;
	}
	public void setPostionId(int postionId) {
		this.postionId = postionId;
	}
	public String getAdvert_postion() {
		return advert_postion;
	}
	public void setAdvert_postion(String advert_postion) {
		this.advert_postion = advert_postion;
	}
	public int getIs_del() {
		return is_del;
	}
	public void setIs_del(int is_del) {
		this.is_del = is_del;
	}
	public Advert getAdvert() {
		return advert;
	}
	public void setAdvert(Advert advert) {
		this.advert = advert;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	

}
