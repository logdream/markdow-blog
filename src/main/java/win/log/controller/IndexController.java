package win.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import win.log.base.BaseController;
import win.log.models.SysSetting;
import win.log.service.ISysSettingService;

/**
 * Created by surface on 2017/6/21.
 */
@Controller
public class IndexController extends BaseController {




    @Autowired
    private ISysSettingService service;
    @GetMapping("/init")
    public ModelAndView toInit() {

        ModelAndView modelAndView =  new ModelAndView("/sys/init");
        SysSetting sysSetting = service.loadSetting(1);
        if(null!=sysSetting){
            modelAndView.addObject("setting",sysSetting);
        }
        else{
            sysSetting = new SysSetting(1,1);
            service.saveSetting(sysSetting);
            modelAndView.addObject("setting",sysSetting);
        }
        return modelAndView;
    }
}
