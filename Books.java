package org.oyj.goos;

public class Books extends Goods {
     private String author;
     private String publish;
     public Books(String name,float price,int count,String author,String publish) {
    	 super(name,price,count);
    	 
     }
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
    public String getInfo() {
    	return "品名:"+this.getName()+",单价:"+this.getPrice()+",作者:"+this.getAuthor()+
                ",出版社:"+this.getPublish()+",数量:"+this.getCount()+",总价:"+this.getPrice()*this.getCount(); 			
    }
    public String getInfo1() {
    	return "品名:"+this.getName()+",单价；"+this.getPrice()+
    			",数量:"+this.getCount();
    }
}
