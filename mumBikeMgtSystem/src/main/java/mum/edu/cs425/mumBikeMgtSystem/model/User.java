package mum.edu.cs425.mumBikeMgtSystem.model;

	import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
	import javax.validation.constraints.Pattern;

	@Entity
	@Table(name="user")
	public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long userId;
	 
	 @Column(name="fname")
	 private String fname;
	 
	 @Column(name="lname")
	 private String lname;
	 @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
		        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
		        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
		             message="{invalid.email}")
	 @Column(name="email")
	 private String email;
	 
	 @Column(name="address")
	 private String address;
	 @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
             message="{invalid.phonenumber}")
	 @Column(name="telephone")
	 private String telephone;
	 
	 @Column(name="userType")
	 private String userType;
	 
	 @Column(name="password")
	 private String password;
	 
	 @OneToMany(
		        cascade = CascadeType.ALL, 
		        orphanRemoval = true
		    )
	 private List<Bicycle> bicycles;

	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
}
