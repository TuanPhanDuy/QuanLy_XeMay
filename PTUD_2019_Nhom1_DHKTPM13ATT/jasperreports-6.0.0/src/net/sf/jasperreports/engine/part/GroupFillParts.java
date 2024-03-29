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
package net.sf.jasperreports.engine.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRGroup;
import net.sf.jasperreports.engine.fill.JRFillGroup;
import net.sf.jasperreports.engine.fill.JRFillObjectFactory;

/**
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id: GroupFillParts.java 7298 2014-10-06 13:44:33Z lucianc $
 */
public class GroupFillParts
{

	private JRFillGroup fillGroup;
	private FillParts headerParts;
	private FillParts footerParts;
	private List<DelayedPrintPart> groupEvaluatedParts;

	public GroupFillParts(JRGroup group, JRFillObjectFactory fillFactory)
	{
		// this should have already been created
		fillGroup = fillFactory.getGroup(group);
		
		headerParts = new FillParts(group.getGroupHeaderSection(), fillFactory);
		footerParts = new FillParts(group.getGroupFooterSection(), fillFactory);
		
		groupEvaluatedParts = new ArrayList<DelayedPrintPart>();
	}
	
	public boolean hasChanged()
	{
		return fillGroup.hasChanged();
	}

	public FillParts getHeaderParts()
	{
		return headerParts;
	}

	public FillParts getFooterParts()
	{
		return footerParts;
	}

	public void addGroupEvaluatedPart(DelayedPrintPart delayedPart)
	{
		groupEvaluatedParts.add(delayedPart);
	}

	public List<DelayedPrintPart> getGroupEvaluatedParts()
	{
		return groupEvaluatedParts;
	}
}
