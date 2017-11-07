package com.neuedu.bean;

public class UploadResJson {
	private int status;//上传成功与否的状态
	
	private String msg;//错误提示
	private String src;//路径名，图片地址
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
