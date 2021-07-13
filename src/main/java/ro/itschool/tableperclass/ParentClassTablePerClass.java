package ro.itschool.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ParentClassTablePerClass {

	@Id
	protected int id;

	@Column
	protected String name;

	public ParentClassTablePerClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
