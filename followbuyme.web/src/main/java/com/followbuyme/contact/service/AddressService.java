package com.followbuyme.contact.service;

import com.threemusketeers.followbuyme.contact.model.Address;


public interface AddressService {
  public Address getAddress(Long id) throws Exception;
  public void createAddress(Address input) throws Exception;
  public Address updateAddress(Address input) throws Exception;
  public void deleteAddress(Long id, Class<?> clazz) throws Exception;
}
