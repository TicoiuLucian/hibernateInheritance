package ro.itschool.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "CC2MappedSuperClass")
public class ChildClass2MappedSuperClass extends ParentClassMappedSuperClass {

	@Column
	private String childClass2Name;
}
