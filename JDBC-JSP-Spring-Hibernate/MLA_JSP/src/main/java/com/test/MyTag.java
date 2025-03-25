package com.test;

import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport
{
	@Override
	public int doStartTag()
	{
		JspWriter out = null;
		try
		{
			out = pageContext.getOut();
			
			Date date = new Date();
			
			out.println("Curent System Date : "+date);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
}
