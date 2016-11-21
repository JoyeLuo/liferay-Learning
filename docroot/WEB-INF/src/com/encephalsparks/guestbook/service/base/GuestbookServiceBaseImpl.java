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

package com.encephalsparks.guestbook.service.base;

import com.encephalsparks.guestbook.model.Guestbook;
import com.encephalsparks.guestbook.service.GuestbookService;
import com.encephalsparks.guestbook.service.persistence.EntryPersistence;
import com.encephalsparks.guestbook.service.persistence.GuestbookPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the guestbook remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.encephalsparks.guestbook.service.impl.GuestbookServiceImpl}.
 * </p>
 *
 * @author vishal.rangras
 * @see com.encephalsparks.guestbook.service.impl.GuestbookServiceImpl
 * @see com.encephalsparks.guestbook.service.GuestbookServiceUtil
 * @generated
 */
public abstract class GuestbookServiceBaseImpl extends BaseServiceImpl
	implements GuestbookService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.encephalsparks.guestbook.service.GuestbookServiceUtil} to access the guestbook remote service.
	 */

	/**
	 * Returns the entry local service.
	 *
	 * @return the entry local service
	 */
	public com.encephalsparks.guestbook.service.EntryLocalService getEntryLocalService() {
		return entryLocalService;
	}

	/**
	 * Sets the entry local service.
	 *
	 * @param entryLocalService the entry local service
	 */
	public void setEntryLocalService(
		com.encephalsparks.guestbook.service.EntryLocalService entryLocalService) {
		this.entryLocalService = entryLocalService;
	}

	/**
	 * Returns the entry remote service.
	 *
	 * @return the entry remote service
	 */
	public com.encephalsparks.guestbook.service.EntryService getEntryService() {
		return entryService;
	}

	/**
	 * Sets the entry remote service.
	 *
	 * @param entryService the entry remote service
	 */
	public void setEntryService(
		com.encephalsparks.guestbook.service.EntryService entryService) {
		this.entryService = entryService;
	}

	/**
	 * Returns the entry persistence.
	 *
	 * @return the entry persistence
	 */
	public EntryPersistence getEntryPersistence() {
		return entryPersistence;
	}

	/**
	 * Sets the entry persistence.
	 *
	 * @param entryPersistence the entry persistence
	 */
	public void setEntryPersistence(EntryPersistence entryPersistence) {
		this.entryPersistence = entryPersistence;
	}

	/**
	 * Returns the guestbook local service.
	 *
	 * @return the guestbook local service
	 */
	public com.encephalsparks.guestbook.service.GuestbookLocalService getGuestbookLocalService() {
		return guestbookLocalService;
	}

	/**
	 * Sets the guestbook local service.
	 *
	 * @param guestbookLocalService the guestbook local service
	 */
	public void setGuestbookLocalService(
		com.encephalsparks.guestbook.service.GuestbookLocalService guestbookLocalService) {
		this.guestbookLocalService = guestbookLocalService;
	}

	/**
	 * Returns the guestbook remote service.
	 *
	 * @return the guestbook remote service
	 */
	public com.encephalsparks.guestbook.service.GuestbookService getGuestbookService() {
		return guestbookService;
	}

	/**
	 * Sets the guestbook remote service.
	 *
	 * @param guestbookService the guestbook remote service
	 */
	public void setGuestbookService(
		com.encephalsparks.guestbook.service.GuestbookService guestbookService) {
		this.guestbookService = guestbookService;
	}

	/**
	 * Returns the guestbook persistence.
	 *
	 * @return the guestbook persistence
	 */
	public GuestbookPersistence getGuestbookPersistence() {
		return guestbookPersistence;
	}

	/**
	 * Sets the guestbook persistence.
	 *
	 * @param guestbookPersistence the guestbook persistence
	 */
	public void setGuestbookPersistence(
		GuestbookPersistence guestbookPersistence) {
		this.guestbookPersistence = guestbookPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Guestbook.class;
	}

	protected String getModelClassName() {
		return Guestbook.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = guestbookPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.encephalsparks.guestbook.service.EntryLocalService.class)
	protected com.encephalsparks.guestbook.service.EntryLocalService entryLocalService;
	@BeanReference(type = com.encephalsparks.guestbook.service.EntryService.class)
	protected com.encephalsparks.guestbook.service.EntryService entryService;
	@BeanReference(type = EntryPersistence.class)
	protected EntryPersistence entryPersistence;
	@BeanReference(type = com.encephalsparks.guestbook.service.GuestbookLocalService.class)
	protected com.encephalsparks.guestbook.service.GuestbookLocalService guestbookLocalService;
	@BeanReference(type = com.encephalsparks.guestbook.service.GuestbookService.class)
	protected com.encephalsparks.guestbook.service.GuestbookService guestbookService;
	@BeanReference(type = GuestbookPersistence.class)
	protected GuestbookPersistence guestbookPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private GuestbookServiceClpInvoker _clpInvoker = new GuestbookServiceClpInvoker();
}