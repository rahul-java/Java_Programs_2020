<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="lgn">

<table border="3" bgcolor="yellow">

<tr> <td>Email</td>  
<td><s:textfield name="email"/>   </td>
</tr>

<tr> <td>Phone</td>  
<td><s:textfield name="phone"/>   </td>
</tr>


<tr> <td>Name</td>  
<td><s:textfield name="name"/>   </td>
</tr>
<tr>   
<td><s:submit/> </td>
</tr>

</table>




</s:form>

</body>
</html>