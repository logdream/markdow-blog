package win.log.models;

import java.util.Date;

/**
 * Created by surface on 2017/6/23.
 */
public class SysSetting {
    private Integer id;
    private Integer userId;
    private BlogSetting blogSetting;
    private ContentSetting contentSetting;
    private EditorSetting editorSetting;

    public SysSetting(Integer id, Integer userId) {
        this.id = id;
        this.userId = userId;
    }

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

    public BlogSetting getBlogSetting() {
        return blogSetting;
    }

    public void setBlogSetting(BlogSetting blogSetting) {
        this.blogSetting = blogSetting;
    }

    public ContentSetting getContentSetting() {
        return contentSetting;
    }

    public void setContentSetting(ContentSetting contentSetting) {
        this.contentSetting = contentSetting;
    }

    public EditorSetting getEditorSetting() {
        return editorSetting;
    }

    public void setEditorSetting(EditorSetting editorSetting) {
        this.editorSetting = editorSetting;
    }

    public SysSetting() {

    }

    public SysSetting(int id, int userId) {
        this.id = id;
        this.userId = userId;
        BlogSetting blogSetting = new BlogSetting(id);
        blogSetting.setAuthor("log");
        blogSetting.setCopyright("win.log");
        blogSetting.setCreateDate(new Date());
        blogSetting.setLayout("default");
        blogSetting.setSign("hello world");
        blogSetting.setTitle("你好时间");
        blogSetting.setTheme("default");
        blogSetting.setVersion(1);
        blogSetting.setUserId(1);
        this.blogSetting = blogSetting;
        ContentSetting contentSetting = new ContentSetting(id);
        contentSetting.setUserId(userId);
        contentSetting.setLayout("default");
        contentSetting.setTheme("default");
        contentSetting.setVersion(1);
        this.contentSetting = contentSetting;
        EditorSetting editorSetting = new EditorSetting(id, userId, "default", "default", 1);
        this.editorSetting = editorSetting;
    }
}
