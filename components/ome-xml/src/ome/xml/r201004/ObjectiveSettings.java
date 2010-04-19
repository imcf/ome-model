/*
 * ome.xml.r201004.ObjectiveSettings
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) 2010 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by callan via xsd-fu on 2010-04-19 19:23:58+0100
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.r201004;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ome.xml.r201004.enums.*;

public class ObjectiveSettings extends Settings
{
	// -- Instance variables --

	// Property
	private Double refractiveIndex;

	// Property
	private Double correctionCollar;

	// Property
	private String id;

	// Property
	private Medium medium;

	// -- Constructors --

	/** Constructs a ObjectiveSettings. */
	public ObjectiveSettings()
	{
	}

	// -- ObjectiveSettings API methods --

	// Property
	public Double getRefractiveIndex()
	{
		return refractiveIndex;
	}

	public void setRefractiveIndex(Double refractiveIndex)
	{
		this.refractiveIndex = refractiveIndex;
	}

	// Property
	public Double getCorrectionCollar()
	{
		return correctionCollar;
	}

	public void setCorrectionCollar(Double correctionCollar)
	{
		this.correctionCollar = correctionCollar;
	}

	// Property
	public String getID()
	{
		return id;
	}

	public void setID(String id)
	{
		this.id = id;
	}

	// Property
	public Medium getMedium()
	{
		return medium;
	}

	public void setMedium(Medium medium)
	{
		this.medium = medium;
	}

	public Element asXMLElement(Document document)
	{
		// Creating XML block for ObjectiveSettings
		Element ObjectiveSettings_element = document.createElement("ObjectiveSettings");
		if (refractiveIndex != null)
		{
			// Attribute property RefractiveIndex
			ObjectiveSettings_element.setAttribute("RefractiveIndex", refractiveIndex.toString());
		}
		if (correctionCollar != null)
		{
			// Attribute property CorrectionCollar
			ObjectiveSettings_element.setAttribute("CorrectionCollar", correctionCollar.toString());
		}
		if (id != null)
		{
			// Attribute property ID
			ObjectiveSettings_element.setAttribute("ID", id.toString());
		}
		if (medium != null)
		{
			// Attribute property Medium
			ObjectiveSettings_element.setAttribute("Medium", medium.toString());
		}
		return ObjectiveSettings_element;
	}
}
