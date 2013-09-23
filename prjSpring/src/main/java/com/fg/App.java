package com.fg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Spring Demo for IOC and AOP Concepts....");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessagePropogation msg = (MessagePropogation)context.getBean("msg");
        System.out.println(msg.getMessage());
        System.out.println(msg.getSetterMsg());
        SpringMsgPropogation smsg = (SpringMsgPropogation)context.getBean("springmsg");
        System.out.println(smsg.getMessagePropogation().getMessage());
        System.out.println(smsg.getMessagePropogation().getSetterMsg());
        smsg.hello();
    }
}
