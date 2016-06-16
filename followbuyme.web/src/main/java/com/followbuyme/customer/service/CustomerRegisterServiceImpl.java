/**
 * 
 */
package com.followbuyme.customer.service;

import org.springframework.stereotype.Service;

import com.followbuyme.base.exception.TechnicalException;
import com.followbuyme.base.exception.ValidationException;
import com.followbuyme.customer.model.BusinessCustomer;
import com.followbuyme.customer.model.Customer;

/**
 * @author Yachin
 *
 */
@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService{

	
	@Override
	public void createCustomer(Customer input) throws TechnicalException, ValidationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomer(BusinessCustomer input)
			throws TechnicalException, ValidationException {
		// TODO Auto-generated method stub
		
	}

}
