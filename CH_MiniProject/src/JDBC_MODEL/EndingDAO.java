package JDBC_MODEL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EndingDAO {

	// 결말 DAO
	
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String user = "campus_23K_AI17_p1_6";
			String password = "smhrd6";

			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//==========================getConn============================
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	//==========================close============================
	
	public EndingDTO okji() {
		
		EndingDTO result = null;
		
		
		try {
			getConn();
			
			String sql = "select * from ending where end = 'okji'";
			
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			
			if(rs.next()) {
				int getch = rs.getInt(2);
				int gethp = rs.getInt(3);
				int getcode = rs.getInt(4);
				int getstress = rs.getInt(5);
				int getlot = rs.getInt(6);
				
				result.setCh(getch);
				result.setHp(gethp);
				result.setCode(getcode);
				result.setStree(getstress);
				result.setlot(getlot);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return result;
	}
	//==============okji============
public EndingDTO hpOut() {
		
		EndingDTO result = null;
		
		
		try {
			getConn();
			
			String sql = "select * from ending where end = 'hpOut'";
			
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			
			if(rs.next()) {
				int getch = rs.getInt(2);
				int gethp = rs.getInt(3);
				int getcode = rs.getInt(4);
				int getstress = rs.getInt(5);
				int getlot = rs.getInt(6);
				
				result.setCh(getch);
				result.setHp(gethp);
				result.setCode(getcode);
				result.setStree(getstress);
				result.setlot(getlot);
			}
			
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return result;
	}
//=================hpOut
public EndingDTO hpHos() {
	
	EndingDTO result = null;
	
	
	try {
		getConn();
		
		String sql = "select * from ending where end = 'hpHos'";
		
		psmt = conn.prepareStatement(sql);
		
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			int getch = rs.getInt(2);
			int gethp = rs.getInt(3);
			int getcode = rs.getInt(4);
			int getstress = rs.getInt(5);
			int getlot = rs.getInt(6);
			
			result.setCh(getch);
			result.setHp(gethp);
			result.setCode(getcode);
			result.setStree(getstress);
			result.setlot(getlot);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close();
	}
	return result;
}
//===============hphos==========
public EndingDTO hpFull() {
	
	EndingDTO result = null;
	
	
	try {
		getConn();
		
		String sql = "select * from ending where end = 'hpFull'";
		
		psmt = conn.prepareStatement(sql);
		
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			int getch = rs.getInt(2);
			int gethp = rs.getInt(3);
			int getcode = rs.getInt(4);
			int getstress = rs.getInt(5);
			int getlot = rs.getInt(6);
			
			result.setCh(getch);
			result.setHp(gethp);
			result.setCode(getcode);
			result.setStree(getstress);
			result.setlot(getlot);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close();
	}
	return result;
}
//===============hpFull=====
public EndingDTO stressHos() {
	
	EndingDTO result = null;
	
	
	try {
		getConn();
		
		String sql = "select * from ending where end = 'stressHos'";
		
		psmt = conn.prepareStatement(sql);
		
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			int getch = rs.getInt(2);
			int gethp = rs.getInt(3);
			int getcode = rs.getInt(4);
			int getstress = rs.getInt(5);
			int getlot = rs.getInt(6);
			
			result.setCh(getch);
			result.setHp(gethp);
			result.setCode(getcode);
			result.setStree(getstress);
			result.setlot(getlot);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close();
	}
	return result;
}
//=============stressHos
public EndingDTO big() {
	
	EndingDTO result = null;
	
	
	try {
		getConn();
		
		String sql = "select * from ending where end = 'big'";
		
		psmt = conn.prepareStatement(sql);
		
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			int getch = rs.getInt(2);
			int gethp = rs.getInt(3);
			int getcode = rs.getInt(4);
			int getstress = rs.getInt(5);
			int getlot = rs.getInt(6);
			
			result.setCh(getch);
			result.setHp(gethp);
			result.setCode(getcode);
			result.setStree(getstress);
			result.setlot(getlot);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close();
	}
	return result;
}
//===================big===
public EndingDTO small() {
	
	EndingDTO result = null;
	
	
	try {
		getConn();
		
		String sql = "select * from ending where end = 'small'";
		
		psmt = conn.prepareStatement(sql);
		
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			int getch = rs.getInt(2);
			int gethp = rs.getInt(3);
			int getcode = rs.getInt(4);
			int getstress = rs.getInt(5);
			int getlot = rs.getInt(6);
			
			result.setCh(getch);
			result.setHp(gethp);
			result.setCode(getcode);
			result.setStree(getstress);
			result.setlot(getlot);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close();
	}
	return result;
}
//===========small
public EndingDTO noJob() {
	
	EndingDTO result = null;
	
	
	try {
		getConn();
		
		String sql = "select * from ending where end = 'noJob'";
		
		psmt = conn.prepareStatement(sql);
		
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			int getch = rs.getInt(2);
			int gethp = rs.getInt(3);
			int getcode = rs.getInt(4);
			int getstress = rs.getInt(5);
			int getlot = rs.getInt(6);
			
			result.setCh(getch);
			result.setHp(gethp);
			result.setCode(getcode);
			result.setStree(getstress);
			result.setlot(getlot);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close();
	}
	return result;
}
//=============noJob
public EndingDTO winLotto() {
	
	EndingDTO result = null;
	
	
	try {
		getConn();
		
		String sql = "select * from ending where end = 'winLotto'";
		
		psmt = conn.prepareStatement(sql);
		
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			int getch = rs.getInt(2);
			int gethp = rs.getInt(3);
			int getcode = rs.getInt(4);
			int getstress = rs.getInt(5);
			int getlot = rs.getInt(6);
			
			result.setCh(getch);
			result.setHp(gethp);
			result.setCode(getcode);
			result.setStree(getstress);
			result.setlot(getlot);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close();
	}
	return result;
}
//========================winLotto===
}
