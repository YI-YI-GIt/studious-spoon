package sample.common.logic;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception{
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("login") == null) {
			response.sendRedirect("/login");
			return false;
		}
		return true;
	}
}
