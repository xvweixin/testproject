package com.xwx.service;

import java.util.List;

import org.hibernate.Session;

import com.xwx.entity.User;

public interface UserService {
	public void save(User user);
	public void update(User user);
	public void findById(String id);
	public void deleteById(User user);
	public List<String> findAllName();
}
