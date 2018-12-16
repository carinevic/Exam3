package com.hcc.advweb;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Servlet Filter implementation class BjExcTag
 */
public class flowertag extends SimpleTagSupport  {
	
	private String productflower;

	public void setProductflower(String productflower) {
		this.productflower = productflower;
	}
	
	public void setProductDescpt(String productDescpt) {
		this.productDescpt = productDescpt;
	}
	private String productDescpt;
	
	

	

	StringWriter sw = new StringWriter();
	   public void doTag()  throws JspException, IOException {
		    JspWriter out =  getJspContext().getOut();
		   if(productflower != null) {
	    out.println(productflower);
	    out.println(productDescpt);
	   }
	   else {
		   getJspBody().invoke(sw);
	         getJspContext().getOut().println(sw.toString());
	   }
}
	   
	   }
