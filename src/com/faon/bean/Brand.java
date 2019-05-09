package com.faon.bean;

import java.sql.Date;

public class Brand {
	private int brandId;
	private String bname;
	private Date  bregdate;
	private Goods goods;
	private int is_del;
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Date getBregdate() {
		return bregdate;
	}
	public void setBregdate(Date bregDate) {
		this.bregdate = bregDate;
	}
	
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getIs_del() {
		return is_del;
	}
	public void setIs_del(int is_del) {
		this.is_del = is_del;
	}
	
	

}
