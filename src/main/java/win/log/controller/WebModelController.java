package win.log.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import win.log.base.BaseController;
import win.log.models.RenderResult;
import win.log.models.WebModel;
import win.log.service.IWebModelService;
import win.log.service.RenderResultRepository;
import win.log.service.WebModelRepository;



@Controller
@RequestMapping("/web")
public class WebModelController extends BaseController {

	@Autowired
	private IWebModelService webModelService;

	@GetMapping("/all")
	@ResponseBody
	public List<WebModel> all() {
		return webModelService.loadAll();
	}
	
	@GetMapping("/listjson")
	@ResponseBody
	public List<WebModel> listJson(){
		return res.findAll();
	}

	@GetMapping("/list")
	public ModelAndView toList() {
		ModelAndView modelAndView = new ModelAndView("web/index");
		List<WebModel> models = res.findAll();
		modelAndView.addObject("lists", models);
		return modelAndView;
	}

	@GetMapping("/init")
	@ResponseBody
	public List<WebModel> init() {
		List<WebModel> models = new ArrayList<>();
		WebModel model = new WebModel();
		model.setUrl("http://www.cnbeta.com/");
		model.setShortName("cnbeta");
		model.setBeginDate(LocalDate.now());
		models.add(model);
		WebModel model2 = new WebModel();
		model2.setUrl("http://news.sina.com.cn/society/");
		model2.setShortName("新浪新闻");
		model2.setBeginDate(LocalDate.now());
		models.add(model2);
		webModelService.save(models);
		return webModelService.loadAll();
	}

	@Autowired
	private WebModelRepository res;
	@PostMapping("/saveAll")
	public String saveAll(String id[],String[] shortName, String[] enName, String[] url, String[] beginDate, String[] iconUrl,
			String[] used) {
		List<WebModel> models = new ArrayList<>();
		List<WebModel> saved = new ArrayList<>();
		for (int i = 0; i < shortName.length; i++) {
			if (null != shortName[i]&&shortName[i].length()>0) {
				WebModel model = new WebModel();
				model.setShortName(shortName[i]);
				model.setEnName(enName[i]);
				model.setUrl(url[i]);
				if(null!=id[i]&&id.length>0)
					model.setId(id[i]);
				model.setIconUrl(iconUrl[i]);
				if (null != beginDate[i]&&beginDate[i].indexOf("-")>-1) {
					String[] yearDay = beginDate[i].split("-");
					LocalDate date = LocalDate.of(Integer.parseInt(yearDay[0]), Integer.parseInt(yearDay[1]),
							Integer.parseInt(yearDay[2]));
					model.setBeginDate(date);
				} else {
					model.setBeginDate(LocalDate.now());
				}
				model.setUsed(Boolean.valueOf(used[i]));
				models.add(model);
				res.save(model);
				if(model.getUsed()){
					saved.add(model);
				}
			}

		}
		webModelService.save(saved);
		return "redirect:/web/list";
	}
	
	
	@Autowired
	private RenderResultRepository renderS;
	@RequestMapping("saveRenderResult")
	@ResponseBody
	public String saveRenderResult(String id){
		RenderResult renderResult = new RenderResult();
		WebModel webModel = res.findOne(id);
		renderResult.setShortName(webModel.getShortName());
		renderResult.setModelId(id);
		renderS.save(renderResult);
		return "done";
	}
}
