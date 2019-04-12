package cn.netkiller.oauth2.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

//	@Autowired
//	private OAuth2RestOperations oAuth2RestTemplate;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	// @PreAuthorize("hasAnyAuthority('user/view')")
	@GetMapping("/admin")
	public String test() {
//		oAuth2RestTemplate.getForObject("http://localhost:8082/client-2/resource/", String.class);
		return "admin";
	}

	@GetMapping("/callback")
	public ModelAndView callback(@RequestParam("code") String code) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("code", code);
		mv.setViewName("callback");
		return mv;
	}
}
