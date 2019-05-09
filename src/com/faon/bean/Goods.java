package com.faon.bean;
/**
 * id INT PRIMARY KEY AUTO_INCREMENT,
gimg VARCHAR(20)  NOT NULL comment '存储图片URL',
gname VARCHAR(20)  NOT NULL,
inventory INT comment '库存',
price DOUBLE ,
shelf INT not null DEFAULT 0  comment '是否上架' CHECK(shelf=0 OR shelf=1),
brand_id INT,
class_id INT,
 * @author Faon
 * 2019年5月7日
 */
public class Goods {

	private int goodsId;
	private  String gimg;
	private  String gname;
	private  int inventory;
	private int offer;
	private Double price;
	private int shelf;
	private int bId;
	private int cId;
	private Comments comments;
	private int is_del;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGimg() {
		return gimg;
	}
	public void setGimg(String gimg) {
		this.gimg = gimg;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getShelf() {
		return shelf;
	}
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public Comments getComments() {
		return comments;
	}
	public void setComments(Comments comments) {
		this.comments = comments;
	}
	public int getIs_del() {
		return is_del;
	}
	public void setIs_del(int is_del) {
		this.is_del = is_del;
	}
	
	
}
