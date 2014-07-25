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

package com.liferay.docs.wordlibapp.service.persistence;

import com.liferay.docs.wordlibapp.model.WordlibData;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the wordlib data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mike
 * @see WordlibDataPersistenceImpl
 * @see WordlibDataUtil
 * @generated
 */
public interface WordlibDataPersistence extends BasePersistence<WordlibData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WordlibDataUtil} to access the wordlib data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the wordlib datas where wordlibId = &#63;.
	*
	* @param wordlibId the wordlib ID
	* @return the matching wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.wordlibapp.model.WordlibData> findByWordlibId(
		long wordlibId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the wordlib datas where wordlibId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.wordlibapp.model.impl.WordlibDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wordlibId the wordlib ID
	* @param start the lower bound of the range of wordlib datas
	* @param end the upper bound of the range of wordlib datas (not inclusive)
	* @return the range of matching wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.wordlibapp.model.WordlibData> findByWordlibId(
		long wordlibId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the wordlib datas where wordlibId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.wordlibapp.model.impl.WordlibDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wordlibId the wordlib ID
	* @param start the lower bound of the range of wordlib datas
	* @param end the upper bound of the range of wordlib datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.wordlibapp.model.WordlibData> findByWordlibId(
		long wordlibId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first wordlib data in the ordered set where wordlibId = &#63;.
	*
	* @param wordlibId the wordlib ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wordlib data
	* @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a matching wordlib data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData findByWordlibId_First(
		long wordlibId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first wordlib data in the ordered set where wordlibId = &#63;.
	*
	* @param wordlibId the wordlib ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wordlib data, or <code>null</code> if a matching wordlib data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData fetchByWordlibId_First(
		long wordlibId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last wordlib data in the ordered set where wordlibId = &#63;.
	*
	* @param wordlibId the wordlib ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wordlib data
	* @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a matching wordlib data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData findByWordlibId_Last(
		long wordlibId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last wordlib data in the ordered set where wordlibId = &#63;.
	*
	* @param wordlibId the wordlib ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wordlib data, or <code>null</code> if a matching wordlib data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData fetchByWordlibId_Last(
		long wordlibId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the wordlib datas where wordlibId = &#63; from the database.
	*
	* @param wordlibId the wordlib ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWordlibId(long wordlibId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of wordlib datas where wordlibId = &#63;.
	*
	* @param wordlibId the wordlib ID
	* @return the number of matching wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByWordlibId(long wordlibId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the wordlib data in the entity cache if it is enabled.
	*
	* @param wordlibData the wordlib data
	*/
	public void cacheResult(
		com.liferay.docs.wordlibapp.model.WordlibData wordlibData);

	/**
	* Caches the wordlib datas in the entity cache if it is enabled.
	*
	* @param wordlibDatas the wordlib datas
	*/
	public void cacheResult(
		java.util.List<com.liferay.docs.wordlibapp.model.WordlibData> wordlibDatas);

	/**
	* Creates a new wordlib data with the primary key. Does not add the wordlib data to the database.
	*
	* @param wordlibId the primary key for the new wordlib data
	* @return the new wordlib data
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData create(long wordlibId);

	/**
	* Removes the wordlib data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wordlibId the primary key of the wordlib data
	* @return the wordlib data that was removed
	* @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a wordlib data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData remove(long wordlibId)
		throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.docs.wordlibapp.model.WordlibData updateImpl(
		com.liferay.docs.wordlibapp.model.WordlibData wordlibData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the wordlib data with the primary key or throws a {@link com.liferay.docs.wordlibapp.NoSuchWordlibDataException} if it could not be found.
	*
	* @param wordlibId the primary key of the wordlib data
	* @return the wordlib data
	* @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a wordlib data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData findByPrimaryKey(
		long wordlibId)
		throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the wordlib data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wordlibId the primary key of the wordlib data
	* @return the wordlib data, or <code>null</code> if a wordlib data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.wordlibapp.model.WordlibData fetchByPrimaryKey(
		long wordlibId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the wordlib datas.
	*
	* @return the wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.wordlibapp.model.WordlibData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the wordlib datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.wordlibapp.model.impl.WordlibDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wordlib datas
	* @param end the upper bound of the range of wordlib datas (not inclusive)
	* @return the range of wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.wordlibapp.model.WordlibData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the wordlib datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.wordlibapp.model.impl.WordlibDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wordlib datas
	* @param end the upper bound of the range of wordlib datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.wordlibapp.model.WordlibData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the wordlib datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of wordlib datas.
	*
	* @return the number of wordlib datas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}