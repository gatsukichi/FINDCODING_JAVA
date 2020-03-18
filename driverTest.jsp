<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <h2>JDBC 드라이버 테스트</h2>
<%
Connection conn = null;
try{
	String jdbcUrl = "jdbc:mysql://localhost:3306/basic";
	String dbid = "findid";
	String dbpass = "findpw";
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(jdbcUrl,dbid,dbpass);
	out.println("제대로 연결되었습니다.");
}catch(Exception e){
	e.printStackTrace();
}
%>
</body>
</html>