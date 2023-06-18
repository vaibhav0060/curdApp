package com.CrudeApp.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; ;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class UserEntity {

	@Id
	//@Column(name = "id")
	@GeneratedValue
	private long id ;
	
//	@Column(name ="username", length =755)
	private String userName ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
}
