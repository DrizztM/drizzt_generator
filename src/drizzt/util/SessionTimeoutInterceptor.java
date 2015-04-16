package drizzt.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionTimeoutInterceptor extends HandlerInterceptorAdapter {

	private List<String> allowUrls;

	public List<String> getAllowUrls() {
		return allowUrls;
	}

	public void setAllowUrls(List<String> allowUrls) {
		this.allowUrls = allowUrls;
	}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		String requestUrl = request.getRequestURI();
		for (String url : allowUrls) {
			if (requestUrl.endsWith(url)) {
				return true;
			}
		}
		if (request.getSession().getAttribute("loginUser") == null) {
			return false;
		} else {
			return true;
		}
	}
}
