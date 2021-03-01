package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	// 對應嘅url爲： localhost:8088/demo_struts2/customerAction_save.action
	public String save() throws Exception {
		System.out.println("CustomerAction嘅Save()被調用了。");
		return super.execute();
	}
}
