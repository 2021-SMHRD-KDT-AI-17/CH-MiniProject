package JDBC_MODEL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoDAO {

   // 회원정보 DAO

   Scanner sc = new Scanner(System.in);
   private Connection conn = null;
   private PreparedStatement psmt = null;
   private ResultSet rs = null;

   public void getConn() {
      try {

         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
         String user = "campus_23K_AI17_p1_6";
         String password = "smhrd6";

         conn = DriverManager.getConnection(url, user, password); //

//         if (conn != null) {
//            System.out.println("DB 연결성공!");
//         } else {
//            System.out.println("DB연결 실패..T^T");
//         }

      } catch (Exception e) {
         e.printStackTrace(); // 오류 출력 문구 코드는 꼭 넣어주자.
      }

   }

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
   // ================================================== getConn , Close

   public UserInfoDTO login(UserInfoDTO dto) {

      UserInfoDTO result = null;

      try {
         getConn();

         String sql = "SELECT * FROM USER_INFO WHERE ID=? AND PW=?";

         psmt = conn.prepareStatement(sql);

         psmt.setString(1, dto.getId());
         psmt.setString(2, dto.getPw());

         rs = psmt.executeQuery();

         if (rs.next()) {
            result = new UserInfoDTO();

            String getId = rs.getString("ID");
            String getPw = rs.getString("PW");

            result.setId(getId);
            result.setPw(getPw);

            System.out.println();
            System.out.println("\t\t\t\t ㅎ ㅔ헿 " + dto.getId() + "아 안녕");
            System.out.println();
         } else {
        	 System.out.println();
            System.out.println("\t\t\t\t 어라? 이거 없다는뒈...( •᷄⌓•᷅ ) ");
            System.out.println();
         }

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         close();
      }

      return result;
   }

   // =================================================== 로그인

   public int join(UserInfoDTO dto) {

      int cnt = 0;

      try {
         getConn();

         if (isIdDuplicated(dto.getId())) {
            System.out.println("\t\t\t\t아뉘 아이디가 중복된다잖아"); // 중복된 아이디이므로 메시지 출력
            return cnt; // 중복된 아이디이므로 회원가입 처리를 중단하고 0을 반환
         }

         String sql = "INSERT INTO USER_INFO VALUES(?,?)";

         psmt = conn.prepareStatement(sql);
         psmt.setString(1, dto.getId());
         psmt.setString(2, dto.getPw());

         cnt = psmt.executeUpdate();

         if (cnt > 0) {
            System.out.println("\t\t\t\t안녕" + dto.getId() +"아 ");
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }

      return cnt;
   }

   // ==================================================== 회원 가입

   public boolean isIdDuplicated(String id) {

      try {
         String checkSql = "SELECT COUNT(*) FROM USER_INFO WHERE ID=?";
         PreparedStatement checkPsmt = conn.prepareStatement(checkSql);
         checkPsmt.setString(1, id);
         ResultSet rs = checkPsmt.executeQuery();

         if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0; // 0보다 크면 중복된 아이디가 존재
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return false;

   }

   // ====================================================== 회원 가입 시 중복 Check

   public int delete(String deleteId) {
      int cnt = 0;

      try {
         getConn();

         String sql = "DELETE FROM USER_INFO WHERE ID=?";

         psmt = conn.prepareStatement(sql);
         psmt.setString(1, deleteId);

         cnt = psmt.executeUpdate();

         if (cnt > 0) {
            System.out.println("\t\t\t\t"+deleteId + "아 다신보지 말자,,(쭈글");
         } else {
        	 System.out.println("\t\t\t\t 일치하는 정보가 없어");
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }

      return cnt;
   }

   // ===================================================== 플레이어 탈퇴 기능

   public void Quit() {

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
      } finally {
         close();

      }
   }
   // ===================================================== 종료 기능

   public BbangDTO BbangInfo(BbangDTO dto) {

      BbangDTO result = null;

      try {
         getConn();

         String sql = "SELECT Nick , hp, code, ch, stress FROM CHAR_BBANG WHERE ID=?";

         psmt = conn.prepareStatement(sql);

         psmt.setString(1, dto.getId());
//         psmt.setString(2, dto.getPw());

         rs = psmt.executeQuery();

         if (rs.next()) {
            result = new BbangDTO();

            String getId = rs.getString("ID");
//            String getPw = rs.getString("PW");
//            String getNick = rs.getString("PW");
//            String getHp = rs.getString("PW");
//            String getCode = rs.getString("PW");
//            String getch = rs.getString("PW");
//            String getstress = rs.getString("PW");

            result.setId(getId);
//            result.setPw(getPw);

            System.out.println();
         }

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return result;
   }
   // ========================================================= 내 캐릭터 정보 보기

   public int BbangTable(String id) {

      try {
         getConn();

         String sql = "insert into stat values (?, 1,0,100,0,1)";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);

         int cnt = psmt.executeUpdate();
         return cnt;

      } catch (SQLException e) {
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return 0;

      // ======================================================== 닉네임 짓고 새로운 캐릭터 값 입력하는 건데.. 흠
      


   

      // ========================================================= 캐릭터 삭제 기능

   }
}