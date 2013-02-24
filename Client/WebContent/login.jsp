 <!-- header -->      
 <%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>
 
 
 <div class="center_content">
   	<div class="center_title_bar">Login</div>
     <%-- <% 
     if(request.getQueryString() !=null)
     {
     if(request.getParameter("flag").equals("1")){
	 %>
	 <center><div style="color:green;"><b>Registration Successful !</b></div></center>
	 <% 
 	} 
     } %> --%>
 
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 <form name="login" method="post" action="SignIn">
              	<div class="contact_form">
                           
                    <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input type="text" class="contact_input" name="email" />
                    </div>  

					<div class="form_row">
                    <label class="contact"><strong>Password:</strong></label>
                    <input type="password" class="contact_input" name="password" />
                    </div>  
                    
                    <div class="form_row" style="">
                    <input type="submit" name="signup" value="Cancel" class="contact" />
                    <input type="submit" name="signup" value="Login" class="contact" />
                    </div>  
                    
                </div> 
                </form>
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
       
    
   
   </div><!-- end of center content -->
   
 
 <!-- right content -->
    <%@ include file="right.jsp" %>
   
   <!-- footer content -->
    <%@ include file="footer.jsp" %>