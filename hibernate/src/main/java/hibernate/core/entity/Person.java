package hibernate.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Persons")
@Table(name = "Persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "PersonID")
	private int PersonID;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	@Column(name = "date")
	private Date date;

	@OneToOne
	@JoinTable(name="user_address", joinColumns = @JoinColumn(name="Person_ID"), inverseJoinColumns=@JoinColumn(name="address_ID"))
	Address oaddress=new Address();

	public Address getOaddress() {
		return oaddress;
	}

	public void setOaddress(Address oaddress) {
		this.oaddress = oaddress;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date2) {
		this.date = date2;
	}

	public int getPersonID() {
		return PersonID;
	}

	public void setPersonID(int personID) {
		PersonID = personID;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

}
