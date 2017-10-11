package win.log.service.localImpl;

import org.springframework.stereotype.Component;
import win.log.models.WebModel;
import win.log.service.IWebModelService;
import win.log.utils.JsonUtil;

import java.util.List;

@Component
public class WebModelServiceImpl extends LocalImpl implements IWebModelService {


    @Override
    public List<WebModel> loadAll() {
        JsonUtil<WebModel> util = new JsonUtil<WebModel>();
        List<WebModel> webModels = util.getListFromFile(getUrls(), WebModel.class);
        return webModels;
    }

    @Override
    public void save(List<WebModel> models) {
        JsonUtil<WebModel> util = new JsonUtil<WebModel>();
        util.writeFile(getUrls(),models);
    }
}
