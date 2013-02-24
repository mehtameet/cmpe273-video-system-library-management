<!-- header -->      
 <%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>

<%
session.removeAttribute("cartDetails");
%>
<div class="center_content">
   	<div class="center_title_bar">Receipt</div>
     
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">         
            <div class="contact_form">
                           
                    <div class="form_row">
                   Your Order is Placed Successfully !
                    </div>  
                    </div>
            
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
       
    
   
   </div><!-- end of center content -->
   
   <!-- right content -->
    <%@ include file="right.jsp" %>
   
   <!-- footer content -->
    <%@ include file="footer.jsp" %>

            