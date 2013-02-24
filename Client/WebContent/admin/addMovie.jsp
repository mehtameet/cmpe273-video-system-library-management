<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                         <li><a href="#" class="nav2">Movies List</a></li>
                         <li class="divider" style="margin-left: 95px;"></li>
                         <li><a href="#" class="nav3">Regular Customers List</a></li>
                         <li class="divider" style="margin-left: 95px;"></li>
                         <li><a href="#" class="nav4">Primium Customers List</a></li>
                    </ul>

             <div class="right_menu_corner"></div>
            </div><!-- end of menu tab -->
            </div>
            <br><br>
<div class="center_content" style="float:none">
   	<div class="center_title_bar">Add Movie</div>
     
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 <form name="addMovie" method="post" action="AddMovie">
              	<div class="contact_form">
                           
                    <div class="form_row">
                    <label class="contact"><strong>Movie Name:</strong></label>
                    <input type="text" class="contact_input" name="movieName" />
                    </div>  

					<div class="form_row">
                    <label class="contact"><strong>Movie Description:</strong></label>
                    <input type="text" class="contact_input" name="movieDesc" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Release Date:</strong></label>
                    <input type="text" class="contact_input" name="releaseDate" />
                    </div>

					<div class="form_row">
                    <label class="contact"><strong>Movie Category:</strong></label>
                    <select name="category">
                    <option value="">Select Category</option>
                    <option value="1">Action</option>
                    <option value="2">Animation</option>
                    <option value="3">Comedy</option>
                    <option value="4">Documentary</option>
                    <option value="5">Drama</option>
                    <option value="6">Family</option>
                    <option value="7">Horror</option>
                    <option value="8">Romance</option>
                    <option value="9">Sci-Fi</option>
                    <option value="10">Thriller</option>
                    </select>
					</div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Movie Banner:</strong></label>
                    <input type="text" class="contact_input" name="banner" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Available Copies:</strong></label>
                    <input type="text" class="contact_input" name="copies"/>
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Rent Amount:</strong></label>
                    <input type="text" class="contact_input" name="rent"/>
                    </div> 
                    
                    <div class="form_row">
                    <label class="contact"><strong>Active :</strong></label>
                    <input type="radio" name="active" value="Y" /> Active
					<input type="radio" name="active" value="N" /> Inactive
					</div>
					
					<div class="form_row" style="width:385px">
					<input type="submit" name="signup" value="Submit" class="contact" />
                    <input type="submit" name="signup" value="Reset" class="contact" />
                    <input type="submit" name="signup" value="Cancel" class="contact" />
                    </div>  
                    
                </div> 
                </form>
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
       
    
   
   </div><!-- end of center content -->

</center>
</body>
</html>