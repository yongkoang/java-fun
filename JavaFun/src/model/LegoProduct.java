package model;

public class LegoProduct {
	public int productNumber = 0;
	String productName = "";
	String productNameKorean = "";
	
	LegoProduct() {
		
	}
	
	LegoProduct(int pn, String pname, String pnk) {
		this.productNumber = pn;
		this.productName = pname;
		this.productNameKorean = pnk;
	}
	
	public void print() {		
		System.out.println(productNumber + " " + productName + " " + productNameKorean);
	}

}
