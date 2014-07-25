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

package com.liferay.docs.wordlibapp.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WordlibData}.
 * </p>
 *
 * @author mike
 * @see WordlibData
 * @generated
 */
public class WordlibDataWrapper implements WordlibData,
	ModelWrapper<WordlibData> {
	public WordlibDataWrapper(WordlibData wordlibData) {
		_wordlibData = wordlibData;
	}

	@Override
	public Class<?> getModelClass() {
		return WordlibData.class;
	}

	@Override
	public String getModelClassName() {
		return WordlibData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wordlibId", getWordlibId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("companyId", getCompanyId());
		attributes.put("imageId", getImageId());
		attributes.put("name", getName());
		attributes.put("person", getPerson());
		attributes.put("place", getPlace());
		attributes.put("adjective", getAdjective());
		attributes.put("animal", getAnimal());
		attributes.put("celebrity", getCelebrity());
		attributes.put("verb", getVerb());
		attributes.put("adverb", getAdverb());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wordlibId = (Long)attributes.get("wordlibId");

		if (wordlibId != null) {
			setWordlibId(wordlibId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String person = (String)attributes.get("person");

		if (person != null) {
			setPerson(person);
		}

		String place = (String)attributes.get("place");

		if (place != null) {
			setPlace(place);
		}

		String adjective = (String)attributes.get("adjective");

		if (adjective != null) {
			setAdjective(adjective);
		}

		String animal = (String)attributes.get("animal");

		if (animal != null) {
			setAnimal(animal);
		}

		String celebrity = (String)attributes.get("celebrity");

		if (celebrity != null) {
			setCelebrity(celebrity);
		}

		String verb = (String)attributes.get("verb");

		if (verb != null) {
			setVerb(verb);
		}

		String adverb = (String)attributes.get("adverb");

		if (adverb != null) {
			setAdverb(adverb);
		}
	}

	/**
	* Returns the primary key of this wordlib data.
	*
	* @return the primary key of this wordlib data
	*/
	@Override
	public long getPrimaryKey() {
		return _wordlibData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this wordlib data.
	*
	* @param primaryKey the primary key of this wordlib data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wordlibData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the wordlib ID of this wordlib data.
	*
	* @return the wordlib ID of this wordlib data
	*/
	@Override
	public long getWordlibId() {
		return _wordlibData.getWordlibId();
	}

	/**
	* Sets the wordlib ID of this wordlib data.
	*
	* @param wordlibId the wordlib ID of this wordlib data
	*/
	@Override
	public void setWordlibId(long wordlibId) {
		_wordlibData.setWordlibId(wordlibId);
	}

	/**
	* Returns the group ID of this wordlib data.
	*
	* @return the group ID of this wordlib data
	*/
	@Override
	public long getGroupId() {
		return _wordlibData.getGroupId();
	}

	/**
	* Sets the group ID of this wordlib data.
	*
	* @param groupId the group ID of this wordlib data
	*/
	@Override
	public void setGroupId(long groupId) {
		_wordlibData.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this wordlib data.
	*
	* @return the user ID of this wordlib data
	*/
	@Override
	public long getUserId() {
		return _wordlibData.getUserId();
	}

	/**
	* Sets the user ID of this wordlib data.
	*
	* @param userId the user ID of this wordlib data
	*/
	@Override
	public void setUserId(long userId) {
		_wordlibData.setUserId(userId);
	}

	/**
	* Returns the user uuid of this wordlib data.
	*
	* @return the user uuid of this wordlib data
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wordlibData.getUserUuid();
	}

	/**
	* Sets the user uuid of this wordlib data.
	*
	* @param userUuid the user uuid of this wordlib data
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_wordlibData.setUserUuid(userUuid);
	}

	/**
	* Returns the company ID of this wordlib data.
	*
	* @return the company ID of this wordlib data
	*/
	@Override
	public long getCompanyId() {
		return _wordlibData.getCompanyId();
	}

	/**
	* Sets the company ID of this wordlib data.
	*
	* @param companyId the company ID of this wordlib data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_wordlibData.setCompanyId(companyId);
	}

	/**
	* Returns the image ID of this wordlib data.
	*
	* @return the image ID of this wordlib data
	*/
	@Override
	public long getImageId() {
		return _wordlibData.getImageId();
	}

	/**
	* Sets the image ID of this wordlib data.
	*
	* @param imageId the image ID of this wordlib data
	*/
	@Override
	public void setImageId(long imageId) {
		_wordlibData.setImageId(imageId);
	}

	/**
	* Returns the name of this wordlib data.
	*
	* @return the name of this wordlib data
	*/
	@Override
	public java.lang.String getName() {
		return _wordlibData.getName();
	}

	/**
	* Sets the name of this wordlib data.
	*
	* @param name the name of this wordlib data
	*/
	@Override
	public void setName(java.lang.String name) {
		_wordlibData.setName(name);
	}

	/**
	* Returns the person of this wordlib data.
	*
	* @return the person of this wordlib data
	*/
	@Override
	public java.lang.String getPerson() {
		return _wordlibData.getPerson();
	}

	/**
	* Sets the person of this wordlib data.
	*
	* @param person the person of this wordlib data
	*/
	@Override
	public void setPerson(java.lang.String person) {
		_wordlibData.setPerson(person);
	}

	/**
	* Returns the place of this wordlib data.
	*
	* @return the place of this wordlib data
	*/
	@Override
	public java.lang.String getPlace() {
		return _wordlibData.getPlace();
	}

	/**
	* Sets the place of this wordlib data.
	*
	* @param place the place of this wordlib data
	*/
	@Override
	public void setPlace(java.lang.String place) {
		_wordlibData.setPlace(place);
	}

	/**
	* Returns the adjective of this wordlib data.
	*
	* @return the adjective of this wordlib data
	*/
	@Override
	public java.lang.String getAdjective() {
		return _wordlibData.getAdjective();
	}

	/**
	* Sets the adjective of this wordlib data.
	*
	* @param adjective the adjective of this wordlib data
	*/
	@Override
	public void setAdjective(java.lang.String adjective) {
		_wordlibData.setAdjective(adjective);
	}

	/**
	* Returns the animal of this wordlib data.
	*
	* @return the animal of this wordlib data
	*/
	@Override
	public java.lang.String getAnimal() {
		return _wordlibData.getAnimal();
	}

	/**
	* Sets the animal of this wordlib data.
	*
	* @param animal the animal of this wordlib data
	*/
	@Override
	public void setAnimal(java.lang.String animal) {
		_wordlibData.setAnimal(animal);
	}

	/**
	* Returns the celebrity of this wordlib data.
	*
	* @return the celebrity of this wordlib data
	*/
	@Override
	public java.lang.String getCelebrity() {
		return _wordlibData.getCelebrity();
	}

	/**
	* Sets the celebrity of this wordlib data.
	*
	* @param celebrity the celebrity of this wordlib data
	*/
	@Override
	public void setCelebrity(java.lang.String celebrity) {
		_wordlibData.setCelebrity(celebrity);
	}

	/**
	* Returns the verb of this wordlib data.
	*
	* @return the verb of this wordlib data
	*/
	@Override
	public java.lang.String getVerb() {
		return _wordlibData.getVerb();
	}

	/**
	* Sets the verb of this wordlib data.
	*
	* @param verb the verb of this wordlib data
	*/
	@Override
	public void setVerb(java.lang.String verb) {
		_wordlibData.setVerb(verb);
	}

	/**
	* Returns the adverb of this wordlib data.
	*
	* @return the adverb of this wordlib data
	*/
	@Override
	public java.lang.String getAdverb() {
		return _wordlibData.getAdverb();
	}

	/**
	* Sets the adverb of this wordlib data.
	*
	* @param adverb the adverb of this wordlib data
	*/
	@Override
	public void setAdverb(java.lang.String adverb) {
		_wordlibData.setAdverb(adverb);
	}

	@Override
	public boolean isNew() {
		return _wordlibData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_wordlibData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _wordlibData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wordlibData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _wordlibData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _wordlibData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wordlibData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wordlibData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_wordlibData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_wordlibData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wordlibData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WordlibDataWrapper((WordlibData)_wordlibData.clone());
	}

	@Override
	public int compareTo(
		com.liferay.docs.wordlibapp.model.WordlibData wordlibData) {
		return _wordlibData.compareTo(wordlibData);
	}

	@Override
	public int hashCode() {
		return _wordlibData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.wordlibapp.model.WordlibData> toCacheModel() {
		return _wordlibData.toCacheModel();
	}

	@Override
	public com.liferay.docs.wordlibapp.model.WordlibData toEscapedModel() {
		return new WordlibDataWrapper(_wordlibData.toEscapedModel());
	}

	@Override
	public com.liferay.docs.wordlibapp.model.WordlibData toUnescapedModel() {
		return new WordlibDataWrapper(_wordlibData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wordlibData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wordlibData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wordlibData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WordlibDataWrapper)) {
			return false;
		}

		WordlibDataWrapper wordlibDataWrapper = (WordlibDataWrapper)obj;

		if (Validator.equals(_wordlibData, wordlibDataWrapper._wordlibData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WordlibData getWrappedWordlibData() {
		return _wordlibData;
	}

	@Override
	public WordlibData getWrappedModel() {
		return _wordlibData;
	}

	@Override
	public void resetOriginalValues() {
		_wordlibData.resetOriginalValues();
	}

	private WordlibData _wordlibData;
}