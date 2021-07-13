package ro.itschool.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "CCMappedSuperClass")
public class ChildClassMappedSuperClass extends ParentClassMappedSuperClass {

	@Column
	private String childName;

}
