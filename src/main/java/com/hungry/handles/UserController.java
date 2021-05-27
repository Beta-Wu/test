package com.hungry.handles;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hungry.beans.User;
import com.hungry.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService UserService;
	
	//登录
	@RequestMapping("/login.do")
	public String login(User user,Model model,HttpSession session,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
  	    PrintWriter out=response.getWriter();
		User u=UserService.findUser(user);
		if(u==null) { 
			out.print("<script>alert('用户名或密码错误!')</script>");
			out.flush();
			return "../../login";
			
		}else {
			//将用户信息存放在session中，并跳转到首页
			session.setAttribute("session_username",u);
			return "welcome";
		}
	}
	
	
	//注册  添加用户 插入数据
	@RequestMapping("/register.do")
	public String register(User user,Model model,HttpServletResponse response) throws IOException{		
		    response.setContentType("text/html;charset=utf-8");
  	        PrintWriter out=response.getWriter();
			int addUser=UserService.addUser(user);
			if(addUser!=0){	      
				out.print("<script>alert('注册成功!')</script>");
				out.flush();
	        	return "../../login";
	        }
	        else {	        
	        	out.print("<script>alert('注册失败!')</script>");
				out.flush();
//				model.addAttribute("result", "注册失败"); 
				return "../../register";	        
			}
	}
	
	
	//注册 异步检验手机号是否存在
	@ResponseBody
	@RequestMapping(value="/validPhone.do",method=RequestMethod.POST)
	public String validPhone(String phone) {		
		String tip=UserService.findByPhone(phone);
		return tip;
	}
	
	
	//跳转到注册页面
//	@RequestMapping("/showRegister")
//	public String showRegister() {
//		return "../../register";
//	}
	
	
	//登录 
//	@RequestMapping("/login")
//	public ModelAndView login(User user){
//		  Boolean flag = UserService.findUser(user.getUsername(), user.getPassword());
//	        ModelAndView modelAndView = new ModelAndView();
//	        if (flag){
//	            modelAndView.setViewName("welcome");
//	        }else {
//	            modelAndView.setViewName("redirect:/index.jsp");
//	        }
//	        return modelAndView;
//	}

//	//跳转到登录页面
//	@RequestMapping("/showLogin")
//	public String showLogin() {
//		return "../../login";
//	}
	

	//注册 添加用户
//	@RequestMapping("/register")
//	public ModelAndView register(String username,String password,String phone){		
//		  Boolean flag = UserService.existUser(phone);	  
//	      ModelAndView modelAndView = new ModelAndView();
//	        if (!flag){	          
//	           int addUser=UserService.addUser(username, password, phone);
//	           if(addUser!=0){	        	   
//	        	modelAndView.setViewName("welcome");
//	        	}
//	           else modelAndView.setViewName("redirect:/register.jsp");
//	        }else {
//	            modelAndView.setViewName("exist");
//	        }
//	        return modelAndView;
//	}
	

	//查询所有用户
//	@RequestMapping("/list.do")
//	public String list(Model model) {
//		
//		ArrayList<User> userList = UserService.findAllUser();
//		
//		for (User user : userList) {
//			System.out.println("user = " + user);
//		}
//		
//		model.addAttribute("userList", userList);
//		
//		return "list";
//	}
	
}
