
<!-- header -->      
 <%@ include file="header.jsp" %>   
    
   <!-- left content -->
    <%@ include file="left.jsp" %>

<script>
function showDiv()
{
	if(document.getElementById("userType").value == "P")
		{
			document.getElementById("div1").style.display = "block";
			document.getElementById("div2").style.display = "block";
		}
	else if(document.getElementById("userType").value == "S"){
		document.getElementById("div1").style.display = "none";
		document.getElementById("div2").style.display = "none";
	}
}
function showRate()
{
	if(document.getElementById("plan").value == "1")
		document.getElementById("rate").value = "50 $";
	else if(document.getElementById("plan").value == "2")
		document.getElementById("rate").value = "75 $";
	else if(document.getElementById("plan").value == "3")
		document.getElementById("rate").value = "100 $";
	else if(document.getElementById("plan").value == "4")
		document.getElementById("rate").value = "125 $";
	
		
}
</script>
<div class="center_content">
   	<div class="center_title_bar">Sign Up</div>
    
    <%-- <% 
     if(request.getQueryString() !=null)
     {
     if(request.getParameter("flag").equals("0")){
	 %>
	 <center><div style="color:red;"><b>Registration Unsuccessful !</b></div></center>
	 <% 
 	} 
     } %> --%>
     
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 <form name="signup" method="post" action="SignUp">
              	<div class="contact_form">
                    
                    <div style="color: red">${message}</div>
                    <div class="form_row">
                    <label class="contact"><strong>Membership Id:</strong></label>
                    <input type="text" class="contact_input" name="membershipId" />
                    </div>
                           
                    <div class="form_row">
                    <label class="contact"><strong>First Name:</strong></label>
                    <input type="text" class="contact_input" name="fname" />
                    </div>  

					<div class="form_row">
                    <label class="contact"><strong>Last Name:</strong></label>
                    <input type="text" class="contact_input" name="lname" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input type="text" class="contact_input" name="email" />
                    </div>

					<div class="form_row">
                    <label class="contact"><strong>Password:</strong></label>
                    <input type="password" class="contact_input" name="password" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Confirm Password:</strong></label>
                    <input type="password" class="contact_input" name="cpassword" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>DOB:</strong></label>
                    <input type="text" class="contact_input" name="dob"/>
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Address:</strong></label>
                    <textarea class="contact_textarea" name="address" ></textarea>
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>City:</strong></label>
                    <input type="text" class="contact_input" name="city" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>State:</strong></label>
                    <input type="text" class="contact_input" name="state" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>Zipcode:</strong></label>
                    <input type="text" class="contact_input" name="zipcode" />
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>Gender:</strong></label>
                    <input type="radio" name="sex" value="M" /> Male
					<input type="radio" name="sex" value="F" /> Female
					</div>
					
					<div class="form_row">
                    <label class="contact"><strong>Memebership Type:</strong></label>
                    <select name="userType" id="userType" onchange="showDiv();">
                    <option value="">Select Type</option>
                    <option value="S">Regular</option>
                    <option value="P">Premium</option>
                    </select>
					</div>
                   
					
					<div class="form_row" id="div1" style="display:none">
                    <label class="contact"><strong>Subscription Plan :</strong></label>
                    <select name="plan" id="plan" onchange="showRate()">
                    <option value="">Select Plan</option>
                    <option value="1">Monthly</option>
                    <option value="2">Quarterly</option>
                    <option value="3">Half-yearly</option>
                    <option value="4">Yearly</option>
                    </select>
					</div>

					<div class="form_row" id="div2" style="display:none">
					<label class="contact" ><strong>Subscription Plan :</strong></label>
					<input type="text" id="rate" class="contact_input" name="rate" value="" disabled />
					</div>
                    

                    
                    <div class="form_row" style="width:385px">
                    <input type="submit" name="signup" value="Cancel" class="contact" />
                    <input type="submit" name="signup" value="Reset" class="contact" />
                    <input type="submit" name="signup" value="Submit" class="contact" />
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

