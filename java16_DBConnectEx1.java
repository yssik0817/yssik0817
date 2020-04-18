package javaEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectEx1 {

	public static void main(String[] args) {
		/*Connection 객체를 받아야함 
		 * JDBC 드라이버 필요
		 * JDBC 드라이버 로딩
		 * DriverManager을 통해서 데이터베이스 접속
		 * 데이터베이스를 접속한 후 종료시 반드시 연결을 닫아야된다.
		 * 예외사항 처리 등이 나옴, 현재는 무시하고 따라할거임
		 * */
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "System";
		String pass="oraclesoldesk";
		Connection conn = null;//Connection경고뜨면 우클릭 맨위누르기
		try {
		Class.forName(driver);
		System.out.println("드라이버 로딩성공");
		conn = DriverManager.getConnection(url,user,pass);
		System.out.println("오라클 연결 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("jdbc driver 없음");
		}catch(SQLException e) {
			System.out.println("oracle연결 실패");
			
		}finally {
			if(conn!=null);
		}try {
			conn.close();
		}catch(SQLException e) {
				e.printStackTrace();}
	
		
	}

}
