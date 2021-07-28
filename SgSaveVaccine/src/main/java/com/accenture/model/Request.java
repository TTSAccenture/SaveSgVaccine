package com.accenture.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Request {
	
	@Id
	@GeneratedValue	
	private int requestid;
	private String sendername;
	private String senderaddress;
	private int senderphno;
	private String receivername;
	private String receiveraddress;
	private int receiverphno;
	private int dosecount;
	private Date requestdate;
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public String getSendername() {
		return sendername;
	}
	public void setSendername(String sendername) {
		this.sendername = sendername;
	}
	public String getSenderaddress() {
		return senderaddress;
	}
	public void setSenderaddress(String senderaddress) {
		this.senderaddress = senderaddress;
	}
	public int getSenderphno() {
		return senderphno;
	}
	public void setSenderphno(int senderphno) {
		this.senderphno = senderphno;
	}
	public String getReceivername() {
		return receivername;
	}
	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	public String getReceiveraddress() {
		return receiveraddress;
	}
	public void setReceiveraddress(String receiveraddress) {
		this.receiveraddress = receiveraddress;
	}
	public int getReceiverphno() {
		return receiverphno;
	}
	public void setReceiverphno(int receiverphno) {
		this.receiverphno = receiverphno;
	}
	public int getDosecount() {
		return dosecount;
	}
	public void setDosecount(int dosecount) {
		this.dosecount = dosecount;
	}
	public Date getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}
	@Override
	public String toString() {
		return "Request [requestid=" + requestid + ", sendername=" + sendername + ", senderaddress=" + senderaddress
				+ ", senderphno=" + senderphno + ", receivername=" + receivername + ", receiveraddress="
				+ receiveraddress + ", receiverphno=" + receiverphno + ", dosecount=" + dosecount + ", requestdate="
				+ requestdate + "]";
	}
	public Request(int requestid, String sendername, String senderaddress, int senderphno, String receivername,
			String receiveraddress, int receiverphno, int dosecount, Date requestdate) {
		super();
		this.requestid = requestid;
		this.sendername = sendername;
		this.senderaddress = senderaddress;
		this.senderphno = senderphno;
		this.receivername = receivername;
		this.receiveraddress = receiveraddress;
		this.receiverphno = receiverphno;
		this.dosecount = dosecount;
		this.requestdate = requestdate;
	}
	public Request() {
		
	}
	

}
