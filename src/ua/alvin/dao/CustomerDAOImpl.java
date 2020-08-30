package ua.alvin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.alvin.entity.Customer;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    //need to inject session factory
    @Autowired
    private SessionFactory sessionFactory;

    public CustomerDAOImpl() {
    }

    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Customer> getCustomers() {

        //get current HB session
        Session currentSession = sessionFactory.getCurrentSession();

        //create a query
        Query<Customer> customerQuery =
                currentSession.createQuery("from Customer", Customer.class);

        //execute query and get result list
        List<Customer> customers = customerQuery.getResultList();

        //return the result
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

        Session session = sessionFactory.getCurrentSession();

        //save if there is no customer with such id, update otherwise
        session.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int theId) {

        Session session = sessionFactory.getCurrentSession();

        return session.get(Customer.class, theId);
    }

    @Override
    public void delete(Customer theCustomer) {
        Session session = sessionFactory.getCurrentSession();

        session.delete(theCustomer);

    }
}
