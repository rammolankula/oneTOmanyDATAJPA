package oneTomany.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity /*Child class*/
public class Author {
	@Id
	@NonNull
	private Integer authorId;
	private String authorName;
	private String authorBook;
}
