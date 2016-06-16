/**
 * 
 */
package com.followbuyme.event.service;

import org.springframework.stereotype.Service;

import com.followbuyme.base.exception.TechnicalException;
import com.followbuyme.base.exception.ValidationException;
import com.followbuyme.event.model.PubEvent;
import com.followbuyme.event.model.SubResponseEvent;
import com.followbuyme.location.Location;

/**
 * @author Yachin
 *
 */
@Service
public class EventServiceImpl implements EventService {

	/* (non-Javadoc)
	 * @see com.followbuyme.event.controller.EventService#publishEvent(com.followbuyme.event.model.PubEvent)
	 */
	@Override
	public void publishEvent(PubEvent event) throws TechnicalException, ValidationException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.followbuyme.event.controller.EventService#ping(com.followbuyme.location.Location)
	 */
	@Override
	public SubResponseEvent ping(Location location) throws TechnicalException,
			ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.followbuyme.event.controller.EventService#responseSubEvent(com.followbuyme.event.model.SubResponseEvent)
	 */
	@Override
	public void responseSubEvent(SubResponseEvent event)
			throws TechnicalException, ValidationException {
		// TODO Auto-generated method stub

	}

}
