package cn.ahyd.shop.model;

import cn.anyd.shop.dao.ProductDaolmpl;

public class delete {
	
public static void main(String[] args) {
		
		ProductDaolmpl daoImpl = new ProductDaolmpl();
		
		// java web中此处通过表单来进行数据输入
		
		//product.setId(new Integer(8));
		daoImpl.delete(9);
	}

}
