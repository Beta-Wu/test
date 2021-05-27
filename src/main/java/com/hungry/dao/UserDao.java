package com.hungry.dao;

import java.util.ArrayList;

import com.hungry.beans.User;

public interface UserDao {
	
	
	// 查询所有用户方法
//    public ArrayList<User> findAllUser();

    //登录 查询登录信息是否正确
	public User findUser(User user);
	
	//注册 判断手机号是否存在
	public User findUserByPhone(User user);
	
	//注册 判断手机号是否存在(AJAX)
	public User findByPhone(String phone);
	
	//注册 添加用户
	public int addUser(User user);


	
	
}
