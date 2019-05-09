package com.faon.bean;

import java.sql.Date;

/**
 * id INT PRIMARY KEY AUTO_INCREMENT,
content VARCHAR(20)  NOT NULL,
commentdate DATE,
users_id INT ,
goods_id INT,
 * @author Faon
 * 2019年5月7日
 */
public class Comments {

	private int commentsId;
	private String content;
	private Date commentDate;
	private int uId;
	private int gId;
	private int is_del;
	public int getCommentsId() {
		return commentsId;
	}
	public void setCommentsId(int commentsId) {
		this.commentsId = commentsId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int getIs_del() {
		return is_del;
	}
	public void setIs_del(int is_del) {
		this.is_del = is_del;
	}
	
	
	
}
