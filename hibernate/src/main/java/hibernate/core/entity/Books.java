package hibernate.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Books implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookID;
	@Column(name = "bookname")
	private String bookname;

	@ManyToOne(targetEntity = Author.class)
	Author oautohor;

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Author getOautohor() {
		return oautohor;
	}

	public void setOautohor(Author oautohor) {
		this.oautohor = oautohor;
	}

}
