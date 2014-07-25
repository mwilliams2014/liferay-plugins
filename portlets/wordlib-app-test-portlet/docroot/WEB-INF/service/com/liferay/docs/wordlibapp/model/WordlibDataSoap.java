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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.wordlibapp.service.http.WordlibDataServiceSoap}.
 *
 * @author mike
 * @see com.liferay.docs.wordlibapp.service.http.WordlibDataServiceSoap
 * @generated
 */
public class WordlibDataSoap implements Serializable {
	public static WordlibDataSoap toSoapModel(WordlibData model) {
		WordlibDataSoap soapModel = new WordlibDataSoap();

		soapModel.setWordlibId(model.getWordlibId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setImageId(model.getImageId());
		soapModel.setName(model.getName());
		soapModel.setPerson(model.getPerson());
		soapModel.setPlace(model.getPlace());
		soapModel.setAdjective(model.getAdjective());
		soapModel.setAnimal(model.getAnimal());
		soapModel.setCelebrity(model.getCelebrity());
		soapModel.setVerb(model.getVerb());
		soapModel.setAdverb(model.getAdverb());

		return soapModel;
	}

	public static WordlibDataSoap[] toSoapModels(WordlibData[] models) {
		WordlibDataSoap[] soapModels = new WordlibDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WordlibDataSoap[][] toSoapModels(WordlibData[][] models) {
		WordlibDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WordlibDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WordlibDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WordlibDataSoap[] toSoapModels(List<WordlibData> models) {
		List<WordlibDataSoap> soapModels = new ArrayList<WordlibDataSoap>(models.size());

		for (WordlibData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WordlibDataSoap[soapModels.size()]);
	}

	public WordlibDataSoap() {
	}

	public long getPrimaryKey() {
		return _wordlibId;
	}

	public void setPrimaryKey(long pk) {
		setWordlibId(pk);
	}

	public long getWordlibId() {
		return _wordlibId;
	}

	public void setWordlibId(long wordlibId) {
		_wordlibId = wordlibId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getImageId() {
		return _imageId;
	}

	public void setImageId(long imageId) {
		_imageId = imageId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getPerson() {
		return _person;
	}

	public void setPerson(String person) {
		_person = person;
	}

	public String getPlace() {
		return _place;
	}

	public void setPlace(String place) {
		_place = place;
	}

	public String getAdjective() {
		return _adjective;
	}

	public void setAdjective(String adjective) {
		_adjective = adjective;
	}

	public String getAnimal() {
		return _animal;
	}

	public void setAnimal(String animal) {
		_animal = animal;
	}

	public String getCelebrity() {
		return _celebrity;
	}

	public void setCelebrity(String celebrity) {
		_celebrity = celebrity;
	}

	public String getVerb() {
		return _verb;
	}

	public void setVerb(String verb) {
		_verb = verb;
	}

	public String getAdverb() {
		return _adverb;
	}

	public void setAdverb(String adverb) {
		_adverb = adverb;
	}

	private long _wordlibId;
	private long _groupId;
	private long _userId;
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
}