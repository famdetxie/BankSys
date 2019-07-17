package com.cx.bank.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutil {
	static String driverClass = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost/banksys";
	static String name = "root";
	static String password = "2332";

	public static Connection getConn() {
		Connection conn = null;

		try {
			Class.forName(driverClass); // jdbc4.0����Բ���ע�ᣬ������ע��
			conn = DriverManager.getConnection(url, name, password);
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/*
	 * �ͷ���Դ
	 */
	public static void release(ResultSet rs, Statement st, Connection conn) {
		closeRs(rs);
		closeSt(st);
		closeConn(conn);

	}

	public static void release(Statement st, Connection conn) {
		closeSt(st);
		closeConn(conn);

	}
	public static void release(ResultSet rs) {
		// TODO Auto-generated method stub
		closeRs(rs);
	}


	private static void closeRs(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			rs = null;
		}
	}

	private static void closeSt(Statement st) {
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			st = null;
		}
	}

	private static void closeConn(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
}

