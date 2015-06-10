<%@include file="init.jsp"%>



<h3>Liferay Service Builder Remote Connection</h3>
<portlet:renderURL var="addStudent">
<portlet:param name="mvcPath" value="/html/jsps/monthly_search_container.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="updateStudent">
<portlet:param name="mvcPath" value="/html/jsps/yearly_search_container.jsp"/>
</portlet:renderURL>

<br/>
<a href="<%=addStudent.toString()%>">Monthly Search From</a><br/>
<a href="<%=updateStudent.toString()%>">Yearly Search From</a><br/>