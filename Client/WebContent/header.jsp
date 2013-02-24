<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="entity.Movie"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META HTTP-EQUIV="refresh" content="100; URL=loginRequest.jsp">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="css/iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>

<div id="main_container">
	<div class="top_bar">
	<form name="search" action="Search" method="post">
    	<div class="top_search">        	
            <input type="text" style="margin-left:10px" class="search_input" name="searchValue" />
            <select name="searchType" style="margin:6px 0px 0px 20px">
            <option value="0">All</option>
            <option value="1">Name</option>
            <option value="2">Category</option>
            <option value="3">Banner</option>
            </select>
            <a href="#" onclick="javascript:document.search.submit();"> <img src="images/search.gif" class="search_bt"/></a>
        </div>
        </form>
        
    
    </div>
	<div id="header">
        
        <div id="logo">
            <a href="index.html"><img src="images/logo.png" alt="" title="" border="0" width="237" height="140" /></a>
	    </div>
        
        <div class="oferte_content">
        	<div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	<div class="oferta">
            
           		<div class="oferta_content">
                	<img src="images/movie_img/<%=((Movie[])request.getAttribute("movieHeader"))[0].getMovieId() %>.gif" width="94" height="92" border="0" class="oferta_img" />
                	
                    <div class="oferta_details">
                            <div class="oferta_title"><%=((Movie[])request.getAttribute("movieHeader"))[0].getMovieName() %></div>
                            <div class="oferta_text">
                            <%=((Movie[])request.getAttribute("movieHeader"))[0].getMovieDescription() %>
                            </div>
                            <a href="details.jsp?id=<%=((Movie[])request.getAttribute("movieHeader"))[0].getMovieId() %>" class="details">details</a>
                    </div>
                </div>
                <div class="oferta_pagination">
                
                     <span class="current">1</span>
                     <a href="#?page=2">2</a>
                     <a href="#?page=3">3</a>
                     <a href="#?page=3">4</a>
                     <a href="#?page=3">5</a>  
                             
                </div>        

            </div>
            <div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	
        </div> <!-- end of oferte_content-->
        

    </div>
    
   <div id="main_content"> 
   
            <div id="menu_tab">
            <div class="left_menu_corner"></div>
                    <ul class="menu">
                         <li><a href="indexRequest.jsp" class="nav1">  Home </a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav2">Movies</a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav3">Specials</a></li>
                         <li class="divider"></li>
                         <li><a href="myAccount.jsp" class="nav4">My account</a></li>
                         <li class="divider"></li>
                         <li><a href="signup.jsp" class="nav4">Sign Up</a></li>
                         <li class="divider"></li>                         
                         <li><a href="LogOut" class="nav5">LogOut </a></li>
                         <li class="divider"></li>
                         <li><a href="contact.html" class="nav6">Contact Us</a></li>
                         <li class="divider"></li>
                         <li><a href="loginRequest.jsp" class="nav6">Login</a></li>
                         <li class="divider"></li>
                         <li>
                         <iframe src="//www.facebook.com/plugins/like.php?href=http%3A%2F%2Flocalhost%3A8080%2FClient%2FindexRequest.jsp&amp;send=false&amp;layout=button_count&amp;width=450&amp;show_faces=true&amp;action=like&amp;colorscheme=light&amp;font=arial&amp;height=21" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:65px; height:21px;padding-top:17px;padding-left:20px" allowTransparency="true"></iframe>
                         </li>
                    </ul>

             <div class="right_menu_corner"></div>
            </div><!-- end of menu tab -->
            
    <div class="crumb_navigation">
    Navigation: <span class="current">Home</span>
    
    </div>  