package org.obie.obieframework.controller;

import org.obie.obieframework.annotation.Action;
import org.obie.obieframework.annotation.Controller;
import org.obie.obieframework.annotation.Inject;
import org.obie.obieframework.bean.Param;
import org.obie.obieframework.bean.View;
import org.obie.obieframework.model.Customer;
import org.obie.obieframework.service.CustomerService;

import java.util.List;

/**
 * Created by User on 3/2/2016.
 */
@Controller
public class CustomerController {
    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }
}
