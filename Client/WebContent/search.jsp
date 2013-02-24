<!-- header -->      
 <%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>

<div class="center_content">
   	<div class="center_title_bar">Search</div>
     
    	<div class="center_content">
   	<div class="center_title_bar">Search Results</div>
    <% 
    int count = 0;
    if((Movie[])request.getAttribute("searchResult") !=null){
	  count = ((Movie[])request.getAttribute("searchResult")).length;
    }
    for(int i=0;i<count;i++)
  {
  %>  
    	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html"><%=((Movie[])request.getAttribute("searchResult"))[i].getMovieName() %></a></div>
                 <div class="product_img"><a href="details.html"><img src="images/movie_img/<%=((Movie[])request.getAttribute("searchResult"))[i].getMovieId() %>.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="price">$ <%=((Movie[])request.getAttribute("searchResult"))[i].getMovieRent() %></span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="addtocart.jsp?id=<%=((Movie[])request.getAttribute("searchResult"))[i].getMovieId() %>" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="details.jsp?id=<%=((Movie[])request.getAttribute("searchResult"))[i].getMovieId() %>" class="prod_details">details</a>            
            </div>                     
        </div>
    <% } %>
       
   </div> 
    <div class="oferta_pagination" style="margin-left:200px">
                <%
                int previous = 1;
                int next = 6;
                if(request.getParameter("page") == null){
                	previous = 1;
                	next =6;
                } else {
                	previous = (Integer.valueOf(request.getParameter("page"))-1);
                	next =(Integer.valueOf(request.getParameter("page"))+1);
                }
                	%>
                	<a href="Search?page=<%=previous %>">Prev</a>
                      <a href="Search?page=1">1</a>
                     <a href="Search?page=2">2</a>
                     <a href="Search?page=3">3</a>
                     <a href="Search?page=4">4</a>
                     <a href="Search?page=5">5</a>
                     <a href="Search?page=<%=next %>">Next</a>  
                             
                </div>   
   </div><!-- end of center content -->
   
   <!-- right content -->
    <%@ include file="right.jsp" %>
   
   <!-- footer content -->
    <%@ include file="footer.jsp" %>

            