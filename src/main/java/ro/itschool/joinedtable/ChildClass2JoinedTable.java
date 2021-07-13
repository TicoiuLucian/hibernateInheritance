package ro.itschool.joinedtable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "Parent_Id")
public class ChildClass2JoinedTable extends ParentClassJoinedTable {

	@Column
	private String childClass2Name;
}
