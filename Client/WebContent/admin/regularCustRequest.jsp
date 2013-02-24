<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import ="entity.Customer"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="../css/iecss.css" />
<![endif]-->
<script type="text/javascript" src="../js/boxOver.js"></script>
</head>
<body>
<center>
<div class="top_bar">
<form name="search" action="AdminSearchUser?user=S" method="post">
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
                         <li><a href="movieList.jsp" class="nav2">Movies List</a></li>
                         <li class="divider" style="margin-left: 95px;"></li>
                         <li><a href="#" class="nav3">Regular Customers List</a></li>
                         <li class="divider" style="margin-left: 95px;"></li>
                         <li><a href="premiumCust.jsp" class="nav4">Premium Customers List</a></li>
                    </ul>

             <div class="right_menu_corner"></div>
            </div><!-- end of menu tab -->
            </div>
            <br><br><br>
            <table width="50%" cellspacing="1" cellpadding="5" style="border:1px solid #c0c0c0">
            <tr>
            <td bgcolor="#BAA7A7"><b>Sr.</b></td>
            <td bgcolor="#BAA7A7"><b>Name</b></td>
            <td bgcolor="#BAA7A7"><b>Email</b></td>
            <td bgcolor="#BAA7A7"><b>Delete</b></td>
            </tr>
            <%           
 int counter = ((Customer[])request.getAttribute("CustList")).length;
 %>   
  <% for(int i=0;i<counter;i++)
  { 
  if(i%2 == 0)
  {
  %>
  <tr>
  <td bgcolor="#F5F3F3"><%=i+1 %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("CustList"))[i].getFirstName() %> <%=((Customer[])request.getAttribute("CustList"))[i].getLastName() %></td>
  <td bgcolor="#F5F3F3"><%=((Customer[])request.getAttribute("CustList"))[i].getEmailId() %></td>
  <td bgcolor="#F5F3F3">Delete</td>
  </tr>
  <% } else {%>
	  <tr>
  <td bgcolor="#D9D9D9"><%=i+1 %></td>
  <td bgcolor="#D9D9D9"><%=((Customer[])request.getAttribute("CustList"))[i].getFirstName() %> <%=((Customer[])request.getAttribute("CustList"))[i].getLastName() %></td>
  <td bgcolor="#D9D9D9"><%=((Customer[])request.getAttribute("CustList"))[i].getEmailId() %></td>
  <td bgcolor="#D9D9D9">Delete</td>
  </tr>
 <% } } %>
            </table>
            </center>
</body>
</html>