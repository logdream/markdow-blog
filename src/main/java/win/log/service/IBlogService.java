package win.log.service;

import win.log.models.Blog;

/**
 * Created by surface on 2017/7/2.
 */
public interface IBlogService {
    Blog load(Integer id);
    Integer save(Blog blog);

}
