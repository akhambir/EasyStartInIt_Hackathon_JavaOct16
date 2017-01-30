package com.easystartinit.java_oct_16.dao;

import com.easystartinit.java_oct_16.dao.interfaces.ProductDao;
import com.easystartinit.java_oct_16.model.Product;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {

    public List<Product> getProductsByCategory(String category){
        String hql = "from Product where category.name = :category";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("category", category);
        return query.list();
    }

    public List<Product> getUserProducts(String userName){
        String hql = "select User.productList from User where username = :username";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString("username", userName);
        return query.list();
    }

}
