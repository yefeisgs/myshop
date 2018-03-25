package cn.ahyd.shop.model;

import cn.anyd.shop.dao.ProductDaolmpl;

public class test {
	
	public static void main(String[] args) {
		
		ProductDaolmpl daoImpl = new ProductDaolmpl();
		
		// java web中此处通过表单来进行数据输入
		Product product = new Product();
		product.setName("22笔记本电脑");
		product.setPrice(new Double(99.99));
		product.setRemark("22游戏本!");
		daoImpl.save(product);
	}

}
