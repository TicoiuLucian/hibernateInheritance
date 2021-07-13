package ro.itschool.joinedtable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "Parent_Id")
public class ChildClass2JoinedTable extends ParentClassJoinedTable {

	@Column
	private String childClass2Name;
}
