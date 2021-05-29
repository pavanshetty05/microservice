package hibernate.core.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name = "AccoutDetails")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name = "AccountDetails.name", query = "from AccoutDetails where userName=:userName")
@NamedNativeQuery(name = "AccountDetails.n", query = " select * from account where userName=:userName",resultClass=AccoutDetails.class)
@Table(name = "account")
public class AccoutDetails implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int acountID;
	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;
   
	
	public int getAcountID() {
		return acountID;
	}

	public void setAcountID(int acountID) {
		this.acountID = acountID;
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

}
