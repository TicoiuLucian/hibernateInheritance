package ro.itschool.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("2")
public class ChildClass2SingleTable extends ParentClassSingleTable {

	@Column
	private String childClass2Name;
}
