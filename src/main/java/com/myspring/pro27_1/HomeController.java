package com.myspring.pro27_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
//SLF4J(Simple Logging Facade for Java)�� �ܼ��� �ۻ�� ������ �������� �ϴ� �ڹ� �α� API�� �����Ѵ�. 
//�ۻ��(facade) ����(�ܰ� ����)�� ����Ʈ���� ���� ������ ���� �� �ϳ��̴�. ��ü ���� ���α׷��� �о߿��� ���� ���δ�. Facade (�ܰ�)�� "�ǹ��� ����"�� �ǹ��Ѵ�.
//�ۻ��� Ŭ���� ���̺귯�� ���� � ����Ʈ������ �ٸ� Ŀ�ٶ� �ڵ� �κп� ���� ����ȭ�� �������̽��� �����ϴ� ��ü�̴�.
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		//locale�� ko_KR
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
