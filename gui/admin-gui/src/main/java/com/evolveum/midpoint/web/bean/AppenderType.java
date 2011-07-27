/*
 * Copyright (c) 2011 Evolveum
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://www.opensource.org/licenses/cddl1 or
 * CDDLv1.0.txt file in the source code distribution.
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 *
 * Portions Copyrighted 2011 [name of copyright owner]
 */
package com.evolveum.midpoint.web.bean;

/**
 * 
 * @author lazyman
 * 
 */
public enum AppenderType {

	CONSOLE("monitor.png", "web.bean.appenderType.console"),

	ROLLING_FILE("page_white_edit.png", "web.bean.appenderType.rollingFile"),

	DAILY_ROLLING_FILE("page_white_stack.png", "web.bean.appenderType.dailyRollingFile"),

	NDC_ROLLING_FILE("page_white_star.png", "web.bean.appenderType.ndcRollingFile"),

	NDC_DAILY_ROLLING_FILE("page_white_copy.png", "web.bean.appenderType.ndcDailyRollingFile");

	private String icon;
	private String title;

	private AppenderType(String icon, String title) {
		this.icon = icon;
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public String getTitle() {
		return title;
	}
}
