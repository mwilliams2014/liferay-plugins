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

package com.liferay.docs.wordlibapp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WordlibDataService}.
 *
 * @author mike
 * @see WordlibDataService
 * @generated
 */
public class WordlibDataServiceWrapper implements WordlibDataService,
	ServiceWrapper<WordlibDataService> {
	public WordlibDataServiceWrapper(WordlibDataService wordlibDataService) {
		_wordlibDataService = wordlibDataService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _wordlibDataService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wordlibDataService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wordlibDataService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WordlibDataService getWrappedWordlibDataService() {
		return _wordlibDataService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWordlibDataService(
		WordlibDataService wordlibDataService) {
		_wordlibDataService = wordlibDataService;
	}

	@Override
	public WordlibDataService getWrappedService() {
		return _wordlibDataService;
	}

	@Override
	public void setWrappedService(WordlibDataService wordlibDataService) {
		_wordlibDataService = wordlibDataService;
	}

	private WordlibDataService _wordlibDataService;
}