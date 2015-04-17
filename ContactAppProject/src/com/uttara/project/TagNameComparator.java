package com.uttara.project;

import java.util.Comparator;

public class TagNameComparator implements Comparator<String> 
{
	public int compare(String o1,String o2) 
	{
		if(o1.length()-o2.length()==0)
		{
		return (o1.compareTo(o2));
		}
	else
		{
		return (o1.length()-o2.length());
		}
	}

}
