package org.oyj.goos;

public class Cloths extends Goods {
	 private String title;
     private String style;
     public Cloths(String name,float price,int count,String title,String stytle) {
    	 super(name,price,count);
    	 this.setTitle(title);
    	 this.setStyle(stytle);
    	 
     }	
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getInfo() {
    	return "Ʒ��:"+this.getName()+",����:"+this.getPrice()+",Ʒ��:"+this.getTitle()+
                ",��ʽ:"+this.getStyle()+",����:"+this.getCount()+",�ܼ�:"+this.getPrice()*this.getCount(); 			
    }
    public String getInfo1() {
    	return "Ʒ��:"+this.getName()+",���ۣ�"+this.getPrice()+
    			",����:"+this.getCount();
    }
}
