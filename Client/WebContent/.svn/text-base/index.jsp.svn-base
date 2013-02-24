 <%@page import ="entity.Movie"  %>
<!-- header -->      
 <%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>
   
   <div class="center_content">
   	<div class="center_title_bar">Latest Products</div>
    <% 
	 int count = ((Movie[])request.getAttribute("movieLatest")).length;
 
 %>   
  <% for(int i=0;i<count;i++)
  {
  %>  
    	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html"><%=((Movie[])request.getAttribute("movieLatest"))[i].getMovieName() %></a></div>
                 <div class="product_img"><a href="details.html"><img src="images/movie_img/<%=((Movie[])request.getAttribute("movieLatest"))[i].getMovieId() %>.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="price">$ <%=((Movie[])request.getAttribute("movieLatest"))[i].getMovieRent() %></span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="addtocart.jsp?id=<%=((Movie[])request.getAttribute("movieLatest"))[i].getMovieId() %>" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="details.jsp?id=<%=((Movie[])request.getAttribute("movieLatest"))[i].getMovieId() %>" class="prod_details">details</a>            
            </div>                     
        </div>
    <% } %>
    
 
     	
 <div class="center_title_bar">Recommended Products</div>
<%  
count = ((Movie[])request.getAttribute("movieRecommended")).length;
 
 for(int i=0;i<count;i++)
  {
  %>  
      	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html"><%=((Movie[])request.getAttribute("movieRecommended"))[i].getMovieName() %></a></div>
                 <div class="product_img"><a href="details.html"><img src="images/movie_img/<%=((Movie[])request.getAttribute("movieRecommended"))[i].getMovieId() %>.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="price">$ <%=((Movie[])request.getAttribute("movieRecommended"))[i].getMovieRent() %></span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="addtocart.jsp?id=<%=((Movie[])request.getAttribute("movieRecommended"))[i].getMovieId() %>" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="details.jsp?id=<%=((Movie[])request.getAttribute("movieRecommended"))[i].getMovieId() %>"  class="prod_details">details</a>            
            </div>                     
        </div>
 <% } %>   
    
 
     	
 
 
 
    
    
   
   </div><!-- end of center content -->
   
   <!-- right content -->
    <%@ include file="right.jsp" %>
   
   <!-- footer content -->
    <%@ include file="footer.jsp" %>
   