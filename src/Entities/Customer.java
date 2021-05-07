package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity{
	private int Id;
	private String firstName;
	private String lastName;
	private int dataOfBirth;
	private String nationalId;

	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataOfBirth = dateOfBirth;
		this.nationalId = nationalityId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDataOfBirth() {
		return dataOfBirth;
	}
	public void setDataOfBirth(int dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


}