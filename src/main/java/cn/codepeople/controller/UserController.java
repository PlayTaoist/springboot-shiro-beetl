/**   
 * @author lr
 * @date 2019年2月27日 上午10:34:04 
 * @version V1.0.0   
 */
package cn.codepeople.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "博客网站!");
        return "index.html";
    }
    
    @GetMapping("add")
    public String addBeetl() {
        return "/user/add.html";
    }
    @GetMapping("update")
    public String updateBeetl() {
        return "/user/update.html";
    }
    @GetMapping("toLogin")
    public String loginBeetl() {
        return "/login.html";
    }
    //未授权提示页面
    @GetMapping("unAuth")
    public String unAuthBeetl() {
        return "/unAuth.html";
    }
    
    @PostMapping("/login")
    public String login(String name, String password, Model model) {
        /**
         *@author 使用Shiro编写认证操作
         */
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        
        //3.执行登录方法
        try {
            subject.login(token);
            LOGGER.info("====>登录成功<====");        
            return "redirect:/hello";
        } catch (UnknownAccountException e) {
            //登录失败：用户名不存在
            model.addAttribute("msg", "用户名不存在！");
            LOGGER.info("输入的用户名是：{}", name);
            return "/login.html";
        } catch (IncorrectCredentialsException e) {
            //登录失败：密码错误
            model.addAttribute("msg", "密码错误！");
            LOGGER.info("输入的密码是：{}", password);
            return "/login.html";
        }
    }
}
