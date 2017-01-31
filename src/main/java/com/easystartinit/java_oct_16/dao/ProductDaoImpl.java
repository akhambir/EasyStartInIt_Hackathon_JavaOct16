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

    public List<Product> getProductsByCategory(Long id){
        String hql = "from Product where category.id = :id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return query.list();
    }

    public List<Product> getUserProducts(String userName){
        String hql = "from Order as order join order.productList where order.user.username = :username";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString("username", userName);
        return query.list();
    }

}
