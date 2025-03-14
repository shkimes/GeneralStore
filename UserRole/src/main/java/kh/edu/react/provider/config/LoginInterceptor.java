package kh.edu.react.provider.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kh.edu.react.provider.dto.User;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public  boolean preHandle(HttpServletRequest request,
                              HttpServletResponse response,
                              Object handler) throws Exception {

        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("/");
            return false;
        }

        return true;

    }

}