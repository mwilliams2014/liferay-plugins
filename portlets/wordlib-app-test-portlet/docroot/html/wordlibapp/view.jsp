<%@page import="com.liferay.docs.wordlibapp.service.impl.WordlibDataLocalServiceImpl"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@include file="/html/init.jsp"%>

<%
    //long wordlibId = Long.valueOf((Long) renderRequest
      //      .getAttribute("wordlibId"));
            String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

This is the <b>Wordlib App</b> portlet in View mode.<br>
Hi! I'm Bob!
<aui:button-row cssClass="guestbook-buttons">

	<portlet:renderURL var="addWordlibURL">
		<portlet:param name="mvcPath" value="/html/wordlibapp/edit.jsp"></portlet:param>
	</portlet:renderURL>
	
	<aui:button onClick="<%= addWordlibURL.toString() %>" value="Add Wordlib"></aui:button>
	
</aui:button-row>
<% String adj =ParamUtil.getString(request, "person"); %>
<% //String Nam = WordlibDataLocalServiceUtil.getWordlibData(wordlibId).getAdjective().toString(); %>
<%//String Nam=WordlibData.class.getName();  %>
<%//String Nam = WordlibDataLocalServiceUtil.getEntries(wordlibId)  %>
<%//gives no errors, but displays object [] %> 
<% //String adj =WordlibDataLocalServiceUtil.getWordlibData(wordlibId).getAdjective(); %>


Hello you're going to the <%=adj %>hat.
