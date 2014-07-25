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

import com.liferay.docs.wordlibapp.NoSuchWordlibDataException;
import com.liferay.docs.wordlibapp.model.WordlibData;
import com.liferay.docs.wordlibapp.model.impl.WordlibDataImpl;
import com.liferay.docs.wordlibapp.model.impl.WordlibDataModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the wordlib data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mike
 * @see WordlibDataPersistence
 * @see WordlibDataUtil
 * @generated
 */
public class WordlibDataPersistenceImpl extends BasePersistenceImpl<WordlibData>
	implements WordlibDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WordlibDataUtil} to access the wordlib data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WordlibDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataModelImpl.FINDER_CACHE_ENABLED, WordlibDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataModelImpl.FINDER_CACHE_ENABLED, WordlibDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WORDLIBID =
		new FinderPath(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataModelImpl.FINDER_CACHE_ENABLED, WordlibDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWordlibId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORDLIBID =
		new FinderPath(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataModelImpl.FINDER_CACHE_ENABLED, WordlibDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWordlibId",
			new String[] { Long.class.getName() },
			WordlibDataModelImpl.WORDLIBID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WORDLIBID = new FinderPath(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWordlibId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the wordlib datas where wordlibId = &#63;.
	 *
	 * @param wordlibId the wordlib ID
	 * @return the matching wordlib datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WordlibData> findByWordlibId(long wordlibId)
		throws SystemException {
		return findByWordlibId(wordlibId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<WordlibData> findByWordlibId(long wordlibId, int start, int end)
		throws SystemException {
		return findByWordlibId(wordlibId, start, end, null);
	}

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
	@Override
	public List<WordlibData> findByWordlibId(long wordlibId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORDLIBID;
			finderArgs = new Object[] { wordlibId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WORDLIBID;
			finderArgs = new Object[] { wordlibId, start, end, orderByComparator };
		}

		List<WordlibData> list = (List<WordlibData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WordlibData wordlibData : list) {
				if ((wordlibId != wordlibData.getWordlibId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_WORDLIBDATA_WHERE);

			query.append(_FINDER_COLUMN_WORDLIBID_WORDLIBID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WordlibDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wordlibId);

				if (!pagination) {
					list = (List<WordlibData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WordlibData>(list);
				}
				else {
					list = (List<WordlibData>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first wordlib data in the ordered set where wordlibId = &#63;.
	 *
	 * @param wordlibId the wordlib ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wordlib data
	 * @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a matching wordlib data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData findByWordlibId_First(long wordlibId,
		OrderByComparator orderByComparator)
		throws NoSuchWordlibDataException, SystemException {
		WordlibData wordlibData = fetchByWordlibId_First(wordlibId,
				orderByComparator);

		if (wordlibData != null) {
			return wordlibData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wordlibId=");
		msg.append(wordlibId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWordlibDataException(msg.toString());
	}

	/**
	 * Returns the first wordlib data in the ordered set where wordlibId = &#63;.
	 *
	 * @param wordlibId the wordlib ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wordlib data, or <code>null</code> if a matching wordlib data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData fetchByWordlibId_First(long wordlibId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WordlibData> list = findByWordlibId(wordlibId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wordlib data in the ordered set where wordlibId = &#63;.
	 *
	 * @param wordlibId the wordlib ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wordlib data
	 * @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a matching wordlib data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData findByWordlibId_Last(long wordlibId,
		OrderByComparator orderByComparator)
		throws NoSuchWordlibDataException, SystemException {
		WordlibData wordlibData = fetchByWordlibId_Last(wordlibId,
				orderByComparator);

		if (wordlibData != null) {
			return wordlibData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wordlibId=");
		msg.append(wordlibId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWordlibDataException(msg.toString());
	}

	/**
	 * Returns the last wordlib data in the ordered set where wordlibId = &#63;.
	 *
	 * @param wordlibId the wordlib ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wordlib data, or <code>null</code> if a matching wordlib data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData fetchByWordlibId_Last(long wordlibId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWordlibId(wordlibId);

		if (count == 0) {
			return null;
		}

		List<WordlibData> list = findByWordlibId(wordlibId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the wordlib datas where wordlibId = &#63; from the database.
	 *
	 * @param wordlibId the wordlib ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWordlibId(long wordlibId) throws SystemException {
		for (WordlibData wordlibData : findByWordlibId(wordlibId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(wordlibData);
		}
	}

	/**
	 * Returns the number of wordlib datas where wordlibId = &#63;.
	 *
	 * @param wordlibId the wordlib ID
	 * @return the number of matching wordlib datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWordlibId(long wordlibId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WORDLIBID;

		Object[] finderArgs = new Object[] { wordlibId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORDLIBDATA_WHERE);

			query.append(_FINDER_COLUMN_WORDLIBID_WORDLIBID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wordlibId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_WORDLIBID_WORDLIBID_2 = "wordlibData.wordlibId = ?";

	public WordlibDataPersistenceImpl() {
		setModelClass(WordlibData.class);
	}

	/**
	 * Caches the wordlib data in the entity cache if it is enabled.
	 *
	 * @param wordlibData the wordlib data
	 */
	@Override
	public void cacheResult(WordlibData wordlibData) {
		EntityCacheUtil.putResult(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataImpl.class, wordlibData.getPrimaryKey(), wordlibData);

		wordlibData.resetOriginalValues();
	}

	/**
	 * Caches the wordlib datas in the entity cache if it is enabled.
	 *
	 * @param wordlibDatas the wordlib datas
	 */
	@Override
	public void cacheResult(List<WordlibData> wordlibDatas) {
		for (WordlibData wordlibData : wordlibDatas) {
			if (EntityCacheUtil.getResult(
						WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
						WordlibDataImpl.class, wordlibData.getPrimaryKey()) == null) {
				cacheResult(wordlibData);
			}
			else {
				wordlibData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wordlib datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WordlibDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WordlibDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wordlib data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WordlibData wordlibData) {
		EntityCacheUtil.removeResult(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataImpl.class, wordlibData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WordlibData> wordlibDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WordlibData wordlibData : wordlibDatas) {
			EntityCacheUtil.removeResult(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
				WordlibDataImpl.class, wordlibData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wordlib data with the primary key. Does not add the wordlib data to the database.
	 *
	 * @param wordlibId the primary key for the new wordlib data
	 * @return the new wordlib data
	 */
	@Override
	public WordlibData create(long wordlibId) {
		WordlibData wordlibData = new WordlibDataImpl();

		wordlibData.setNew(true);
		wordlibData.setPrimaryKey(wordlibId);

		return wordlibData;
	}

	/**
	 * Removes the wordlib data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wordlibId the primary key of the wordlib data
	 * @return the wordlib data that was removed
	 * @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a wordlib data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData remove(long wordlibId)
		throws NoSuchWordlibDataException, SystemException {
		return remove((Serializable)wordlibId);
	}

	/**
	 * Removes the wordlib data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wordlib data
	 * @return the wordlib data that was removed
	 * @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a wordlib data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData remove(Serializable primaryKey)
		throws NoSuchWordlibDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WordlibData wordlibData = (WordlibData)session.get(WordlibDataImpl.class,
					primaryKey);

			if (wordlibData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWordlibDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wordlibData);
		}
		catch (NoSuchWordlibDataException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected WordlibData removeImpl(WordlibData wordlibData)
		throws SystemException {
		wordlibData = toUnwrappedModel(wordlibData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wordlibData)) {
				wordlibData = (WordlibData)session.get(WordlibDataImpl.class,
						wordlibData.getPrimaryKeyObj());
			}

			if (wordlibData != null) {
				session.delete(wordlibData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wordlibData != null) {
			clearCache(wordlibData);
		}

		return wordlibData;
	}

	@Override
	public WordlibData updateImpl(
		com.liferay.docs.wordlibapp.model.WordlibData wordlibData)
		throws SystemException {
		wordlibData = toUnwrappedModel(wordlibData);

		boolean isNew = wordlibData.isNew();

		WordlibDataModelImpl wordlibDataModelImpl = (WordlibDataModelImpl)wordlibData;

		Session session = null;

		try {
			session = openSession();

			if (wordlibData.isNew()) {
				session.save(wordlibData);

				wordlibData.setNew(false);
			}
			else {
				session.merge(wordlibData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !WordlibDataModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((wordlibDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORDLIBID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						wordlibDataModelImpl.getOriginalWordlibId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WORDLIBID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORDLIBID,
					args);

				args = new Object[] { wordlibDataModelImpl.getWordlibId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WORDLIBID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORDLIBID,
					args);
			}
		}

		EntityCacheUtil.putResult(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
			WordlibDataImpl.class, wordlibData.getPrimaryKey(), wordlibData);

		return wordlibData;
	}

	protected WordlibData toUnwrappedModel(WordlibData wordlibData) {
		if (wordlibData instanceof WordlibDataImpl) {
			return wordlibData;
		}

		WordlibDataImpl wordlibDataImpl = new WordlibDataImpl();

		wordlibDataImpl.setNew(wordlibData.isNew());
		wordlibDataImpl.setPrimaryKey(wordlibData.getPrimaryKey());

		wordlibDataImpl.setWordlibId(wordlibData.getWordlibId());
		wordlibDataImpl.setGroupId(wordlibData.getGroupId());
		wordlibDataImpl.setUserId(wordlibData.getUserId());
		wordlibDataImpl.setCompanyId(wordlibData.getCompanyId());
		wordlibDataImpl.setImageId(wordlibData.getImageId());
		wordlibDataImpl.setName(wordlibData.getName());
		wordlibDataImpl.setPerson(wordlibData.getPerson());
		wordlibDataImpl.setPlace(wordlibData.getPlace());
		wordlibDataImpl.setAdjective(wordlibData.getAdjective());
		wordlibDataImpl.setAnimal(wordlibData.getAnimal());
		wordlibDataImpl.setCelebrity(wordlibData.getCelebrity());
		wordlibDataImpl.setVerb(wordlibData.getVerb());
		wordlibDataImpl.setAdverb(wordlibData.getAdverb());

		return wordlibDataImpl;
	}

	/**
	 * Returns the wordlib data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wordlib data
	 * @return the wordlib data
	 * @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a wordlib data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWordlibDataException, SystemException {
		WordlibData wordlibData = fetchByPrimaryKey(primaryKey);

		if (wordlibData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWordlibDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wordlibData;
	}

	/**
	 * Returns the wordlib data with the primary key or throws a {@link com.liferay.docs.wordlibapp.NoSuchWordlibDataException} if it could not be found.
	 *
	 * @param wordlibId the primary key of the wordlib data
	 * @return the wordlib data
	 * @throws com.liferay.docs.wordlibapp.NoSuchWordlibDataException if a wordlib data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData findByPrimaryKey(long wordlibId)
		throws NoSuchWordlibDataException, SystemException {
		return findByPrimaryKey((Serializable)wordlibId);
	}

	/**
	 * Returns the wordlib data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wordlib data
	 * @return the wordlib data, or <code>null</code> if a wordlib data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		WordlibData wordlibData = (WordlibData)EntityCacheUtil.getResult(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
				WordlibDataImpl.class, primaryKey);

		if (wordlibData == _nullWordlibData) {
			return null;
		}

		if (wordlibData == null) {
			Session session = null;

			try {
				session = openSession();

				wordlibData = (WordlibData)session.get(WordlibDataImpl.class,
						primaryKey);

				if (wordlibData != null) {
					cacheResult(wordlibData);
				}
				else {
					EntityCacheUtil.putResult(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
						WordlibDataImpl.class, primaryKey, _nullWordlibData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(WordlibDataModelImpl.ENTITY_CACHE_ENABLED,
					WordlibDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wordlibData;
	}

	/**
	 * Returns the wordlib data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wordlibId the primary key of the wordlib data
	 * @return the wordlib data, or <code>null</code> if a wordlib data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WordlibData fetchByPrimaryKey(long wordlibId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)wordlibId);
	}

	/**
	 * Returns all the wordlib datas.
	 *
	 * @return the wordlib datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WordlibData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<WordlibData> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<WordlibData> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<WordlibData> list = (List<WordlibData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WORDLIBDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WORDLIBDATA;

				if (pagination) {
					sql = sql.concat(WordlibDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<WordlibData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WordlibData>(list);
				}
				else {
					list = (List<WordlibData>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the wordlib datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (WordlibData wordlibData : findAll()) {
			remove(wordlibData);
		}
	}

	/**
	 * Returns the number of wordlib datas.
	 *
	 * @return the number of wordlib datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WORDLIBDATA);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the wordlib data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.docs.wordlibapp.model.WordlibData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WordlibData>> listenersList = new ArrayList<ModelListener<WordlibData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WordlibData>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(WordlibDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_WORDLIBDATA = "SELECT wordlibData FROM WordlibData wordlibData";
	private static final String _SQL_SELECT_WORDLIBDATA_WHERE = "SELECT wordlibData FROM WordlibData wordlibData WHERE ";
	private static final String _SQL_COUNT_WORDLIBDATA = "SELECT COUNT(wordlibData) FROM WordlibData wordlibData";
	private static final String _SQL_COUNT_WORDLIBDATA_WHERE = "SELECT COUNT(wordlibData) FROM WordlibData wordlibData WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wordlibData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WordlibData exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No WordlibData exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WordlibDataPersistenceImpl.class);
	private static WordlibData _nullWordlibData = new WordlibDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WordlibData> toCacheModel() {
				return _nullWordlibDataCacheModel;
			}
		};

	private static CacheModel<WordlibData> _nullWordlibDataCacheModel = new CacheModel<WordlibData>() {
			@Override
			public WordlibData toEntityModel() {
				return _nullWordlibData;
			}
		};
}