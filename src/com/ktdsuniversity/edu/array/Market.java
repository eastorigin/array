package com.ktdsuniversity.edu.array;

public class Market {

	public static void main(String[] args) {

		Goods tissue = new Goods("화장지", 1000, 32);
		Goods water = new Goods("생수", 500, 14);
		Goods pen = new Goods("펜", 3000, 6);

		Goods[] goodsArray = { tissue, water, pen };
		Seller seller = new Seller(goodsArray);

		seller.sell("화장지", 11);
		seller.sell("생수", 20);
		seller.sell("펜", 6);
		seller.sell("펜", 3);
		seller.sell("시계", 1);
	}

}
