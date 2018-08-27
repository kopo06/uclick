package kr.co.uclick.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;
import kr.co.uclick.service.PhoneService;
import kr.co.uclick.service.UserService;

@Controller
public class UclickController {

	private static final Logger logger = LoggerFactory.getLogger(UclickController.class);

	@Autowired
	private UserService userservice;
	
	@Autowired
	private PhoneService phoneservice;

	@RequestMapping(value = "list.html",  method = {RequestMethod.POST, RequestMethod.GET})
	public String list(Locale locale, @RequestParam Map<String, String> param, Model model) {
		
		
		
		List<User> users = userservice.findAll();
		List<Phone> phone = phoneservice.findAll();
		
		model.addAttribute("users", users);
		model.addAttribute("phone", phone);

		return "list";
	}
	@RequestMapping(value = "view.html",  method = {RequestMethod.POST, RequestMethod.GET})
	public String view(Locale locale, @RequestParam Map<String, String> param, Model model) {
		
		long id = Integer.parseInt(param.get("id"));
		//logger.debug("sample id : {}", id);
		Optional<User> users = userservice.findById(id);
		//logger.debug("sample name : {}", users.get().getPhoneList());
		model.addAttribute("users", users);
		return "view";
	}
	

	@RequestMapping(value = "newForm.html")
	public String newForm(Locale locale, @RequestParam Map<String, String> param, Model model) {
		
		return "newForm";
	}

	@RequestMapping(value = "editForm.html")
	public String editForm(Long sampleId, Model model) {
		userservice.findById(sampleId);
		return "editForm";
	}

	@RequestMapping(value = "save.html", method = {RequestMethod.POST, RequestMethod.GET})
	public String save(Locale locale, @RequestParam Map<String, String> param, Model model) {
		Phone phone = new Phone();
		User user = new User();
		
		String name = param.get("name");
		String addr = param.get("addr");
		String email = param.get("email");
		String number = param.get("number");
		
		user.setName(name);
		user.setAddr(addr);
		user.setEmail(email);
		userservice.save(user);
		
		phone.setNumber(number);
		phone.setUser(user);
		phoneservice.save(phone);
		
		return "redirect:list.html";
	}

	@RequestMapping(value = "delete.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String delete(Long sampleId, Locale locale, @RequestParam Map<String, String> param, Model model) {
		
		long id = Integer.parseInt(param.get("id"));
	
		Optional<User> user = userservice.findById(id);
		
		userservice.delete(user.get());
		
		
		
		return "redirect:list.html";
	}
	
	@RequestMapping(value = "phonedelete.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String phonedelete(Long sampleId, Locale locale, @RequestParam Map<String, String> param, Model model) {
		
		
		long id = Integer.parseInt(param.get("id"));
		long pid = Integer.parseInt(param.get("pid"));
		
		Optional<Phone> phone = phoneservice.findById(id);
		
		phoneservice.delete(phone.get());
			
		
		return "redirect:view.html?id="+pid;
	}
	
	@RequestMapping(value = "newphone.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String phoneinsert(Locale locale, @RequestParam Map<String, String> param, Model model) {
		long id = Integer.parseInt(param.get("id"));
		String number = param.get("number");
		
		Phone phone = new Phone();
		Optional<User> user = userservice.findById(id);
				
		phone.setNumber(number);
		phone.setUser(user.get());
		phoneservice.save(phone);
		
		return "redirect:view.html?id="+id;
	}
	

	@RequestMapping(value = "update.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String update(Long sampleId, Locale locale, @RequestParam Map<String, String> param, Model model) {
		long id = Integer.parseInt(param.get("id"));
		
		Optional<User> users = userservice.findById(id);
		model.addAttribute("users", users);
		
		
		
		return "update";
	}
	
	@RequestMapping(value = "upgrade.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String upgrade(Long sampleId, Locale locale, @RequestParam Map<String, String> param, Model model) {
		long id = Integer.parseInt(param.get("id"));
		//long pid = Integer.parseInt(param.get("pid"));
		
		Optional<User> user = userservice.findById(id);
		//Optional<Phone> phone = phoneservice.findById(pid);
		
		String name = param.get("name");
		String addr = param.get("addr");
		String email = param.get("email");
		//String number = param.get("number");
		
		user.get().setName(name);
		user.get().setAddr(addr);
		user.get().setEmail(email);
		userservice.save(user.get());
		
		//phone.get().setNumber(number);
		//phone.get().setUser(user.get());
		//phoneservice.save(phone.get());
				
		return "redirect:view.html?id="+id;
	}
	
	@RequestMapping(value = "phoneupdate.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String phoneupdate(Long sampleId, Locale locale, @RequestParam Map<String, String> param, Model model) {
		long id = Integer.parseInt(param.get("id"));
		long pid = Integer.parseInt(param.get("pid"));
		Optional<Phone> phone = phoneservice.findById(id);
		model.addAttribute("phone", phone);
		model.addAttribute("pid", pid);
		
		
		return "phoneupdate";
	}
	
	@RequestMapping(value = "upgrade1.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String upgrade1(Long sampleId, Locale locale, @RequestParam Map<String, String> param, Model model) {
		long id = Integer.parseInt(param.get("id"));
		long pid = Integer.parseInt(param.get("pid"));
		//long pid = Integer.parseInt(param.get("pid"));
		
		//Optional<User> user = userservice.findById(id);
		Optional<Phone> phone = phoneservice.findById(id);
		
//		String name = param.get("name");
//		String addr = param.get("addr");
//		String email = param.get("email");
		String number = param.get("number");
		
	/*	user.get().setName(name);
		user.get().setAddr(addr);
		user.get().setEmail(email);
		userservice.save(user.get());*/
		
		phone.get().setNumber(number);
		//phone.get().setUser(user.get());
		phoneservice.save(phone.get());
				
		return "redirect:view.html?id="+pid;
	}
	
	
	@RequestMapping(value = "search.html",method = {RequestMethod.POST, RequestMethod.GET})
	public String search(Long sampleId, Locale locale, @RequestParam Map<String, String> param, Model model) {

		
		 String keyword = param.get("keyword");
	        String check = param.get("check");
	        String a = "";
		
	        List<User> user = new ArrayList<User>();
	        List<Phone> phone = new ArrayList<Phone>();

		
		   if(check.equals("checkname")) {
	            user = userservice.findByNameContaining(keyword);
	            if(user.size()>0) {
	                model.addAttribute("users", user);
	            }
	            	
	        }
	        
	        if(check.equals("checkphone")) {
	            phone = phoneservice.findByNumberContaining(keyword);
	            for(Phone phones : phone) {
	                user.add(phones.getUser());
	            }
	            user= new ArrayList<User>(new HashSet<User>(user));
	            model.addAttribute("users", user);
	        }        

	        if(user.size()>0) {
		 model.addAttribute("users", user);
		 
		a = "searchView";
		
		}else {
			a = "noView";			
		}
		return a;
		
		
	}
	
	


	@RequestMapping(value = "sample.html")
	public String sample(String name, User user, Model model) {

		logger.debug("sample name : {}", name);
		logger.debug("Sample.name : {}", user.getId());

		model.addAttribute("samples", userservice.findAll());
		model.addAttribute("sample", user);
		model.addAttribute("findSampleByName", userservice.findByNameContaining(name));
		return "sample";
	}
}
