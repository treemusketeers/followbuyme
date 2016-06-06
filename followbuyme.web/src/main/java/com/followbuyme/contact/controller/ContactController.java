package com.followbuyme.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.followbuyme.contact.service.ContactService;
import com.threemusketeers.followbuyme.contact.model.ContactDetails;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/details")
	public ContactDetails getContactDetail(@RequestParam(value = "id",required = true,defaultValue = "1") Long id) throws Exception {
		ContactDetails p = contactService.getContactDetail(id);
		return p;
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	@ResponseBody
	public void createContactDetails(@RequestBody ContactDetails input) {
		try {
			contactService.createContactDetail(input);
			
		} catch (Exception e) {
			// e.printStackTrace();
			
		}

	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	public void updateContactDetails(@RequestBody ContactDetails input) {
		try {
			contactService.updateContactDetail(input);
			
		} catch (Exception e) {
			// e.printStackTrace();
			
		}

	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	@ResponseBody
	public void deleteContactDetails(@RequestParam(value = "id",required = true) Long id) {
		try {
			contactService.deleteContactDetail(id, ContactDetails.class);
			
		} catch (Exception e) {
			// e.printStackTrace();
			
		}

	}
	
	
}