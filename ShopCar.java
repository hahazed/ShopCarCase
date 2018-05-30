package org.oyj.goos;

public class ShopCar {
     private Goods[] goods;
     private int foot;
     public ShopCar(int len) {
    	 if(len>0) {
    		 this.goods=new Goods[len];
    	 }else {
    		 this.goods=new Goods[1];
    	 }
     }
     public boolean add(Goods goods) {
    	 if(this.foot<this.goods.length) {
    		 this.goods[foot]=goods;
    		 foot++;
    		 return true;
    	 }else {
    		 return false;
    	 }
     }
     public Goods[] search(String keyword) {
    	 Goods g[]=null;
    	 int count=0;
    	 for(int i=0;i<this.goods.length;i++) {
    		 if(this.goods[i]!=null) {
    			 if(this.goods[i].getName().indexOf(keyword)!=-1) {
    				 count++;
    			 }
    		 }
    	 }
    	 g=new Goods[count];
    	 int foot=0;
    	 for(int i=0;i<this.goods.length;i++) {
    		 if(this.goods!=null) {
    			 if(this.goods[i].getName().indexOf(keyword)!=-1) {
    				 g[foot]=this.goods[i];
    				 foot++;
    			 }
    		 }
    	 }
    	 return g;
     }
     public Goods[] getContent() {
    	 return this.goods;
     }
}
