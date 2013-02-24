 <!-- header -->      
 <%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>
 
 
 <div class="center_content">
   	<div class="center_title_bar">Shopping Cart</div>
   	 	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">   
            
            <!-- main content -->
            
            <table width="98%" cellspacing="1" cellpadding="2" border="0" align="left" style="border-collapse: separate;	">
          <tbody><tr>
            <td width="100%" style="padding:0px;"><table width="100%" cellspacing="0" cellpadding="5" border="0">
                <tbody><tr>
                  <th width="75" style=" BORDER-RIGHT: #cfe8ec 1px solid; BORDER-LEFT: #cfe8ec 1px solid; BORDER-TOP: #cfe8ec 1px solid;" class="cartheader"><nobr></nobr></th>
                  <th width="138" align="left" style=" BORDER-RIGHT: #cfe8ec 1px solid; BORDER-TOP: #cfe8ec 1px solid" class="cartheader"><nobr>Name</nobr></th>
                  <th width="62" align="center" style="BORDER-RIGHT: #cfe8ec 1px solid; BORDER-TOP: #cfe8ec 1px solid" class="cartheader"><nobr>Rent</nobr></th>
                  <th width="65" style="BORDER-RIGHT: #cfe8ec 1px solid; BORDER-TOP: #cfe8ec 1px solid" class="cartheader"><nobr>Qty</nobr></th>
                  <th width="67" align="right" style="BORDER-RIGHT: #cfe8ec 1px solid; BORDER-TOP: #cfe8ec 1px solid" class="cartheader"><nobr>Sub Total</nobr></th>
                  <th style=" BORDER-TOP: #cfe8ec 1px solid; BORDER-RIGHT: #cfe8ec 1px solid" class="cartheader">Action</th>
                </tr>
		<!-- cart details -->
		<%
		int totalAmt = 0;
		int count = 0;
		ArrayList<Movie> cartDetails = ((ArrayList<Movie>)(session.getAttribute("cartDetails")));
		for(Movie movie: cartDetails)
		{
		%>
		
                                <tr bgcolor="#ffffff" class="thumb">
                  <td valign="middle" align="center" style="border-left: 1px solid rgb(207, 232, 236); border-top: 1px solid rgb(207, 232, 236); border-right: 1px solid rgb(207, 232, 236); z-index: 0;" class="zoom"><img width="70" height="70" align="absmiddle" src="images/movie_img/<%=movie.getMovieId() %>.gif" class="imginside" style="overflow: hidden; margin-top: 0px; margin-left: 0px; top: 0px; left: 0px; width: 70px; display: block; height: 70px; padding: 9px;">                  </td>
		        <td align="left" style="BORDER-TOP: #cfe8ec 1px solid; BORDER-RIGHT: #cfe8ec 1px solid;">
                 <%=movie.getMovieName() %>
                                      </td>
		  
                  <td align="center" style="BORDER-TOP: #cfe8ec 1px solid; BORDER-RIGHT: #cfe8ec 1px solid;"><%=movie.getMovieRent() %></td>
                  <td align="center" style="BORDER-TOP: #cfe8ec 1px solid; BORDER-RIGHT: #cfe8ec 1px solid;">1</td>
                  <td valign="middle" align="right" style="BORDER-TOP: #cfe8ec 1px solid; BORDER-RIGHT: #cfe8ec 1px solid;"><%=movie.getMovieRent() %></td>
<td width="71" align="center" style="BORDER-TOP: #cfe8ec 1px solid; BORDER-RIGHT: #cfe8ec 1px solid"> <a href="Remove?movieId=<%=movie.getMovieId() %>">Remove</a> </td>
                </tr>
                
             <% 
             count ++;
        totalAmt+= movie.getMovieRent();     
		} 
		session.setAttribute("cartTotal", totalAmt);
		session.setAttribute("cartTotalItems", count);
		%>   
                
        <!-- cart details -->        
                  <tr>
                  <td valign="middle" align="right" style="text-align:right;">&nbsp;</td>
                  <td valign="middle" align="right" style="BORDER-RIGHT: #cfe8ec 1px solid; text-align:right;">&nbsp;</td>
                  <td valign="middle" height="30" align="right" style="BORDER-TOP: #cfe8ec 1px solid; BORDER-RIGHT: #cfe8ec 1px solid; BORDER-BOTTOM: #cfe8ec 1px solid; text-align:right;" class="classicbold" colspan="2"><nobr>Total ($)</nobr></td>
                  <td valign="middle" height="30" align="right" style="BORDER-TOP: #cfe8ec 1px solid;  BORDER-BOTTOM: #cfe8ec 1px solid;BORDER-RIGHT: #cfe8ec 1px solid; text-align:right;" class="classicbold"><nobr><%=totalAmt %></nobr></td>
                  <td height="30">&nbsp;</td>
                </tr>
              </tbody></table></td>
          </tr>
                     <tr>
             <td height="20" align="left" class="orangeBoldText">* <strong>Movie Copies will be shipped in 2 to 4 days.</strong></td>
           </tr> 
                   <tr>
            <td height="40">&nbsp;</td>
          </tr>
          <tr>
            <td height="40px;" colspan="6"><table width="100%" cellspacing="0" cellpadding="0" border="0" style="border-top-width:0px;">
                <tbody><tr>
                  <td align="right"><a href="indexRequest.jsp"><img border="0" alt="Continue Shopping" src="images/continue-shopping.gif"></a> </td>
                  <td width="10"></td>
                  <td width="161" align="left"><a href="checkout.jsp"> <img border="0" alt="Continue Checkout" src="images/continue-checkout.gif"></a> </td>
                </tr>
              </tbody></table></td>
          </tr>
        </tbody></table>
            
            <!-- main content -->
             </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
   </div><!-- end of center content -->
   
 
 <!-- right content -->
    <%@ include file="right.jsp" %>
   
   <!-- footer content -->
    <%@ include file="footer.jsp" %>