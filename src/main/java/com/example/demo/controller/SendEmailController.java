package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.EmailSendingRequest;
import com.example.demo.service.SendEmailService;

@Controller
public class SendEmailController {

	    @Autowired
	    SendEmailService sendEmailService;

	    @RequestMapping(value = "/mail/send", method = RequestMethod.POST)
	    public void sendMail(@RequestBody EmailSendingRequest emailSendingRequest) {
	        sendEmailService.sendEmail(emailSendingRequest.getTo(), 
	emailSendingRequest.getTextBody(), emailSendingRequest.getTopic());
	    }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

