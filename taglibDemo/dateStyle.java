package com.marlabs.taglibDemo;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class dateStyle extends SimpleTagSupport {
	private JspContext jspContext;
	private String style;

	@Override
	public void doTag() throws JspException, IOException {
		// super.doTag();
		JspWriter outWriter = jspContext.getOut();

	}

	/**
	 * @param jspContext
	 *            the jspContext to set
	 */
	@Override
	public void setJspContext(JspContext jspContext) {
		this.jspContext = jspContext;
	}

	/**
	 * @param style
	 *            the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

}
