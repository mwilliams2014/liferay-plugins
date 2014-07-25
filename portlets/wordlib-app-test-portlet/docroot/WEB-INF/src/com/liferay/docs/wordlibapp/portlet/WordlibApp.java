package com.liferay.docs.wordlibapp.portlet;

import com.liferay.docs.wordlibapp.model.WordlibData;
import com.liferay.docs.wordlibapp.service.WordlibDataLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class WordlibApp
 */
public class WordlibApp extends MVCPortlet {
	
	public void addWordlibData(ActionRequest request, ActionResponse response)
	throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(WordlibApp.class.getName(), request);
		
	String name = ParamUtil.getString(request, "name");
	String person = ParamUtil.getString(request, "person");
	String place = ParamUtil.getString(request, "place");
	String adjective = ParamUtil.getString(request, "adjective");
	String animal = ParamUtil.getString(request, "animal");
	String celebrity = ParamUtil.getString(request, "celebrity");
	String verb = ParamUtil.getString(request, "verb");
	String adverb = ParamUtil.getString(request, "adverb");
	//long wordlibId = ParamUtil.getLong(request, "wordlibId");
	
	try {
		WordlibDataLocalServiceUtil.addWordlibData(serviceContext.getUserId(), name, person, place, adjective, animal, celebrity, verb, adverb, serviceContext);
		
		SessionMessages.add(request, "wordlibDataAdded");
		
		//response.setRenderParameter("wordlibId", Long.toString(wordlibId));
	
	} catch (Exception e) {
		
		SessionErrors.add(request, e.getClass().getName());
		
		response.setRenderParameter("mvcPath", "/html/wordlibapp/edit.jsp");
		
	}
	
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
		
		try {
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(WordlibApp.class.getName(), renderRequest);
			
			long groupId = serviceContext.getScopeGroupId();
			
			long wordlibId = ParamUtil.getLong(renderRequest, "wordlibId");
			
			List<WordlibData> wordlibs = WordlibDataLocalServiceUtil.getEntries(wordlibId);
			
			WordlibData wordlib = WordlibDataLocalServiceUtil.getWordlibData(wordlibId);
			
			
			wordlibId = wordlib.getWordlibId();
			
			//wordlibId = wordlibs.get(0).getWordlibId();
			
			renderRequest.setAttribute("wordlibId", wordlibId);
			
		} catch (Exception e) {
			
			throw new PortletException(e);
		}
		
		super.render(renderRequest, renderResponse);
		
	}
 
}
