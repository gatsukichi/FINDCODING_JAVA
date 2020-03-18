<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>    
<% request.setCharacterEncoding("utf-8"); %>
<%

String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
String name = request.getParameter("name");
Timestamp register = new Timestamp(System.currentTimeMillis());

Connection conn = null;
PreparedStatement pstmt = null;
String str="";
try{
	String jdbcUrl = "jdbc:mysql://localhost:3306/basic";
	String dbid = "findid";
	String dbpass = "findpw";
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(jdbcUrl,dbid,dbpass);
	
	//------------------------------
	String sql = "insert into member values(?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,id);
	pstmt.setString(2,passwd);
	pstmt.setString(3,name);
	pstmt.setTimestamp(4,register);
	pstmt.executeUpdate();
	
	
	//----------------------------------
	
	str="member테이블에 새로운 레코드를 추가했습니다.";
}catch(Exception e){
	e.printStackTrace();
	str="member테이블에  새로운 레코드 추가를 실패하였습니다.";
}finally{
	if(pstmt != null){
		try{pstmt.close();}catch(SQLException sqle){}
	}
	if(conn != null){
		try{conn.close();}catch(SQLException sqle){}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="2;url=http://localhost:8080/ssk01_web/selectTest.jsp"/>
<title>레코드 추가</title>
</head>
<body>
<%=str %>
</body>
</html>