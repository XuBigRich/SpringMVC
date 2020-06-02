package dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.IBase;

public class BaseDao extends HibernateDaoSupport implements IBase {

	//HQL查询
	public List findByHQL(String hql){
		return getHibernateTemplate().find(hql);
	}
	//容器查询
	public List findByDetached(DetachedCriteria dc){
		return getHibernateTemplate().findByCriteria(dc);
	}
	
	public Object findById(Class clz,Serializable id){
		
		return getHibernateTemplate().get(clz , id);
	}
	public void save(Object obj){
		getHibernateTemplate().save(obj);
	}
	
	public void delete(Object obj){
		getHibernateTemplate().delete(obj);
	}
	public void update(Object obj){
		getHibernateTemplate().update(obj);
	}
	public void saveorupdate(Object obj){
		getHibernateTemplate().saveOrUpdate(obj);
	}
	//合并 
	public void merge(Object obj){
		getHibernateTemplate().merge(obj);
	}
}
