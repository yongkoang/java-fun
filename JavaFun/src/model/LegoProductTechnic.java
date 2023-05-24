package model;

import java.sql.Date;
import java.time.LocalDate;

public class LegoProductTechnic extends LegoProduct {
	String productDate = "";
	public int price = 0;	
	public LocalDate date = null;	
	 
	public LegoProductTechnic(int pn, String pname, String pnk, String pdate, int price) {
		this.productNumber = pn;
		this.productName = pname;
		this.productNameKorean = pnk;
		this.productDate = pdate;
		this.price = price;
		
		//yyyy-mm 의 형태를 date로 변경
		date = LocalDate.parse(pdate+"-01");
	}
	
	public void print() {
		System.out.println(productNumber + " " + productName + " " + productNameKorean + " " + productDate + " " + price + " " + date);
	}
}