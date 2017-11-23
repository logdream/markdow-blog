package win.log.greenUnion.model;

import java.util.Date;

public class Admin {

	private String id;
	private String account;
	private String nickName;
	private String avatar;
	private String wechatOpenID;
	private String wechatUnionID;
	private String state;
	private String createUser;
	private Date createTime;
	private String modifyUser;
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getWechatOpenID() {
		return wechatOpenID;
	}
	public void setWechatOpenID(String wechatOpenID) {
		this.wechatOpenID = wechatOpenID;
	}
	public String getWechatUnionID() {
		return wechatUnionID;
	}
	public void setWechatUnionID(String wechatUnionID) {
		this.wechatUnionID = wechatUnionID;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	private Date modifyTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Admin() {
		super();
	}
	
}
