package com.github.wxiaoqi.security.test.aceservicetest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-07-05 15:21:20
 */
@Table(name = "base_demo")
public class BaseDemo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //全名
    @Column(name = "FULLNAME_")
    private String fullname;
	
	    //联系方式
    @Column(name = "MOBILE_")
    private String mobile;
	
	    //邮箱
    @Column(name = "EMAIL_")
    private String email;
	

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：全名
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	/**
	 * 获取：全名
	 */
	public String getFullname() {
		return fullname;
	}
	/**
	 * 设置：联系方式
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：联系方式
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
}
