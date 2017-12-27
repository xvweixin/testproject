package com.xwx.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.xwx.dao.UserDao;
import com.xwx.entity.User;
import com.xwx.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public void findById(String id) {
		// TODO Auto-generated method stub
		userDao.findById(id);
	}

	@Override
	public void deleteById(User user) {
		// TODO Auto-generated method stub
		userDao.deleteById(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<String> findAllName() {
		return userDao.findAllName();
	}

	
}
