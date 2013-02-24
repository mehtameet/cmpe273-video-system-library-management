<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import ="entity.MovieCategory"  %>
<%@page import ="entity.Movie"  %>
 <div class="left_content">
    <div class="title_box">Categories</div>
   
 <% 
 MovieCategory[] movieCat = (MovieCategory[])request.getAttribute("category");
 int counter = ((MovieCategory[])request.getAttribute("category")).length;
 System.out.println(counter);
 
 %>   
  <ul class="left_menu">
  <% for(int i=0;i<counter;i++)
  {
  %>  
         <% if(i%2 == 0) { %>
        <li class="odd"><a href="movieCat.jsp?catId=<%=((MovieCategory[])request.getAttribute("category"))[i].getMovieCategoryId() %>"><%=((MovieCategory[])request.getAttribute("category"))[i].getMovieCategoryName() %></a></li>
        <% } else { %>
        <li class="even"><a href="movieCat.jsp?catId=<%=((MovieCategory[])request.getAttribute("category"))[i].getMovieCategoryId() %>"><%=((MovieCategory[])request.getAttribute("category"))[i].getMovieCategoryName() %></a></li>
       <% } %>
        
     <% } %>
      </ul>     
     <div class="title_box">Special Products</div>  
     <div class="border_box">
         <div class="product_title"><a href="details.html"><%=((Movie[])request.getAttribute("movieSpecial"))[0].getMovieName() %></a></div>
         <div class="product_img"><a href="details.html"><img src="images/movie_img/<%=((Movie[])request.getAttribute("movieSpecial"))[0].getMovieId() %>.gif" alt="" title="" border="0" /></a></div>
         <div class="prod_price"><span class="price">$ <%=((Movie[])request.getAttribute("movieSpecial"))[0].getMovieRent() %></span></div>
     </div>  
     
     
     <div class="title_box">Newsletter</div>  
     <div class="border_box">
		<input type="text" name="newsletter" class="newsletter_input" value="your email"/>
        <a href="#" class="join">join</a>
     </div>  
       
   </div><!-- end of left content -->