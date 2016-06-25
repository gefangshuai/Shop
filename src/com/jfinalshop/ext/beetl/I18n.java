package com.jfinalshop.ext.beetl;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.session.mgt.WebSessionKey;
import org.beetl.core.Context;
import org.beetl.core.Function;

import com.jfinal.ext.kit.ServletKit;
import com.jfinal.ext.kit.SessionIdKit;
import com.jfinal.ext.plugin.config.ConfigKit;
import com.jfinal.kit.HttpKit;
import com.jfinal.plugin.auth.SessionKit;
import com.jfinalshop.interceptor.NavigationInterceptor;
import com.jfinalshop.service.HtmlService;




public class I18n implements Function {
	
	public Object call(Object[] obj, Context context) {
		HttpServletRequest req = NavigationInterceptor.request;
		try {
			return com.jfinal.i18n.I18n.use(req.getLocale().toString()).get((String) obj[0]);
		} catch (NullPointerException e) {
			return com.jfinal.i18n.I18n.use(req.getLocale().toString()).get((String) obj[0]);
		}
	}

}
