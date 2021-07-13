package ro.itschool.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ChildClass2TablePerClass extends ParentClassTablePerClass {

	@Column
	private String childClass2Name;
}
