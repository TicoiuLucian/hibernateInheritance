package ro.itschool.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ChildClassTablePerClass extends ParentClassTablePerClass {

	@Column
	private String childName;

}
