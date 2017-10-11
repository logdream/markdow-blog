package win.log.models;

import java.util.Date;

/**
 * Created by surface on 2017/6/23.
 */
public class BlogSetting {
    private Integer id;

    /**
     * 版本
     */
    private Integer version;

    private Date createDate;

    private String title;

    private String author;

    private Integer userId;

    private String sign;

    private String copyright;

    private String theme;
    private String layout;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
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

    public BlogSetting(Integer id, Integer version, Date createDate, String title, String author, Integer userId, String sign, String copyright, String theme, String layout) {
        this.id = id;
        this.version = version;
        this.createDate = createDate;
        this.title = title;
        this.author = author;
        this.userId = userId;
        this.sign = sign;
        this.copyright = copyright;
        this.theme = theme;
        this.layout = layout;
    }

    public BlogSetting(Integer id) {
        this.id = id;
    }
    public BlogSetting(){

    }
}