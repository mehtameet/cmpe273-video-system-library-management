 <!-- header -->      
 <%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>
 
 
 <div class="center_content">
   	<div class="center_title_bar"><%=((Movie[])request.getAttribute("movieCatDetails"))[0].getMovieCategoryName() %></div>
   	
   	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">  
            
            <!--  main content -->
            <% 
 int count = ((Movie[])request.getAttribute("movieCatDetails")).length;
 
 %>   
  <% for(int i=0;i<count;i++)
  {
  %>  
    	<div class="prod_box" style="width: 150px;">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html"><%=((Movie[])request.getAttribute("movieCatDetails"))[i].getMovieName() %></a></div>
                 <div class="product_img"><a href="details.html"><img src="images/img2.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="price"><%=((Movie[])request.getAttribute("movieCatDetails"))[i].getMovieRent() %></span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="addtocart.jsp?id=<%=((Movie[])request.getAttribute("movieCatDetails"))[i].getMovieId() %>" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="details.jsp?id=<%=((Movie[])request.getAttribute("movieCatDetails"))[i].getMovieId() %>" class="prod_details">details</a>            
            </div>                     
        </div>
    <% } %>
            <!--  main content -->
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
   	
   	
   	</div>
   	
   	<!-- right content -->
    <%@ include file="right.jsp" %>
   
   <!-- footer content -->
    <%@ include file="footer.jsp" %>