/**
 * 
 */
package com.followbuyme.event.service;

import com.followbuyme.base.exception.TechnicalException;
import com.followbuyme.base.exception.ValidationException;
import com.followbuyme.event.model.PubEvent;
import com.followbuyme.event.model.SubResponseEvent;
import com.followbuyme.location.Location;

/**
 * @author Yachin
 *
 */
public interface EventService {
	public void publishEvent(PubEvent event) throws TechnicalException, ValidationException;
	public SubResponseEvent ping(Location location) throws TechnicalException, ValidationException;
	public void responseSubEvent(SubResponseEvent event)  throws TechnicalException, ValidationException;
}
