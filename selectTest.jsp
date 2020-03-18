<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>레코드 표시</title>
<style>
    th{background-color:lightblue;}
    td{text-align:center;}
</style>
</head>
<body>
  <h2>member 테이블의 레코드 표시</h2>
  <table border="1">
    <tr>
      <th width="100">아이디</th>
      <th width="100">패스워드</th>
      <th width="100">이름</th>
      <th width="250">가입일자</th>
    </tr>
<% 
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String id = "";
String passwd = "";
String name = "";
Timestamp register;

try{
	String jdbcUrl = "jdbc:mysql://localhost:3306/basic";
	String dbid = "findid";
	String dbpass = "findpw";
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(jdbcUrl,dbid,dbpass);
	
	String sql = "select * from member";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();

	while(rs.next()){
		id = rs.getString("id");
		passwd = rs.getString("passwd");
		name = rs.getString("name");
		register = rs.getTimestamp("reg_date");
%>
	<tr>
		<td width="100"><a href="http://localhost:8080/ssk01_web/updateTest.jsp?id=<%=id%>"><%=id%></a></td>
		<td width="100"><%=passwd %></td>
		<td width="100"><%=name %></td>
		<td width="250"><%=register.toString() %></td>
	</tr>
		
<%
	
	}
	
	
	
}catch(Exception e){
	e.printStackTrace();
}finally{
	if(rs != null){
		try{rs.close();}catch(SQLException sqle){}
	}
	if(pstmt != null){
		try{pstmt.close();}catch(SQLException sqle){}
	}
	if(conn != null){
		try{conn.close();}catch(SQLException sqle){}
	}
}
%>    
  </table>
  <a href="http://localhost:8080/ssk01_web/insertTestForm.jsp"><input type="button" value="회원등록"></a>
</body>
</html>