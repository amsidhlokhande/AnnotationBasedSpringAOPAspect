package com.amsidh.mvc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before(value="execution(public String getName())")
	public void executionTypePointCut(){
		System.out.println("Execution type point cut applied");
	}
	
	@Before(value="@annotation(com.amsidh.mvc.annotation.Loggable)")
	public void log(){
		System.out.println("@annotation type pointcut is applied");
	}
	
	
	@Before(value="args(name)")
	public void argsTypePointcut(String name){
		System.out.println("args type pointcut extecuted. Method with one string type argument is called. Argument value is "+name);
	}
	
	@Before(value="within(com.amsidh.mvc.domain.*)")
	public void within(){
		System.out.println("within type pointcut is applied");
	}
}
