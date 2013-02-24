 <!-- header -->      
 <%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>
 
 
 <div class="center_content">
   	<div class="center_title_bar"><%=((Movie)request.getAttribute("movieDetail")).getMovieName() %></div>
   	
   	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">  
            
            <!-- temp code -->
            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                <tr>
				 <td width="170" valign="top" align="left"><table><tbody><tr><td class="imginside"><a href="https://www.chandamamashop.com/index.php?action=productDetails&amp;productId=214"><img width="165" height="165" align="absmiddle" src="images/movie_img/<%=((Movie)request.getAttribute("movieDetail")).getMovieId() %>.gif" class="img2"></a></td></tr></tbody></table>
                 <table cellspacing="0" cellpadding="0" border="0">
				     <tbody><tr>
				       <td class="orangeBoldText">&nbsp;</td>
			         </tr>
				      
		          </table>
                 </td>				  
                 <td width="10">&nbsp;</td>
				  <td valign="top" align="left">
                    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="left">
                      <tr align="left">
                        <td valign="top" align="left" class="title" colspan="2">
						<p><span style="FONT-FAMILY: 'Times New Roman'; COLOR: windowtext; FONT-SIZE: 12pt; mso-bidi-font-family: 'Times New Roman'"><font size="2" face="Arial"><%=((Movie)request.getAttribute("movieDetail")).getMovieDescription() %></font></p>	
						</td>
                      </tr>
                      <tr>
                        <td width="42%" valign="middle" height="20" align="right">&nbsp;</td>
                        <td width="58%" align="left">&nbsp;</td>
                      </tr>
                      <tr>
                        <td valign="middle" height="1" align="right"></td>
                        <td align="left"></td>
                      </tr>
			  
                      <tr>
                        <td valign="middle" nowrap="" height="28" align="left"><strong>Category : </strong></td>
                        <td valign="middle" height="28" align="left"><strong>
                        <%=((Movie)request.getAttribute("movieDetail")).getMovieCategoryName() %></strong></td>
                      </tr>
      <tr>
        <td height="1px" align="left" class="tddotted" colspan="2"></td>
      </tr>
					 			  
								  
                      <tr>
                        <td valign="middle" nowrap="" height="28" align="left" class="price"><strong>Rent : </strong></td>
                        <td valign="middle" nowrap="" height="28" align="left" class="price"><strong>
						$ <%=((Movie)request.getAttribute("movieDetail")).getMovieRent() %></strong></td>
                      </tr>
					        <tr>
        <td height="1px" align="left" class="tddotted" colspan="2"></td>
      </tr>
	  	  <tr>
		<td valign="middle" nowrap="" height="28" align="left"><strong>Available Copies : </strong></td>
		<td valign="middle" height="28" align="left"><strong>
		<%=((Movie)request.getAttribute("movieDetail")).getAvailableCopies() %></strong></td>
	  </tr>
	  <tr>
        <td height="1px" align="left" class="tddotted" colspan="2"></td>
      </tr>
	  			  					  
			  
                      <tr>
                        <td valign="middle" nowrap="" height="28" align="left"><strong>Banner : </strong></td>
                        <td valign="middle" height="28" align="left"><strong>
                        <%=((Movie)request.getAttribute("movieDetail")).getMovieBanner() %></strong></td>
                      </tr>
					        <tr>
        <td height="1px" align="left" class="tddotted" colspan="2"></td>
      </tr>	  
                      <tr valign="middle" align="left">
                        <td height="7" align="center"></td>
                        <td height="7" align="center"></td>
                      </tr>
                      <tr valign="middle" align="center">
                      
                      <td>Add to Cart</td>
                        <td align="left" colspan="1">
							 <a href="addtocart.jsp?id=<%=((Movie)request.getAttribute("movieDetail")).getMovieId() %>" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
                        </td>
                      </tr>
                    </table>
                  </td>
                </tr>
              </table>
            
            <!-- temp code -->
             </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
   	
   	
   	</div>
   	
   	<!-- right content -->
    <%@ include file="right.jsp" %>
   
   <!-- footer content -->
    <%@ include file="footer.jsp" %>