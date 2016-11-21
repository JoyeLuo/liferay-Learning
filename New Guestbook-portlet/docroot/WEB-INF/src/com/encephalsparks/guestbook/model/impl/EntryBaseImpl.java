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

package com.encephalsparks.guestbook.model.impl;

import com.encephalsparks.guestbook.model.Entry;
import com.encephalsparks.guestbook.service.EntryLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Entry service. Represents a row in the &quot;GB_Entry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntryImpl}.
 * </p>
 *
 * @author vishal.rangras
 * @see EntryImpl
 * @see com.encephalsparks.guestbook.model.Entry
 * @generated
 */
public abstract class EntryBaseImpl extends EntryModelImpl implements Entry {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a entry model instance should use the {@link Entry} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EntryLocalServiceUtil.addEntry(this);
		}
		else {
			EntryLocalServiceUtil.updateEntry(this);
		}
	}
}