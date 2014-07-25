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

import com.liferay.docs.wordlibapp.service.ClpSerializer;
import com.liferay.docs.wordlibapp.service.WordlibDataLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mike
 */
public class WordlibDataClp extends BaseModelImpl<WordlibData>
	implements WordlibData {
	public WordlibDataClp() {
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
	public long getPrimaryKey() {
		return _wordlibId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWordlibId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wordlibId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getWordlibId() {
		return _wordlibId;
	}

	@Override
	public void setWordlibId(long wordlibId) {
		_wordlibId = wordlibId;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setWordlibId", long.class);

				method.invoke(_wordlibDataRemoteModel, wordlibId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_wordlibDataRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_wordlibDataRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_wordlibDataRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getImageId() {
		return _imageId;
	}

	@Override
	public void setImageId(long imageId) {
		_imageId = imageId;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setImageId", long.class);

				method.invoke(_wordlibDataRemoteModel, imageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_wordlibDataRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPerson() {
		return _person;
	}

	@Override
	public void setPerson(String person) {
		_person = person;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setPerson", String.class);

				method.invoke(_wordlibDataRemoteModel, person);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlace() {
		return _place;
	}

	@Override
	public void setPlace(String place) {
		_place = place;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setPlace", String.class);

				method.invoke(_wordlibDataRemoteModel, place);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdjective() {
		return _adjective;
	}

	@Override
	public void setAdjective(String adjective) {
		_adjective = adjective;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setAdjective", String.class);

				method.invoke(_wordlibDataRemoteModel, adjective);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnimal() {
		return _animal;
	}

	@Override
	public void setAnimal(String animal) {
		_animal = animal;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setAnimal", String.class);

				method.invoke(_wordlibDataRemoteModel, animal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCelebrity() {
		return _celebrity;
	}

	@Override
	public void setCelebrity(String celebrity) {
		_celebrity = celebrity;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCelebrity", String.class);

				method.invoke(_wordlibDataRemoteModel, celebrity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVerb() {
		return _verb;
	}

	@Override
	public void setVerb(String verb) {
		_verb = verb;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setVerb", String.class);

				method.invoke(_wordlibDataRemoteModel, verb);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdverb() {
		return _adverb;
	}

	@Override
	public void setAdverb(String adverb) {
		_adverb = adverb;

		if (_wordlibDataRemoteModel != null) {
			try {
				Class<?> clazz = _wordlibDataRemoteModel.getClass();

				Method method = clazz.getMethod("setAdverb", String.class);

				method.invoke(_wordlibDataRemoteModel, adverb);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWordlibDataRemoteModel() {
		return _wordlibDataRemoteModel;
	}

	public void setWordlibDataRemoteModel(BaseModel<?> wordlibDataRemoteModel) {
		_wordlibDataRemoteModel = wordlibDataRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _wordlibDataRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_wordlibDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WordlibDataLocalServiceUtil.addWordlibData(this);
		}
		else {
			WordlibDataLocalServiceUtil.updateWordlibData(this);
		}
	}

	@Override
	public WordlibData toEscapedModel() {
		return (WordlibData)ProxyUtil.newProxyInstance(WordlibData.class.getClassLoader(),
			new Class[] { WordlibData.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WordlibDataClp clone = new WordlibDataClp();

		clone.setWordlibId(getWordlibId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCompanyId(getCompanyId());
		clone.setImageId(getImageId());
		clone.setName(getName());
		clone.setPerson(getPerson());
		clone.setPlace(getPlace());
		clone.setAdjective(getAdjective());
		clone.setAnimal(getAnimal());
		clone.setCelebrity(getCelebrity());
		clone.setVerb(getVerb());
		clone.setAdverb(getAdverb());

		return clone;
	}

	@Override
	public int compareTo(WordlibData wordlibData) {
		long primaryKey = wordlibData.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WordlibDataClp)) {
			return false;
		}

		WordlibDataClp wordlibData = (WordlibDataClp)obj;

		long primaryKey = wordlibData.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{wordlibId=");
		sb.append(getWordlibId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", imageId=");
		sb.append(getImageId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", person=");
		sb.append(getPerson());
		sb.append(", place=");
		sb.append(getPlace());
		sb.append(", adjective=");
		sb.append(getAdjective());
		sb.append(", animal=");
		sb.append(getAnimal());
		sb.append(", celebrity=");
		sb.append(getCelebrity());
		sb.append(", verb=");
		sb.append(getVerb());
		sb.append(", adverb=");
		sb.append(getAdverb());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.wordlibapp.model.WordlibData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>wordlibId</column-name><column-value><![CDATA[");
		sb.append(getWordlibId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imageId</column-name><column-value><![CDATA[");
		sb.append(getImageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>person</column-name><column-value><![CDATA[");
		sb.append(getPerson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>place</column-name><column-value><![CDATA[");
		sb.append(getPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>adjective</column-name><column-value><![CDATA[");
		sb.append(getAdjective());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animal</column-name><column-value><![CDATA[");
		sb.append(getAnimal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>celebrity</column-name><column-value><![CDATA[");
		sb.append(getCelebrity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verb</column-name><column-value><![CDATA[");
		sb.append(getVerb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>adverb</column-name><column-value><![CDATA[");
		sb.append(getAdverb());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _wordlibId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private long _companyId;
	private long _imageId;
	private String _name;
	private String _person;
	private String _place;
	private String _adjective;
	private String _animal;
	private String _celebrity;
	private String _verb;
	private String _adverb;
	private BaseModel<?> _wordlibDataRemoteModel;
}