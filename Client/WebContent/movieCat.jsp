<%
String id = request.getParameter("catId");
%>
<jsp:forward page="/MovieByCat?CatId=<%=id %>" />