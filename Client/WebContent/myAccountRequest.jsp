<!-- header -->      
 <%@page import="java.util.Date"%>
<%@page import="entity.MovieAccountDetail"%>
<%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>
 <%@page import ="entity.AccountDetails"  %>
<div class="center_content">
   	<div class="center_title_bar">My Account</div>
     
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">         
            <div class="contact_form">
                           
                    <div class="form_row">
                    <h3>Personal Detail</h3>
		<table>
		<tr><td>Account Holder's Name :</td><td><%=((Customer)session.getAttribute("userSession")).getFirstName() %> <%=((Customer)session.getAttribute("userSession")).getLastName()  %></td></tr>
		<tr><td align="left">Membership No. :</td><td><%=((Customer)session.getAttribute("userSession")).getMembershipId() %></td></tr>
		<tr><td align="left">Subscription Plan :</td><td><%=((AccountDetails)request.getAttribute("accountDetails")).getPlan() %></td></tr>
		<tr><td align="left">No. of movies Issued :</td><td><%=((AccountDetails)request.getAttribute("accountDetails")).getNoOfMovies() %></td></tr>
		</table>                 

                    </div>  
                    </div>
            
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
        
        <div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">         
            <div class="contact_form">
                           
                    <div class="form_row">
                    <h3>Movie Details</h3>
                    
                    <% 
                    if((AccountDetails)request.getAttribute("accountDetails")!=null){
                    MovieAccountDetail[] movieAccountDetail = ((AccountDetails)request.getAttribute("accountDetails")).getMovieAccountDetail();
                    for ( int i=0;i<movieAccountDetail.length;i++){ 
                    	/* int fine;
                    	Date currdate = new Date();
                    	Date dueDate = Date.parse(movieAccountDetail[i].getDueDate());
                    	if(dueDate.before(currdate))
                    	fine =  10;
                    	else */
                    		int fine = 0;
                    
                    %>
		<table width="100%">
		<tr><td align="left">Movie Name :</td><td align="left"><%=movieAccountDetail[i].getMovieName()%></td><td align="right"><a href="ReturnMovie?movieId=<%=movieAccountDetail[i].getMovieId() %>">Return</a></td></tr>
		<tr><td align="left">Issue Date :</td><td align="left"><%=movieAccountDetail[i].getIssueDate()%></td></tr>
		<tr><td align="left">Due Date :</td><td align="left"><%=movieAccountDetail[i].getDueDate()%></td></tr>
		<tr><td align="left">Fine Amount :</td><td align="left"><%=fine%></td></tr>
		<tr><td colspan="3" style="border-bottom:2px solid #888888"></td></tr>
		</table>                 
<% }}%>
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

            