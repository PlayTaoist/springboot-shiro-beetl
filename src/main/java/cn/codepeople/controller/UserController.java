/**   
 * @author lr
 * @date 2019年2月27日 上午10:34:04 
 * @version V1.0.0   
 */
package cn.codepeople.controller;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.codepeople.entity.User;

@Controller
public class UserController {
	
    @GetMapping("/index")
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
    	//return "redirect:" + casServerUrl;
    }
    //未授权提示页面
    @GetMapping("unAuth")
    public String unAuthBeetl() {
        return "/unAuth.html";
    }
    
    @GetMapping("/getUser")
    @ResponseBody
    public User getUser() {
    	User user = new User();
    	user.setId(1);
    	user.setName("shuibo.cn");
    	user.setPassword("123456");
    	user.setPerms("update");
    	return user;
    }
    
    @PostMapping("/login")
    @ResponseBody
    public User getLoginInfo(@RequestBody User user) {
    	System.out.println("======>");
    	System.out.println(user.toString());
    	return user;
    }
    
    public static void main(String[] args) {
    	DateTime time = new DateTime();
    	DateTimeFormatter forPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
    	System.out.println(forPattern.print(time));
    	System.out.println(time.getYear());
    	System.out.println(time.getYearOfCentury());
    	System.out.println(time.getYearOfEra());
	}

}
