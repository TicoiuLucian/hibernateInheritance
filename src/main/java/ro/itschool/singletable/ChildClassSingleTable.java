package ro.itschool.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("1")
public class ChildClassSingleTable extends ParentClassSingleTable {

	@Column
	private String childName;

}
