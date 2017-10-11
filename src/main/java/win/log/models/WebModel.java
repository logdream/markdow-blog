package win.log.models;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class WebModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -233048042028968208L;
	@Id
	private String id;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String url;
    private String shortName;
    private String iconUrl;
    private LocalDate beginDate;
    private Boolean isUsed;
    private String enName;
    

   

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public WebModel() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }
}
