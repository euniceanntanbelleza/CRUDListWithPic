package com.example.crudlistwithpic;

import android.net.Uri;

public class Person {
	
	private Uri imageUri;
	private String name, email, contact;
	
	public Person(Uri imageUri, String name, String email, String contact) {
		super();
		this.imageUri = imageUri;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

	public Uri getImageUri() {
		return imageUri;
	}

	public void setImageUri(Uri imageUri) {
		this.imageUri = imageUri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
