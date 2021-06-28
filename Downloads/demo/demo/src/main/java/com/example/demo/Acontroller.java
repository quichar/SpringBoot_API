package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Acontroller {
	String costString;
	
	@RequestMapping("/")
	public String home(){	
		return "index.jsp";
	}	
	
	@RequestMapping("calculate")
	public String add(HttpServletRequest req){	
		int weight = Integer.parseInt(req.getParameter("kg"));
		Data data = new Data();
		data.setWeight(weight);
		Logic logic = new Logic();
		HttpSession session = req.getSession();
		session.setAttribute("weight", logic.compute(data.getWeight()));
		return "index.jsp";
	}
}
