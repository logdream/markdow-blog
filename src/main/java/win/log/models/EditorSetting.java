package win.log.models;

/**
 * Created by surface on 2017/6/23.
 */
public class EditorSetting {
    private  Integer id;
    private  Integer userId;
    private  String theme;
    private String layout;
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public EditorSetting(Integer id, Integer userId) {
        this.id = id;
        this.userId = userId;
    }

    public EditorSetting(Integer id, Integer userId, String theme, String layout, Integer version) {
        this.id = id;
        this.userId = userId;
        this.theme = theme;
        this.layout = layout;
        this.version = version;
    }
   public EditorSetting(){
        super();
   }
}
