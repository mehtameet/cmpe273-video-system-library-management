<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import ="entity.Movie"  %>
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
                         <li><a href="#" class="nav4">Premium Customers List</a></li>
                    </ul>

             <div class="right_menu_corner"></div>
            </div><!-- end of menu tab -->
            </div>
            <a href="addMovie.jsp">ADD MOVIE</a>
            <br><br><br>
            <table width="50%" cellspacing="1" cellpadding="5" style="border:1px solid #c0c0c0">
            <tr>
            <td bgcolor="#BAA7A7"><b>Sr.</b></td>
            <td bgcolor="#BAA7A7"><b>Movie Name</b></td>
            <td bgcolor="#BAA7A7"><b>Available Copies</b></td>
            <td bgcolor="#BAA7A7"><b>Rent</b></td>
            <td bgcolor="#BAA7A7"><b>Edit</b></td>
            <td bgcolor="#BAA7A7"><b>Delete</b></td>
            </tr>
            <%           
 int counter = ((Movie[])request.getAttribute("searchResult")).length;
 %>   
  <% for(int i=0;i<counter;i++)
  { 
  if(i%2 == 0)
  {
  %>
  <tr>
  <td bgcolor="#F5F3F3"><%=i+1 %></td>
  <td bgcolor="#F5F3F3"><%=((Movie[])request.getAttribute("searchResult"))[i].getMovieName() %> </td>
  <td bgcolor="#F5F3F3"><%=((Movie[])request.getAttribute("searchResult"))[i].getAvailableCopies() %> </td>
  <td bgcolor="#F5F3F3"><%=((Movie[])request.getAttribute("searchResult"))[i].getMovieRent() %> </td>
  <td bgcolor="#F5F3F3"><a href='EditMovies?movieId=<%= ((Movie[])request.getAttribute("searchResult"))[i].getMovieId() %>' class="nav4">Edit</a></td>
  <td bgcolor="#F5F3F3"><a href='DeleteMovies?movieId=<%= ((Movie[])request.getAttribute("searchResult"))[i].getMovieId() %>' class="nav5">Delete</a></td>
  </tr>
  <% } else {%>
	  <tr>
  <td bgcolor="#D9D9D9"><%=i+1 %></td>
  <td bgcolor="#D9D9D9"><%=((Movie[])request.getAttribute("searchResult"))[i].getMovieName() %> </td>
  <td bgcolor="#D9D9D9"><%=((Movie[])request.getAttribute("searchResult"))[i].getAvailableCopies() %> </td>
  <td bgcolor="#D9D9D9"><%=((Movie[])request.getAttribute("searchResult"))[i].getMovieRent() %> </td>
  <td bgcolor="#D9D9D9"><a href='EditMovies?movieId=<%= ((Movie[])request.getAttribute("searchResult"))[i].getMovieId() %>' class="nav4">Edit</a></td>
  <td bgcolor="#D9D9D9"><a href='DeleteMovies?movieId=<%= ((Movie[])request.getAttribute("searchResult"))[i].getMovieId() %>' class="nav5">Delete</a></td>
  </tr>
 <% } } %>
            </table>
            </center>
</body>
</html>