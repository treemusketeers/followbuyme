package com.followbuyme.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threemusketeers.followbuyme.contact.bo.ContactDetailsBO;
import com.threemusketeers.followbuyme.contact.model.ContactDetails;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDetailsBO contactDetailsBO;
	
	@Override
	public ContactDetails getContactDetail(Long id) throws Exception {
		return contactDetailsBO.retrieveById(id);
	}
	@Override
	public void createContactDetail(ContactDetails input) throws Exception{
		contactDetailsBO.create(input);
	}
	
	@Override
	public ContactDetails updateContactDetail(ContactDetails input) throws Exception{
		return contactDetailsBO.update(input);
	}
	
	@Override
	public void deleteContactDetail(Long id,Class<?> clazz) throws Exception{
		contactDetailsBO.delete(id,clazz);
	}
	
	
}
