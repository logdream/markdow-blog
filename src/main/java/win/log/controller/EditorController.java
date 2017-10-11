package win.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import win.log.base.BaseController;
import win.log.models.Blog;
import win.log.models.Result;
import win.log.service.IBlogService;

/**
 * Created by surface on 2017/7/2.
 */
@Controller
@RequestMapping("/blog")
public class EditorController extends BaseController {

    @Autowired
    private IBlogService blogService;
    @GetMapping("/editor")
    public ModelAndView toEdit() {
        return new ModelAndView("/markdown/editor");
    }
    @PostMapping("/save")
    @ResponseBody
    public Result saveModel(@ModelAttribute Blog blog){
       Integer id =  blogService.save(blog);
        return new Result(true,id+"");
    }

}
