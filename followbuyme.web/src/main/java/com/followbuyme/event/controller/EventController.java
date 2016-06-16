/**
 * 
 */
package com.followbuyme.event.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.followbuyme.base.exception.TechnicalException;
import com.followbuyme.base.exception.ValidationException;
import com.followbuyme.event.model.PubEvent;
import com.followbuyme.event.model.SubResponseEvent;
import com.followbuyme.location.Location;

/**
 * @author Yachin
 *
 */
@RestController
@RequestMapping("/event")

public class EventController {
	
	@RequestMapping("/publish")
	public void publishEvent(PubEvent event) throws TechnicalException, ValidationException {
		// TODO Auto-generated method stub

	}

	@RequestMapping("/ping")
	public SubResponseEvent ping(Location location) throws TechnicalException,
			ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/response")
	public void responseSubEvent(SubResponseEvent event)
			throws TechnicalException, ValidationException {
		// TODO Auto-generated method stub

	}
}
