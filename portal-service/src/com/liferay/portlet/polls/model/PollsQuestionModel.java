/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.polls.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the PollsQuestion service. Represents a row in the &quot;PollsQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.polls.model.impl.PollsQuestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.polls.model.impl.PollsQuestionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestion
 * @see com.liferay.portlet.polls.model.impl.PollsQuestionImpl
 * @see com.liferay.portlet.polls.model.impl.PollsQuestionModelImpl
 * @generated
 */
public interface PollsQuestionModel extends BaseModel<PollsQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a polls question model instance should use the {@link PollsQuestion} interface instead.
	 */

	/**
	 * Gets the primary key of this polls question.
	 *
	 * @return the primary key of this polls question
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this polls question
	 *
	 * @param pk the primary key of this polls question
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this polls question.
	 *
	 * @return the uuid of this polls question
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this polls question.
	 *
	 * @param uuid the uuid of this polls question
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the question ID of this polls question.
	 *
	 * @return the question ID of this polls question
	 */
	public long getQuestionId();

	/**
	 * Sets the question ID of this polls question.
	 *
	 * @param questionId the question ID of this polls question
	 */
	public void setQuestionId(long questionId);

	/**
	 * Gets the group ID of this polls question.
	 *
	 * @return the group ID of this polls question
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this polls question.
	 *
	 * @param groupId the group ID of this polls question
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this polls question.
	 *
	 * @return the company ID of this polls question
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this polls question.
	 *
	 * @param companyId the company ID of this polls question
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this polls question.
	 *
	 * @return the user ID of this polls question
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this polls question.
	 *
	 * @param userId the user ID of this polls question
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this polls question.
	 *
	 * @return the user uuid of this polls question
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this polls question.
	 *
	 * @param userUuid the user uuid of this polls question
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this polls question.
	 *
	 * @return the user name of this polls question
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this polls question.
	 *
	 * @param userName the user name of this polls question
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this polls question.
	 *
	 * @return the create date of this polls question
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this polls question.
	 *
	 * @param createDate the create date of this polls question
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this polls question.
	 *
	 * @return the modified date of this polls question
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this polls question.
	 *
	 * @param modifiedDate the modified date of this polls question
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the title of this polls question.
	 *
	 * @return the title of this polls question
	 */
	public String getTitle();

	/**
	 * Gets the localized title of this polls question. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized title for
	 * @return the localized title of this polls question
	 */
	public String getTitle(Locale locale);

	/**
	 * Gets the localized title of this polls question, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this polls question. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Gets the localized title of this polls question. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @return the localized title of this polls question
	 */
	public String getTitle(String languageId);

	/**
	 * Gets the localized title of this polls question, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this polls question
	 */
	public String getTitle(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized title of this polls question.
	 *
	 * @return the locales and localized title
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this polls question.
	 *
	 * @param title the title of this polls question
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this polls question.
	 *
	 * @param title the localized title of this polls question
	 * @param locale the locale to set the localized title for
	 */
	public void setTitle(String title, Locale locale);

	public void setTitle(String title, Locale locale, Locale defaultLocale);

	/**
	 * Sets the localized titles of this polls question from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this polls question
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Gets the description of this polls question.
	 *
	 * @return the description of this polls question
	 */
	public String getDescription();

	/**
	 * Gets the localized description of this polls question. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized description for
	 * @return the localized description of this polls question
	 */
	public String getDescription(Locale locale);

	/**
	 * Gets the localized description of this polls question, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this polls question. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Gets the localized description of this polls question. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @return the localized description of this polls question
	 */
	public String getDescription(String languageId);

	/**
	 * Gets the localized description of this polls question, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this polls question
	 */
	public String getDescription(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized description of this polls question.
	 *
	 * @return the locales and localized description
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this polls question.
	 *
	 * @param description the description of this polls question
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this polls question.
	 *
	 * @param description the localized description of this polls question
	 * @param locale the locale to set the localized description for
	 */
	public void setDescription(String description, Locale locale);

	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	/**
	 * Sets the localized descriptions of this polls question from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this polls question
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Gets the expiration date of this polls question.
	 *
	 * @return the expiration date of this polls question
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this polls question.
	 *
	 * @param expirationDate the expiration date of this polls question
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Gets the last vote date of this polls question.
	 *
	 * @return the last vote date of this polls question
	 */
	public Date getLastVoteDate();

	/**
	 * Sets the last vote date of this polls question.
	 *
	 * @param lastVoteDate the last vote date of this polls question
	 */
	public void setLastVoteDate(Date lastVoteDate);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(PollsQuestion pollsQuestion);

	public int hashCode();

	public PollsQuestion toEscapedModel();

	public String toString();

	public String toXmlString();
}