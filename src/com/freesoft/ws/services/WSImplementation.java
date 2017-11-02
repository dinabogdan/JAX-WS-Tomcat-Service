package com.freesoft.ws.services;

import javax.jws.WebService;

import com.freesoft.ws.interfaces.WSInterface;

@WebService(endpointInterface="com.freesoft.ws.interfaces.WSInterface")
public class WSImplementation implements WSInterface {

	@Override
	public String printMessage() {
		return "Hello from the SOAP Service!";
	}
}
