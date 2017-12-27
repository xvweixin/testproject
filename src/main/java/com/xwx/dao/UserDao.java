package com.xwx.dao;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import com.xwx.entity.User;

public class UserDao extends HibernateDaoSupport{
	public void save(User user){
		this.getHibernateTemplate().save(user);
	}
	public void update(User user){
		this.getHibernateTemplate().update(user);
	}
	public void findById(String id){
		this.getHibernateTemplate().get(User.class, id);
	}
	public void deleteById(User user){
		this.getHibernateTemplate().delete(user);
	}
	
	public List<String> findAllName(){
		Session session = this.getSessionFactory().getCurrentSession();
		SQLQuery query = session.createSQLQuery("select name from user where id=? or id = ?");
		query.addScalar("name",StandardBasicTypes.STRING);   //����ֵ����  
        query.setInteger(0, Integer.parseInt("1")); //�������  
        query.setInteger(1, Integer.parseInt("3")); //�������  
        List results = query.list();  //��Ϊֻ�в�ѯһ���У����Է��ص�List��List<Object>
        return (List<String>)results; 
	}
}
