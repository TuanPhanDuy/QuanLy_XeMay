/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.data.json;

import java.util.Locale;
import java.util.TimeZone;

import net.sf.jasperreports.data.DataAdapter;

/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: JsonDataAdapter.java 7197 2014-08-27 11:59:50Z teodord $
 */
public interface JsonDataAdapter extends DataAdapter {

	public String getSelectExpression();

	public void setSelectExpression(String selectExpression);

	public String getFileName();

	public void setFileName(String fileName);

	public Locale getLocale();

	public void setLocale(Locale locale);

	public TimeZone getTimeZone();

	public void setTimeZone(TimeZone timeZone);

	public boolean isUseConnection();
	
	public void setUseConnection(boolean useConnection);

	public String getDatePattern();

	public void setDatePattern(String datePattern);

	public String getNumberPattern();

	public void setNumberPattern(String numberPattern);
}
