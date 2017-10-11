package win.log.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import win.log.utils.parsevideo.YoukuParse;

@Controller

public class ParseVideoController {

	@PostMapping("/parse")
	@ResponseBody
	public String urlToVideo(String url,String type){
		if("youku".equals(type)){
			YoukuParse youkuParse = new YoukuParse(url);
			return youkuParse.getJson();
			
		}
		else{
			return "undefined";
		}
	}
	
	@GetMapping("/parse")
	public ModelAndView toParse(){
		  return new ModelAndView("/parse/index");
	}
}
