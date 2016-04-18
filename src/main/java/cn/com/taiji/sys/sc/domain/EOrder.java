package cn.com.taiji.sys.sc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 订单
 * 
 * @project com.topie.eOrder.model.EOrder.java
 * @author wjl
 * @createdate 2016年3月3日 上午10:37:10
 */
@Entity
@Table(name="e_order")
@NamedQuery(name="EOrder.findAll", query="SELECT a FROM EOrder a")
public class EOrder implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="code")
	private String code;

	@Column(name="send_status")
	private String sendStatus;

	@Column(name="pay_status")
	private String payStatus;

	@Column(name="send_mode")
	private String sendMode;

	@Column(name="pay_mode")
	private String payMode;

	@Column(name="phone")
	private String phone;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getSendMode() {
		return sendMode;
	}

	public void setSendMode(String sendMode) {
		this.sendMode = sendMode;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public EOrder(){}
	
	public EOrder(Long id,String code){
		this.id = id;
		this.code = code;
	}
	

}