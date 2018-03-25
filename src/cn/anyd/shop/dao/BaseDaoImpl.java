package cn.anyd.shop.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.anyd.shop.util.JdbcUtil;


public abstract class BaseDaoImpl<T> {

	protected abstract T getRow(ResultSet rs) throws SQLException;

	public T getById(String sql, Object id) {

		T t = null;

		Connection conn = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		
	
		try {
			conn = JdbcUtil.getConnection();
			
			pre = conn.prepareStatement(sql);
			pre.setObject(1, id);
			rs = pre.executeQuery();
			
			
			if (rs.next()) {
				t = this.getRow(rs);
				
			}
			return t;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.close(conn, pre, rs);
		}

	}

	protected ArrayList<T> queryByBame(String sql, Object[] param) {

		ArrayList<T> tList = new ArrayList<T>();
		

		Connection conn = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		
		try {
			conn = JdbcUtil.getConnection();
			pre = conn.prepareStatement(sql);
			
			for (int i = 0; i < param.length; i++){
				
				pre.setObject(i+1, param[i]);
			
			}
			rs = pre.executeQuery();
			
			while (rs.next()) {
				tList.add(this.getRow(rs));
				
			}
			return tList;
			

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.close(conn, pre, rs);
		}

	}
	
	protected void update(String sql, Object[] param) {

		Connection connection = JdbcUtil.getConnection();

		PreparedStatement pre;

		try {
			pre = connection.prepareStatement(sql);

			/// pre.setString(1, product.getName());
			// pre.setDouble(2, product.getPrice().doubleValue());
			// pre.setString(3, product.getRemark());
			for (int i = 0; i < param.length; i++) {

				pre.setObject(i + 1, param[i]);

			}

			pre.executeUpdate();

			connection.close();

		} catch (Exception e) {
			throw new RuntimeException(e);

		}

	}

}