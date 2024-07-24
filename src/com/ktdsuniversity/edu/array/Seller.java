package com.ktdsuniversity.edu.array;

public class Seller {

	private Goods[] goods;

	public Seller(Goods[] goods) {
		this.goods = goods;
	}

	public void sell(String goodsName, int orderNumber) {
		for (int i = 0; i < goods.length; i++) {
			if (goods[i].getGoodsName().equals(goodsName)) {
				int goodsStock = goods[i].getGoodsStock();
				if (goodsStock < orderNumber || goodsStock == 0) {
					System.out.println("판매할 수 없습니다");
					return;
				}
				goods[i].decreaseGoodsStock(orderNumber);
				System.out.println(goods[i].getGoodsName() + "을/를 " + orderNumber + "개 판매하였습니다");
				return;
			}
		}
		System.out.println("없는 상품입니다");
	}
}
