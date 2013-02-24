
<%@page import="entity.Customer"
		import ="entity.Movie"
		import = "entity.Transactions"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>


<body>
<center>
<div class="top_bar">
<form name="search" action="AdminSearchUser" method="post">
  	<div class="top_search">        	
            <input type="text" style="margin-left:10px" class="search_input" name="searchValue" />
            <select name="searchType" style="margin:6px 0px 0px 20px">
            <option value="0">All</option>
            <option value="1">Issue Date</option>
            <option value="2">Due Date</option>
            <option value="3">Fine Amount</option>
            </select>
            <a href="#" onclick="javascript:document.search.submit();"> <img src="../images/search.gif" class="search_bt"/></a>
        </div>
        </form>
        </div>
 <div id="main_content">
<div id="menu_tab">
            <div class="left_menu_corner"></div>
                    <ul class="menu">
                         <li><a href="index.jsp" class="nav1">  Home </a></li>
                         <li class="divider" style="margin-left: 95px;"></li>
                         <li><a href="#" class="nav2">Movies List</a></li>
                         <li class="divider" style="margin-left: 95px;"></li>
                         <li><a href="#" class="nav3">Regular Customers List</a></li>
                         <li class="divider" style="margin-left: 95px;"></li>
                         <li><a href="#" class="nav4">Primium Customers List</a></li>
                    </ul>

             <div class="right_menu_corner"></div>
            </div><!-- end of menu tab -->
            	
            </div>
          <br><br><br>
            <table width="50%" cellspacing="1" cellpadding="5" style="border:1px solid #c0c0c0">
            <tr>
            <td bgcolor="#BAA7A7"><b>Sr No.</b></td>
            <td bgcolor="#BAA7A7"><b>Membership Id</b></td>
            <td bgcolor="#BAA7A7"><b>First Name</b></td>
            <td bgcolor="#BAA7A7"><b>Last Name</b></td>
            <td bgcolor="#BAA7A7"><b>Email Id</b></td>
            <td bgcolor="#BAA7A7"><b>Movie Name</b></td>
            <td bgcolor="#BAA7A7"><b>Issue Date</b></td>
            <td bgcolor="#BAA7A7"><b>Due Date</b></td>
            <td bgcolor="#BAA7A7"><b>Fine Amount</b></td>
            <td bgcolor="#BAA7A7"><b>Action</b></td>
            </tr> 
    <%int count = 0;
    if((Customer[])request.getAttribute("searchUsers") !=null){
	  count = ((Customer[])request.getAttribute("searchUsers")).length;	 
    }
    for(int i=0;i<count;i++)
  { %>
  		<%
  if(i%2 == 0)
  {
  %>
  <tr>
  <td bgcolor="#F5F3F3"><%=i+1 %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getMembershipId() %> </td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getFirstName() %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getLastName() %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getEmailId() %></td>
  <%Movie[] movie = new Movie[1];
  	movie = (Movie[]) ((Customer[])request.getAttribute("searchUsers"))[i].getObjMovieDtls();
  	//Movie mv = new Movie();
  	String movieName = movie[0].getMovieName();	  
  	%>
  <td bgcolor="#F5F3F3"><%= movieName%></td>
  <%Transactions[] trans = new Transactions[1];
  	trans = (Transactions[]) ((Customer[])request.getAttribute("searchUsers"))[i].getObjTrans();
  
  	String issueDate = trans[0].getIssueDate();
  	String dueDate = trans[0].getDueDate();
  	String fineAmount = trans[0].getFineamount();%>
  <td bgcolor="#F5F3F3"><%=issueDate%></td>
  <td bgcolor="#F5F3F3"><%=dueDate%></td>
  <td bgcolor="#F5F3F3"><%=fineAmount%></td>
  <td bgcolor="#F5F3F3"><a href="DeleteUser?UserID="<%=((Customer[])request.getAttribute("searchUsers"))[i].getMembershipId() %>>Delete</a></td>
  </tr>
  <% } else {%>
     <tr>
  <td bgcolor="#F5F3F3"><%=i+1 %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getMembershipId() %> </td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getFirstName() %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getLastName() %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("searchUsers"))[i].getEmailId() %></td>
  <%Movie[] movie = new Movie[1];
  	movie = (Movie[]) ((Customer[])request.getAttribute("searchUsers"))[i].getObjMovieDtls();
  	
  	String movieName = movie[0].getMovieName();%>
  <td bgcolor="#F5F3F3"><%= movieName%></td>
  <%Transactions[] trans =  new Transactions[1];
  	trans = (Transactions[]) ((Customer[])request.getAttribute("searchUsers"))[i].getObjTrans();
  	
  	String issueDate = trans[0].getIssueDate();
  	String dueDate = trans[0].getDueDate();
  	String fineAmount = trans[0].getFineamount(); %>
  <td bgcolor="#F5F3F3"><%=issueDate%></td>
  <td bgcolor="#F5F3F3"><%=dueDate%></td>
  <td bgcolor="#F5F3F3"><%=fineAmount%></td>
  <td bgcolor="#F5F3F3"><a href="/admin/DeleteUser?UserID="<%=((Customer[])request.getAttribute("searchUsers"))[i].getMembershipId() %>>Delete</a></td>  </tr>
     <% }} %>
   </table>
            </center>
</body>
</html>