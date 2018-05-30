package org.oyj.goos;

public class Lake {
     public static void main(String args[]) {
    	 ShopCar sh=new ShopCar(6);
    	 sh.add(new Books("疯狂Java",69.9f,1,"李刚","清华大学出版社"));
    	 sh.add(new Books("疯狂AJAX",79.9f,5,"李刚","电子大学出版社"));
    	 sh.add(new Books("Oracle实战",99.9f,3,"李兴华","清华大学出版社"));
    	 sh.add(new Cloths("T桖",109.9f,2,"李宁","男士M"));
    	 sh.add(new Cloths("牛仔",169.9f,3,"森马","女士l"));
    	 sh.add(new Books("村社",129.9f,1,"杰克","男士L"));
    	 System.out.println("=========已买到的商品清单=========");
    	 print1(sh.getContent());
    	 System.out.println("=========查询到商品的信息=========");
    	 try {
    		 print(sh.search(args[0]));
    	 }catch(Exception e) {
           System.out.println("未输入要查询的商品或者输入错误"+
    	      "格式为:\njava Test 商品名");
    	 }
    	 
     }
     public static void print1(Goods goods[]) {
    	 for(int i=0;i<goods.length;i++) {
    		 System.out.println(goods[i].getInfo1());
    	 }
     }
     public static void print(Goods goods[]) {
    	 for(int i=0;i<goods.length;i++) {
    		 System.out.println(goods[i].getInfo());
    	 }
     }
}
