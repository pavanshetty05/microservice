package hibernate.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
public class Author implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer authorID;
	@Column(name = "authorname")
	private String authorname;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "author_books", joinColumns = @JoinColumn(name = "authors_ID"), inverseJoinColumns = @JoinColumn(name = "book_ID"))
	private Collection<Books> obook =new HashSet<Books>();

	

	

	public Collection<Books> getObook() {
		return obook;
	}

	public void setObook(Collection<Books> obook) {
		this.obook = obook;
	}

	public Integer getAuthorID() {
		return authorID;
	}

	public void setAuthorID(Integer authorID) {
		this.authorID = authorID;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	

}
