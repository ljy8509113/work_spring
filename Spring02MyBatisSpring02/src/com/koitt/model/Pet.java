package com.koitt.model;

import java.util.Date;

public class Pet {
	private Integer petId;
	private String petName;
	private String ownerName;
	private Integer price;
	private Date birthday;
	
	public Pet() {
	}
	
	public Pet(Integer petId, String petName, String ownerName, Integer price, Date birthday) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.ownerName = ownerName;
		this.price = price;
		this.birthday = birthday;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pet [petId=");
		builder.append(petId);
		builder.append(", petName=");
		builder.append(petName);
		builder.append(", ownerName=");
		builder.append(ownerName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append("]");
		return builder.toString();
	}
	
}
