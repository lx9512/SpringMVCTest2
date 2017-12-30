package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by aa123 on 2017/12/18.
 */
public class helloController implements Controller {
    private static final Log logger = LogFactory.getLog(helloController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handlerRequest 被调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello,world!");
        mv.setViewName("/WEB-INF/welcome.jsp");
        return mv;
    }
}
