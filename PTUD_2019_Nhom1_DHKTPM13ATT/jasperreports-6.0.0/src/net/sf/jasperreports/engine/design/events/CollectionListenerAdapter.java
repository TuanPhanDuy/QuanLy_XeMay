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
package net.sf.jasperreports.engine.design.events;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


/**
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id: CollectionListenerAdapter.java 7197 2014-08-27 11:59:50Z teodord $
 */
public class CollectionListenerAdapter implements PropertyChangeListener
{

	private final CollectionChangeListener listener;
	
	public CollectionListenerAdapter(CollectionChangeListener listener)
	{
		this.listener = listener;
	}

	public void propertyChange(PropertyChangeEvent evt)
	{
		if (evt instanceof CollectionElementAddedEvent)
		{
			listener.collectionElementAdded((CollectionElementAddedEvent) evt);
		}
		else if (evt instanceof CollectionElementRemovedEvent)
		{
			listener.collectionElementRemoved((CollectionElementRemovedEvent) evt);
		}
	}
	
	public CollectionChangeListener getListener()
	{
		return listener;
	}

}
