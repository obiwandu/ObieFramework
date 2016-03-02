package org.smart4j.chapter3.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.obie.obieframework.helper.DatabaseHelper;
import org.obie.obieframework.model.Customer;
import org.obie.obieframework.service.CustomerService;

import java.util.List;

/**
 * Created by User on 12/6/2015.
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() throws Exception {
        //TODO
        //init the test database
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest()
        throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest()
        throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void deleteCustomerListTest()
        throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertEquals(true, result);
    }
    // to be supplemented
}
