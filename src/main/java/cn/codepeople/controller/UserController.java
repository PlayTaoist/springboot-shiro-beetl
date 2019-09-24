/**   
 * @author lr
 * @date 2019年2月27日 上午10:34:04 
 * @version V1.0.0   
 */
package cn.codepeople.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.codepeople.entity.User;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.system.SystemUtil;
import cn.shuibo.annotation.Decrypt;
import cn.shuibo.annotation.Encrypt;

@Controller
public class UserController {
	
	@Value("${cas.server.url}")
    private String casServerUrl; 
	
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
    
    @Encrypt
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
    
    @Decrypt
    @PostMapping("/login")
    @ResponseBody
    public User getLoginInfo(@RequestBody User user) {
    	System.out.println("======>");
    	System.out.println(user.toString());
    	return user;
    }
    
    public static void main(String[] args) {
    	System.out.println("DateUtil.date()==>"+DateUtil.date());
    	System.out.println("1==>"+DateUtil.offsetDay(DateUtil.date(), -1));
    	System.out.println("2==>"+DateUtil.offsetHour(DateUtil.date(), -1));
    	System.out.println("3==>"+DateUtil.offsetMinute(DateUtil.date(), -1));
    	System.out.println("4==>"+DateUtil.offsetMonth(DateUtil.date(), -1));
    	System.out.println("5==>"+DateUtil.offsetSecond(DateUtil.date(), -1));
    	//相差一个月，31天
    	long betweenDay = DateUtil.between(DateUtil.offsetSecond(DateUtil.date(), -1), DateUtil.date(), DateUnit.MS);
    	System.out.println("6==>"+betweenDay);
    	System.out.println("1====>>>>" + SystemUtil.getJvmSpecInfo());
    	System.out.println("2====>>>>" + SystemUtil.getJvmInfo());
    	System.out.println("3====>>>>" + SystemUtil.getJavaSpecInfo());
    	System.out.println("4====>>>>" + SystemUtil.getJavaInfo());
    	System.out.println("5====>>>>" + SystemUtil.getJavaRuntimeInfo());
    	System.out.println("6====>>>>" + SystemUtil.getOsInfo());
    	System.out.println("7====>>>>" + SystemUtil.getUserInfo());
    	System.out.println("8====>>>>" + SystemUtil.getHostInfo());
    	System.out.println("9====>>>>" + SystemUtil.getRuntimeInfo());
	}

}
