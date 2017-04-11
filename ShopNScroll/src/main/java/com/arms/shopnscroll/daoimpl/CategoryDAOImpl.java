package com.arms.shopnscroll.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arms.shopnscroll.dao.CategoryDAO;
import com.arms.shopnscroll.model.Category;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Category> fetchAllCategory() {
		List<Category> catList = sessionFactory.getCurrentSession().createQuery("from Category").getResultList();
		return catList;
	}
	
	public String fetchAllCategoryJSON() {
		List<Category> catList = sessionFactory.getCurrentSession().createQuery("from Category").getResultList();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(catList);
	}

	public Category fetchOneCategory(int categoryId) {
		List<Category> catList = sessionFactory.getCurrentSession().createQuery("from Category where categoryId = "+categoryId).getResultList();
		return catList.get(0);
	}
	
	public void addCategory(Category category) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	public void removeCategory(int categoryId) 
	{
		sessionFactory.getCurrentSession().delete(fetchOneCategory(categoryId));
	}

}
