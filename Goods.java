package org.oyj.goos;

abstract class Goods {
    private String name;
    private float price;
    private int count;
    public Goods(String name,float price,int count) {
    	this.setName(name);
    	this.setPrice(price);
    	this.setCount(count);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
    public String getInfo1() {
    	  return "品名:"+this.getName()+
    			  ",单价"+this.getPrice()+",数量:"+this.getCount();
    }
    public abstract String getInfo() ;
}
