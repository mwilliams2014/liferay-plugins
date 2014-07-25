/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.docs.wordlibapp.service.impl;
import com.liferay.docs.wordlibapp.*;
import com.liferay.docs.wordlibapp.model.WordlibData;
import com.liferay.docs.wordlibapp.service.base.WordlibDataLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The implementation of the wordlib data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.wordlibapp.service.WordlibDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mike
 * @see com.liferay.docs.wordlibapp.service.base.WordlibDataLocalServiceBaseImpl
 * @see com.liferay.docs.wordlibapp.service.WordlibDataLocalServiceUtil
 */
public class WordlibDataLocalServiceImpl extends WordlibDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.wordlibapp.service.WordlibDataLocalServiceUtil} to access the wordlib data local service.
	 */
	
	public List<WordlibData> getEntries(long wordlibId) throws SystemException {
		
		return wordlibDataPersistence.findByWordlibId(wordlibId);
	}
	//Validate input fields
	protected void validate (String name, String person, String place, String adjective, String animal, String celebrity, String verb, String adverb) throws PortalException {
		if(Validator.isNull(name)){
			throw new WordlibNameException();
		}
		
		if(Validator.isNull(person)){
			throw new WordlibPersonException();
		}
		
		if(Validator.isNull(place)){
			throw new WordlibPlaceException();
		}
		
		if(Validator.isNull(adjective)){
			throw new WordlibAdjectiveException();
		}
		
		if(Validator.isNull(animal)){
			throw new WordlibAnimalException();
		}
		
		if(Validator.isNull(celebrity)){
			throw new WordlibCelebrityException();
		}
		
		if(Validator.isNull(verb)){
			throw new WordlibVerbException();
		}
		
		if(Validator.isNull(adverb)){
			throw new WordlibAdverbException();
		}
	}
	
	public WordlibData addWordlibData( long userId, String name, String person, String place, String adjective, String animal, String celebrity, String verb, String adverb, ServiceContext serviceContext)
	throws PortalException, SystemException {
		long groupId = serviceContext.getScopeGroupId();
		
		User user = userPersistence.findByPrimaryKey(userId);
		
		validate(name, person, place, adjective, animal, celebrity, verb, adverb);
		
		long wordlibId = counterLocalService.increment(WordlibData.class.getName());
		
		WordlibData wordlibData = wordlibDataPersistence.create(wordlibId);
		
		wordlibData.setUserUuid(serviceContext.getUuid());
		wordlibData.setGroupId(groupId);
		wordlibData.setCompanyId(user.getCompanyId());
		
		wordlibData.setExpandoBridgeAttributes(serviceContext);
		wordlibData.setAdjective(adjective);
		wordlibData.setAdverb(adverb);
		wordlibData.setAnimal(animal);
		wordlibData.setCelebrity(celebrity);
		wordlibData.setName(name);
		wordlibData.setPerson(person);
		wordlibData.setPlace(place);
		wordlibData.setVerb(adverb);
		//wordlibData.setImageId(imageId);
		//wordlibData.setPrimaryKey(wordlibData.getPrimaryKey());
		
		wordlibDataPersistence.update(wordlibData);
		
		return wordlibData;
	}
}