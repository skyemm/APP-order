package com.web.order;

public class Order {

	private String id ; 
	private String food_id ;
	private String seat  ;
	private String order_date ;
	private String desc ; 
	public String beizhu , price ; 
	public String state ; 
	public String userid ;
	public String tel ;
	
	public String getFood_id() {
		return food_id;
	}
	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	} 
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	} 
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	} 
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	} 
	public String getPrice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	} 
	
	
	
	
}
