package com.coderyu.springboottest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class HomeController {
    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = GET)
    public String loginGet(Model model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = POST)
    public String loginPost(String userEmail, String userPwd, Model model, HttpServletRequest request) {
        if ("abc@gmail.com".equals(userEmail) && "123456".equals(userPwd)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", "abc@gmail.com");
            return "redirect:/";
        }
        model.addAttribute("loginFailedMsg", "用户名或密码错误。");
        return "login";
    }

    @RequestMapping(value = "/logout", method = GET)
    public String logOut(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/login";
    }
}
