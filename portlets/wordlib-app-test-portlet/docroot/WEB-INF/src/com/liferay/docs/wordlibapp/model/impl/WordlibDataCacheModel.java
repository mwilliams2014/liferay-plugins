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

package com.liferay.docs.wordlibapp.model.impl;

import com.liferay.docs.wordlibapp.model.WordlibData;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing WordlibData in entity cache.
 *
 * @author mike
 * @see WordlibData
 * @generated
 */
public class WordlibDataCacheModel implements CacheModel<WordlibData>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{wordlibId=");
		sb.append(wordlibId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", imageId=");
		sb.append(imageId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", person=");
		sb.append(person);
		sb.append(", place=");
		sb.append(place);
		sb.append(", adjective=");
		sb.append(adjective);
		sb.append(", animal=");
		sb.append(animal);
		sb.append(", celebrity=");
		sb.append(celebrity);
		sb.append(", verb=");
		sb.append(verb);
		sb.append(", adverb=");
		sb.append(adverb);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WordlibData toEntityModel() {
		WordlibDataImpl wordlibDataImpl = new WordlibDataImpl();

		wordlibDataImpl.setWordlibId(wordlibId);
		wordlibDataImpl.setGroupId(groupId);
		wordlibDataImpl.setUserId(userId);
		wordlibDataImpl.setCompanyId(companyId);
		wordlibDataImpl.setImageId(imageId);

		if (name == null) {
			wordlibDataImpl.setName(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setName(name);
		}

		if (person == null) {
			wordlibDataImpl.setPerson(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setPerson(person);
		}

		if (place == null) {
			wordlibDataImpl.setPlace(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setPlace(place);
		}

		if (adjective == null) {
			wordlibDataImpl.setAdjective(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setAdjective(adjective);
		}

		if (animal == null) {
			wordlibDataImpl.setAnimal(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setAnimal(animal);
		}

		if (celebrity == null) {
			wordlibDataImpl.setCelebrity(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setCelebrity(celebrity);
		}

		if (verb == null) {
			wordlibDataImpl.setVerb(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setVerb(verb);
		}

		if (adverb == null) {
			wordlibDataImpl.setAdverb(StringPool.BLANK);
		}
		else {
			wordlibDataImpl.setAdverb(adverb);
		}

		wordlibDataImpl.resetOriginalValues();

		return wordlibDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wordlibId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		companyId = objectInput.readLong();
		imageId = objectInput.readLong();
		name = objectInput.readUTF();
		person = objectInput.readUTF();
		place = objectInput.readUTF();
		adjective = objectInput.readUTF();
		animal = objectInput.readUTF();
		celebrity = objectInput.readUTF();
		verb = objectInput.readUTF();
		adverb = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(wordlibId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(imageId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (person == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(person);
		}

		if (place == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(place);
		}

		if (adjective == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(adjective);
		}

		if (animal == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(animal);
		}

		if (celebrity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(celebrity);
		}

		if (verb == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(verb);
		}

		if (adverb == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(adverb);
		}
	}

	public long wordlibId;
	public long groupId;
	public long userId;
	public long companyId;
	public long imageId;
	public String name;
	public String person;
	public String place;
	public String adjective;
	public String animal;
	public String celebrity;
	public String verb;
	public String adverb;
}