package cn.anyd.shop.dao;

import cn.ahyd.shop.dao.ProductDaolmpl;
import cn.ahyd.shop.model.Product;

public class select {
	public static void main(String[] args) {

		ProductDaolmpl daoImpl = new ProductDaolmpl();

		// java web中此处通过表单来进行数据输入
		Product byid = daoImpl.getById(3);
		System.out.print(byid);
	}
}