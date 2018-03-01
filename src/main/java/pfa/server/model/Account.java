package pfa.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Account {
	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;
	private String userName;
	@JsonIgnore
	private String password;
	private String company;
	private String rol;
	private String name;
	@JsonIgnore
	private boolean active;

	public Account() {
	}

	public Account(String userName, String password, boolean active, String company, String name, String rol) {
		super();
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.company = company;
		this.name = name;
		this.rol = rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}