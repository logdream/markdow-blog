package win.log.service.localImpl;

import org.springframework.stereotype.Component;
import win.log.models.SysSetting;
import win.log.service.ISysSettingService;
import win.log.utils.JsonUtil;

/**
 * Created by surface on 2017/6/23.
 */
@Component("localSettingService")
public class LocalSettingServic extends LocalImpl implements ISysSettingService {

    @Override
    public SysSetting loadSetting(Integer userId) {
        JsonUtil<SysSetting> jsonUtil = new JsonUtil<>();
        SysSetting sysSetting =jsonUtil.getObjByFile(getSettingFile(),SysSetting.class);
        return sysSetting;
    }

    @Override
    public boolean saveSetting(SysSetting sysSetting) {
        JsonUtil<SysSetting> jsonUtil = new JsonUtil<>();
        return jsonUtil.writeFile(getSettingFile(),sysSetting);
    }
}
