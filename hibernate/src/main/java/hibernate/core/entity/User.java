package hibernate.core.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "User")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;
	@Column(name = "userName")
	private String userName;
	@Column(name = "lastname")
	private String lastname;

	@OneToOne(targetEntity = Veichle.class, cascade = CascadeType.ALL)
	@JoinTable(name = "user_veichle", joinColumns = @JoinColumn(name = "userID"), inverseJoinColumns = @JoinColumn(name = "viechleID"))
	private Veichle oveichle;

	public Veichle getOveichle() {
		return oveichle;
	}

	public void setOveichle(Veichle oveichle) {
		this.oveichle = oveichle;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
