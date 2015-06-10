<%@page import="com.liferay.krrishna.sb.remote.service.MyCustomCountryLocalServiceUtil"%>
<%@page import="com.liferay.krrishna.sb.remote.model.MyCustomCountry"%>
<%@include file="init.jsp"%>
<div>
<h3> <liferay-ui:message key="Search Monthly From" /> </h3>
<%
	List<MyCustomCountry> booksList =new ArrayList<MyCustomCountry>();
	
	booksList= (List<MyCustomCountry>)renderRequest.getAttribute("bookList");
	if(booksList==null|| booksList.isEmpty()){
		booksList=MyCustomCountryLocalServiceUtil.getMyCustomCountries(0, MyCustomCountryLocalServiceUtil.getMyCustomCountriesCount());
	}
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter(ActionRequest.ACTION_NAME, "searchPage");
	List<Integer> yearList=new ArrayList<Integer>();
	for(int i=1990;i<2099;i++){
		yearList.add(i);
		
	}
	
	//System.out.println(" iterratorurl ------- "+(String)renderRequest.getAttribute("searchFields"));

%>


<portlet:actionURL  var="searchURL" name="searchBooks" />

<aui:form action="<%=searchURL.toString() %>"  method="post" name="bookDetailForm"> 
	<aui:layout cssClass="searchField row-fluid">	
	<div class="span10">
		 <aui:column>		
			<aui:select label="Book Type" name="month" id="month" inlineLabel="left">
			       
    <aui:option value="01">January</aui:option>
    <aui:option value="02">February</aui:option>
    <aui:option value="03">March</aui:option>
    <aui:option value="04">April</aui:option>
    <aui:option value="05">May</aui:option>
    <aui:option value="06">June</aui:option>
    <aui:option value="07">July</aui:option>
    <aui:option value="08">August</aui:option>
    <aui:option value="09">September</aui:option>
    <aui:option value="10">October</aui:option>
    <aui:option value="11">November</aui:option>
    <aui:option value="12">December</aui:option>

			</aui:select>
	<aui:select label="Year" name="year" id="year" inlineLabel="left">
	
	<c:forEach var="year" items="<%=yearList %>">
	<aui:option value="${year}">${year}</aui:option>
	</c:forEach>
	</aui:select>
								
								
		</aui:column>
		 <aui:column>
		  
			<aui:button type="submit" value="Search" />
		</aui:column>
	</div>	
	</aui:layout>
	
	
</aui:form>
	
	<liferay-ui:search-container delta="5" emptyResultsMessage="Sorry. There are no where about to display." 
			iteratorURL="<%=iteratorURL %>">
		<liferay-ui:search-container-results total="<%= booksList.size() %>" 
			results="<%= ListUtil.subList(booksList,searchContainer.getStart(),searchContainer.getEnd()) %>"/>
			<liferay-ui:search-container-row modelVar="book" className="MyCustomCountry">
				 	<liferay-ui:search-container-column-text  name="CountryId"  property="countryId" > </liferay-ui:search-container-column-text>
					<liferay-ui:search-container-column-text name="Name"  property="name" />
					<liferay-ui:search-container-column-text name="Number" property="number_" />					
					<liferay-ui:search-container-column-text name="a3"  property="a3" />
					<liferay-ui:search-container-column-text name="a2" property="a2" />
						
			</liferay-ui:search-container-row>
	 <liferay-ui:search-iterator searchContainer="<%=searchContainer %>" /> 
	</liferay-ui:search-container>


</div>