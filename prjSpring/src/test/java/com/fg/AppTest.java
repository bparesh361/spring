package com.fg;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AppTest 
{
	@Autowired 
	private SpringMsgPropogation msgPropogation;
	
	@org.junit.Test
	public void testMessage(){
		assertNotNull("msgPropogation is null", msgPropogation);
		assertNotNull("msgPropogation is null", msgPropogation.getMessagePropogation());
		assertEquals("Message is Not as per expected." , "Learnign IOC is fun !!! ", msgPropogation.getMessagePropogation().getSetterMsg());
	}
	
}
