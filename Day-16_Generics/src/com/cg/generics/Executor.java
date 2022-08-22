package com.cg.generics;

public class Executor {

	public static void main(String[] args) 
	{
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic Class Demo");
		obj.sendMessage();
		System.out.println();
		//create an email object to be send using sender
		Email em=new Email();
		em.setFrom("mayurijadhav@gamil.com");
		em.setTo("jadhavmayuri@gmai.com");
		em.setSubject("java full stack");
		em.setBody("about training and placements");
		System.out.println(em.getBody());
		//crate a sender to send this email
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		obj1.sendMessage();
		
		

	}

}
