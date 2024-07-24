package com.ktdsuniversity.edu.array;

// Ctrl + Shift + F

public class Goods {

	private String goodsName;
	private int goodsPrice;
	private int goodsStock;

	public Goods(String goodsName, int goodsPrice, int goodsStock) {
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsStock = goodsStock;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public int getGoodsStock() {
		return goodsStock;
	}

	public void decreaseGoodsStock(int orderNumber) {
		if (this.goodsStock >= orderNumber) {
			this.goodsStock -= orderNumber;
		} else {
			System.out.println("재고가 부족합니다");
		}
	}
}
