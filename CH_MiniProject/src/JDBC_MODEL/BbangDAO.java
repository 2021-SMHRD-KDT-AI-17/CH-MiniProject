package JDBC_MODEL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BbangDAO {

	// 캐릭터 정보 DAO

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
	
	//========================================= DB 연결

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
	
	//=================================================DB 연결 종료
	
	public BbangDTO checkdto(String nick) {
		
		BbangDTO result = null;
		
		try {
			getConn();
			String sql = "select * from char_Bbang where nick =?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nick);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				result = new BbangDTO();
				
				String getnick = rs.getString(1);
				int getch = rs.getInt(2);
				int gethp = rs.getInt(3);
				int getcode = rs.getInt(4);
				int getstress = rs.getInt(5);
				int getsave = rs.getInt(6);
				int getage = rs.getInt(7);
				int getlot = rs.getInt(8);
				String getend = rs.getString(9);
				String getcom = rs.getString(10);
				String getid = rs.getString(11);
				
				result.setNick(getnick);
				result.setCh(getch);
				result.setHp(gethp);
				result.setCode(getcode);
				result.setStress(getstress);
				result.setSave(getsave);
				result.setAge(getage);
				result.setLot(getlot);
				result.setEnd(getend);
				result.setCom(getcom);
				result.setId(getid);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close();
		}
		return result;
	}
	
	//============================================== 값 받아오기
	public int updateday(BbangDTO bdto) {
		int cnt = 0;
		try {
			getConn();
			String sql = "update char_bbang set  ch =?, hp =?, code = ?, stress = ? ,save  = ? where nick = ?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bdto.getCh());
			psmt.setInt(2, bdto.getHp());
			psmt.setInt(3, bdto.getCode());
			psmt.setInt(4, bdto.getStress());
			psmt.setInt(5, bdto.getSave());
			psmt.setString(6, bdto.getNick());
			
			cnt = psmt.executeUpdate();
			rs = psmt.executeQuery();	
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	

		return cnt;
	}
	//========================update date


	public ArrayList<BbangDTO> idlist(String id) {
		ArrayList<BbangDTO> list = new ArrayList<>();
		try {
			getConn();
			
			String sql = "select nick, save, com from char_bbang where id = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,id);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String nick = rs.getString(1);
				int save = rs.getInt(2);
				String com = rs.getString(3);
				
				BbangDTO bbangdto = new BbangDTO();
				bbangdto.setNick(nick);
				bbangdto.setSave(save);
				bbangdto.setCom(com);
				
				list.add(bbangdto);

			}

			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
	}
	
	public int makechar(BbangDTO bdto) {
		int cnt = 0;
		try {
			getConn();
			
			String sql = "insert into CHAR_BBANG values(?,50,50,50,50,0,?,0,'','',?)";
			psmt = conn.prepareStatement(sql);
			System.out.println(bdto.getNick());
			System.out.println(bdto.getAge());
			System.out.println(bdto.getId());
			
			psmt.setString(1, bdto.getNick());
			psmt.setInt(2, bdto.getAge());
			psmt.setString(3, bdto.getId());
			
			cnt = psmt.executeUpdate();
			
//			rs = psmt.executeQuery();
			
			if(cnt>0) {
				System.out.println("\t\t\t\t 캐릭터 생성 완료");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	
	
	public int delete(String nick) {
		int cnt = 0;
		try {
			getConn();
			
			String sql = "delete from CHAR_BBANG where nick = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, nick);
			
			cnt = psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return cnt;
	}	
	
	
	
	
	
	public ArrayList<BbangDTO> checkid() {
		ArrayList<BbangDTO> list = new ArrayList<>();
		
		try {
			getConn();
			String sql = "select nick,ch,hp,code,stress, lot from char_Bbang com ";
			
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				BbangDTO result = new BbangDTO();
				
				String getnick = rs.getString(1);
				int getch = rs.getInt(2);
				int gethp = rs.getInt(3);
				int getcode = rs.getInt(4);
				int getstress = rs.getInt(5);
				int getlot = rs.getInt(6);
				
				
				result.setNick(getnick);
				result.setCh(getch);
				result.setHp(gethp);
				result.setCode(getcode);
				result.setStress(getstress);
				result.setLot(getlot);
				
				list.add(result);

			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
