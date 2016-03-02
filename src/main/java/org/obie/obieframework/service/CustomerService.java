package org.obie.obieframework.service;

;
import org.obie.obieframework.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.obie.obieframework.helper.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 12/6/2015.
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<Customer>();
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id) {
        return null;
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
