package win.log.service.localImpl;

import org.springframework.stereotype.Component;
import win.log.models.Blog;
import win.log.service.IBlogService;
import win.log.utils.JsonUtil;

import java.io.File;

/**
 * Created by surface on 2017/7/2.
 */
@Component("blogService")
public class BlogService extends LocalImpl implements IBlogService{
    String dir = getStore()+ File.separator+"blog";
    @Override
    public Blog load(Integer id) {

        File json = new File(dir+File.separator + id +".json");
        if(json.exists()&&json.canRead()) {
            JsonUtil<Blog> jsonUtil = new JsonUtil<Blog>();
            return jsonUtil.getObjByFile(json.getAbsolutePath(),Blog.class);
        }
        else{
            logger.error("未找到 blog %d 为",id);
        }
        return null;
    }

    @Override
    public Integer save(Blog blog) {
        JsonUtil<Blog> json = new JsonUtil<Blog>();

        File parent = new File(dir);
        if(!parent.exists()){
            parent.mkdirs();
        }
        if(!parent.exists()){
            logger.error("目标目录不存在");
        }
        Integer size = parent.list().length;
        if(null==blog.getId()||blog.getId()<1)
            blog.setId(size);
        json.writeFile(parent + File.separator + blog.getId() +".json",blog);
        return size;
    }
}
