/**
 * 
 */
package com.followbuyme.customer.service;

import com.followbuyme.base.exception.TechnicalException;
import com.followbuyme.base.exception.ValidationException;
import com.followbuyme.customer.model.BusinessCustomer;
import com.followbuyme.customer.model.Customer;

/**
 * @author Yachin
 *
 */
public interface CustomerRegisterService {

	public void createCustomer(Customer input) throws TechnicalException, ValidationException;
	public void createCustomer(BusinessCustomer input) throws TechnicalException, ValidationException;
}
