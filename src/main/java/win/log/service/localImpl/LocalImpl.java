package win.log.service.localImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import win.log.base.BaseService;

/**
 * Created by surface on 2017/7/2.
 */
@Component
public class LocalImpl extends BaseService {

    @Value("${blog.setting}")
    private String setting;
    @Value("${blog.store}")
    private String store;

    @Value("${blog.urls}")
    private String urls;

    /**
     * 配置文件中目录存储位置
     */


    String getSettingFile() {
        return this.setting;
    }

    String getStore() {
        return this.store;
    }

    String getUrls(){
        return this.urls;
    }

}
