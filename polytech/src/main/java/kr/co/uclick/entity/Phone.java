package kr.co.uclick.entity;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name="phone")
public class Phone {

	@Id
	@TableGenerator(name = "phone")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "phone")
	@Column
	private Long id;
	
	@Column
	private String number;
	
	
	
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@XmlElement
	private User user;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
