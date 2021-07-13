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
public class ChildClass2TablePerClass extends ParentClassTablePerClass {

	@Column
	private String childClass2Name;

	public ChildClass2TablePerClass(int id, String name, String childClass2Name) {
		super(id, name);
		this.childClass2Name = childClass2Name;
	}
	
	
}
