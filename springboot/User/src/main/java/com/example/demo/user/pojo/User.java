package com.example.demo.user.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
				@Id
				private String id;
				private String userName;
				private String password;
				private String userType;
				private String mobileNumber;
				private String confirmed;
				private String email;
				private String profileImage;
				public String getProfileImage() {
					return profileImage;
				}


				public void setProfileImage(String profileImage) {
					this.profileImage = profileImage;
				}


				public String getEmail() {
					return email;
				}


				public void setEmail(String email) {
					this.email = email;
				}
				
				@Override
				public String toString() {
					return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType="
							+ userType + ", mobileNumber=" + mobileNumber + ", confirmed=" + confirmed + ", email="
							+ email + ", profileImage=" + profileImage + "]";
				}
				

				public String getId() {
					return id;
				}
				public void setId(String id) {
					this.id = id;
				}
				public String getuserName() {
					return userName;
				}
				public void setuserName(String userName) {
					this.userName = userName;
				}
				public String getPassword() {
					return password;
				}
				public void setPassword(String password) {
					this.password = password;
				}
				public String getUserType() {
					return userType;
				}
				public void setUserType(String userType) {
					this.userType = userType;
				}
				
				public String getConfirmed() {
					return confirmed;
				}
				public void setConfirmed(String confirmed) {
					this.confirmed = confirmed;
				}



				public String getMobileNumber() {
					return mobileNumber;
				}


				public void setMobileNumber(String mobileNumber) {
					this.mobileNumber = mobileNumber;
				}
				
				
				
				
				}
