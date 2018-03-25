package cn.ahyd.shop.model;

import cn.anyd.shop.dao.ProductDaolmpl;

public class update {
	public static void main(String[] args) {
		
		ProductDaolmpl daoImpl = new ProductDaolmpl();
		
		// java web中此处通过表单来进行数据输入
		Product product = new Product();
		product.setName("111笔记本电脑");
		product.setPrice(new Double(100.99));
		product.setRemark("111游戏本!");
		product.setId(new Integer(9));
		daoImpl.update(product);
	}

}
