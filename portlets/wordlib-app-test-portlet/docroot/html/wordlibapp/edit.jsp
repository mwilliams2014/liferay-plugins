<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<%@include file="/html/init.jsp"%>

This is the <b>Wordlib App</b> portlet in Edit mode.

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/wordlibapp/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addWordlibData" var="addWordlibURL"></portlet:actionURL>

<aui:form action="<%= addWordlibURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>

            <aui:input name="name"></aui:input>
            <aui:input name="person"></aui:input>
            <aui:input name="place" value=""></aui:input>
            <aui:input name="adjective" value=""></aui:input>
            <aui:input name="animal" value=""></aui:input>
            <aui:input name="celebrity" value=""></aui:input>
            <aui:input name="verb" value=""></aui:input>
            <aui:input name="adverb" value=""></aui:input>
            <aui:input name='wordlibId' type='hidden' value='<%= ParamUtil.getString(renderRequest, "wordlibId") %>'/>

        </aui:fieldset>

        <aui:button-row>

			<aui:button type="submit"></aui:button>
			<aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>

        </aui:button-row>
</aui:form>


