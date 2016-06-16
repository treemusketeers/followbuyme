/**
 * 
 */
package com.followbuyme.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.followbuyme.base.exception.TechnicalException;
import com.followbuyme.base.exception.ValidationException;
import com.followbuyme.customer.model.BusinessCustomer;
import com.followbuyme.customer.model.Customer;
import com.followbuyme.customer.service.CustomerRegisterService;

/**
 * @author Yachin
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerRegisterController {
	
	@Autowired
	CustomerRegisterService customerRegisterService;
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	@ResponseBody
	public void createPublisher(@RequestBody Customer input) throws TechnicalException, ValidationException{
		try {
			customerRegisterService.createCustomer(input);
			
		}catch (RuntimeException e) {
			throw new TechnicalException();
		}catch (Exception e) {
			throw new ValidationException();
		}
	}
	
	@RequestMapping(value="/businessregister", method = RequestMethod.POST)
	@ResponseBody
	public void createPublisher(@RequestBody BusinessCustomer input) throws TechnicalException, ValidationException{
		try {
			customerRegisterService.createCustomer(input);
			
		}catch (RuntimeException e) {
			throw new TechnicalException();
		}catch (Exception e) {
			throw new ValidationException();
		}
	}

}
