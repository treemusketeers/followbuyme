package com.followbuyme.contact.service;

import com.threemusketeers.followbuyme.contact.model.ContactDetails;


public interface ContactService {
  public ContactDetails getContactDetail(Long id) throws Exception;
  public void createContactDetail(ContactDetails input) throws Exception;
  public ContactDetails updateContactDetail(ContactDetails input) throws Exception;
  public void deleteContactDetail(Long id, Class<?> clazz) throws Exception;
}
