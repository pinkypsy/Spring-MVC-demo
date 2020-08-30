package ua.alvin.dao;


import ua.alvin.entity.Customer;

import java.util.List;

public interface CustomerDAO {



    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);


    Customer getCustomer(int theId);

    void delete(Customer theCustomer);
}
