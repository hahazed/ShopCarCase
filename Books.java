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
    	return "Ʒ��:"+this.getName()+",����:"+this.getPrice()+",����:"+this.getAuthor()+
                ",������:"+this.getPublish()+",����:"+this.getCount()+",�ܼ�:"+this.getPrice()*this.getCount(); 			
    }
    public String getInfo1() {
    	return "Ʒ��:"+this.getName()+",���ۣ�"+this.getPrice()+
    			",����:"+this.getCount();
    }
}
