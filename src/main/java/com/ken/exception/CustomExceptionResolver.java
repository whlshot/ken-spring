package com.ken.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class CustomExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object obj, Exception ex) {
        String message = "";
        if (ex instanceof CustomException) {
            message = ex.getMessage();
        } else {
            message = "错误信息不详";
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMessage", message);
        modelAndView.setViewName("/error");
        return modelAndView;
    }

}
