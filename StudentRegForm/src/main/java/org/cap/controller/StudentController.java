package org.cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String studentregForm() {
		
		return "studentForm";
		
	}
	@RequestMapping("/next")
	public String paymentPage() {
		return "paymentForm";
	}
@RequestMapping("/pay")
public String makePayment() {
	return "redirect:/";
}
	}
