package win.log.service;

import win.log.models.SysSetting;

/**
 * Created by surface on 2017/6/23.
 */
public interface ISysSettingService {
     SysSetting loadSetting(Integer userId);
     boolean saveSetting(SysSetting sysSetting);

}
