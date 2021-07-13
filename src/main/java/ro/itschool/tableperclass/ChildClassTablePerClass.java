package ro.itschool.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ChildClassTablePerClass extends ParentClassTablePerClass {

	@Column
	private String childName;

	public ChildClassTablePerClass(int id, String name, String childName) {
		super(id, name);
		this.childName = childName;
	}
	
	

}
