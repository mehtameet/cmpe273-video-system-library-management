<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import ="entity.Customer"  %>
    
 

<div class="right_content">

	<div class="shopping_cart">
	<% 
if(session.getAttribute("userSession") != null)
{
String FirstName = ((Customer)session.getAttribute("userSession")).getFirstName(); 
String LastName =  ((Customer)session.getAttribute("userSession")).getLastName();
%>    
        	<div class="cart_title">Welcome <%=FirstName %> <%=LastName %> !</div> 
            
            <div class="cart_details">
            <span class="border_cart"></span>
            Last Logged in at <br />
            
            <span class="price">11:11:11</span> 
            </div>
            <% } else { %>
        <span style="margin-top:120px"><a href="loginRequest.jsp">Login</a></span>
        
        <% } %> 
        </div>
        
        <br>
   		<div class="shopping_cart">
        	<div class="cart_title">Shopping cart</div>
            
            <div class="cart_details">
            <% 
            if(session.getAttribute("cartTotalItems")== null && session.getAttribute("cartTotal") == null)
            { %>
            	<span class="price">Shopping Cart is Empty </span>
            <% }
            else {%>
            <%=session.getAttribute("cartTotalItems") %> Movies <br />
            
            <span class="border_cart"></span>
            Total: <span class="price"><%=session.getAttribute("cartTotal") %>$</span>
            <% } %>
            </div>
            
            <div class="cart_icon"><a href="checkout.jsp" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img src="images/shoppingcart.png" alt="" title="" width="48" height="48" border="0" /></a></div>
        
        </div>
   
   
     
     
     
    
     
             
     
   </div><!-- end of right content -->   
   
            
   </div><!-- end of main content -->
