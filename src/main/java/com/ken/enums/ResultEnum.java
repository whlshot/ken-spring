package com.ken.enums;

/**
 * 
 * @author yhq
 * @date 创建时间：2017年8月11日
 */
public enum ResultEnum {
	SUCCESS("200", "操作成功"), ERROR("500", "系统报错"), NOT_LOGIN("102", "用户没有登录"), NO_AUTHORITY("403",
			"用户没有权限"), NOT_EXITS("104", "用户不存在");

	private String code;
	private String info;

	ResultEnum(String code, String info) {
		this.code = code;
		this.info = info;
	}

	public String getCode() {
		return code;
	}

	public String getInfo() {
		return info;
	}
}
