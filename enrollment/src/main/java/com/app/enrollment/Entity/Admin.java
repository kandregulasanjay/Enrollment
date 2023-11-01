package com.app.enrollment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")

	public class Admin  {
		@Id
		private String username;
		private String password;				
		private String emailid;
		
		public Admin() {
			
		}	
		
		public Admin(String username, String password, String emailid) {
			super();
			this.username = username;
			this.password = password;
			this.emailid = emailid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		@Override
		public String toString() {
			return "Admin [password=" + password + 
					", username=" + username +
					", emailid=" + emailid + 
					"]";
		}
			
	}
