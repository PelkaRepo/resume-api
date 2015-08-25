package org.pelka.resume.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Defines model for <strong>personal</strong> artifacts. Used for defining
 * content that will display at the top of a resume/CV.
 * 
 * @author arnoldpelka
 *
 */
@Document(collection = "personal")
public class Personal {
	private String name;
	private String addr1;
	private String phoneEnc;
	private String phone;
	private String emailEnc;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getPhoneEnc() {
		return phoneEnc;
	}

	public void setPhoneEnc(String phoneEnc) {
		this.phoneEnc = phoneEnc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailEnc() {
		return emailEnc;
	}

	public void setEmailEnc(String emailEnc) {
		this.emailEnc = emailEnc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
