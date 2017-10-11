package win.log.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class RenderResult {

	@Id
	private String id;
	private String shortName;
	private String modelId;
	private LocalDate createDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public RenderResult() {
		
		super();
		// TODO Auto-generated constructor stub
		createDate = LocalDate.now();
	}
	
	
}
