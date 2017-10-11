package win.log.service;

import win.log.models.WebModel;

import java.util.List;

public interface IWebModelService {

    List<WebModel> loadAll();
    void  save(List<WebModel> models);
}
