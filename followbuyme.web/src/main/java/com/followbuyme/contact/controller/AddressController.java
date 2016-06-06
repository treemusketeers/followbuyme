package com.followbuyme.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.followbuyme.contact.service.AddressService;
import com.threemusketeers.followbuyme.contact.model.Address;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/details")
	public Address getAddress(@RequestParam(value = "id",required = true,defaultValue = "1") Long id) throws Exception {
		Address p = addressService.getAddress(id);
		return p;
	}
	
	 @RequestMapping(value="/create", method = RequestMethod.POST)
	@ResponseBody
	public void createContactDetails(@RequestBody Address input) {
		try {
			addressService.createAddress(input);
			
		} catch (Exception e) {
			// e.printStackTrace();
			
		}

	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	public void updateAddress(@RequestBody Address input) {
		try {
			addressService.updateAddress(input);
			
		} catch (Exception e) {
			// e.printStackTrace();
			
		}

	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	@ResponseBody
	public void deleteAddress(@RequestParam(value = "id",required = true) Long id) {
		try {
			addressService.deleteAddress(id, Address.class);
			
		} catch (Exception e) {
			// e.printStackTrace();
			
		}

	}
	
	
}