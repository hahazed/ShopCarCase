package org.oyj.goos;

public class Lake {
     public static void main(String args[]) {
    	 ShopCar sh=new ShopCar(6);
    	 sh.add(new Books("���Java",69.9f,1,"���","�廪��ѧ������"));
    	 sh.add(new Books("���AJAX",79.9f,5,"���","���Ӵ�ѧ������"));
    	 sh.add(new Books("Oracleʵս",99.9f,3,"���˻�","�廪��ѧ������"));
    	 sh.add(new Cloths("T��",109.9f,2,"����","��ʿM"));
    	 sh.add(new Cloths("ţ��",169.9f,3,"ɭ��","Ůʿl"));
    	 sh.add(new Books("����",129.9f,1,"�ܿ�","��ʿL"));
    	 System.out.println("=========���򵽵���Ʒ�嵥=========");
    	 print1(sh.getContent());
    	 System.out.println("=========��ѯ����Ʒ����Ϣ=========");
    	 try {
    		 print(sh.search(args[0]));
    	 }catch(Exception e) {
           System.out.println("δ����Ҫ��ѯ����Ʒ�����������"+
    	      "��ʽΪ:\njava Test ��Ʒ��");
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
