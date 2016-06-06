package com.followbuyme.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threemusketeers.followbuyme.contact.bo.AddressBO;
import com.threemusketeers.followbuyme.contact.model.Address;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressBO addressBO;
	
	@Override
	public Address getAddress(Long id) throws Exception {
		return addressBO.retrieveById(id);
	}
	@Override
	public void createAddress(Address input) throws Exception{
		addressBO.create(input);
	}
	
	@Override
	public Address updateAddress(Address input) throws Exception{
		return addressBO.update(input);
	}
	
	@Override
	public void deleteAddress(Long id,Class<?> clazz) throws Exception{
		addressBO.delete(id,clazz);
	}
	
	
}
