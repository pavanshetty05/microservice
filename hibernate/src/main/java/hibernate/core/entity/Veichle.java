package hibernate.core.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Veichle")
public class Veichle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int viechleID;
	@Column(name = "veichleNumber")
	private String veichleNumber;

	@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
	private User ouser;

	public User getOuser() {
		return ouser;
	}

	public void setOuser(User ouser) {
		this.ouser = ouser;
	}

	public int getViechleID() {
		return viechleID;
	}

	public void setViechleID(int viechleID) {
		this.viechleID = viechleID;
	}

	public String getVeichleNumber() {
		return veichleNumber;
	}

	public void setVeichleNumber(String veichleNumber) {
		this.veichleNumber = veichleNumber;
	}

}
