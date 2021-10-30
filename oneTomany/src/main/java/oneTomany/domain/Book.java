package oneTomany.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data    /*Parent class*/
public class Book {
	@Id
	@NonNull
	private Integer bookId;
	private String bookName;
	private String bookFname;
	
	@OneToMany
	@JoinColumn(name="authorFK")
	private List<Author> authlist;

}
