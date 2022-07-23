package com.goalpioneers.modules.formatter.flatfiles.templates.elements;


import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class FlatFilesRow 
{
	/**
	 * 
	 */
	public FlatFilesRow()
	{
		this.setColumns( new ArrayList<>() );
	}
	
	
	// Variables
	/**
	 * 
	 */
	private List<FlatFilesColumn> columns = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public final List<FlatFilesColumn> getColumns() 
	{
		return this.columns;
	}
	
	/**
	 * 
	 * @param columns
	 */
	public final void setColumns( List<FlatFilesColumn> columns )
	{
		this.columns = columns;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
