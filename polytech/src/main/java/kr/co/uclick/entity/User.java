package kr.co.uclick.entity;

import java.util.List;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="user")
public class User {
	@Id
	@TableGenerator(name = "user")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "user")
	@Column
	private Long id;
	
	@Column(length = 20)
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String addr;
	
	
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	@Column
	private List<Phone> phoneList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public List<Phone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}
	
	
	
	
}
