package Entities;

import java.time.LocalDate;

public class Customer {
	
	
	//Oyunculara satýþ yapýlacaðý için oyuncular aslýnda birer müþteri.
	//Bu sýnýf oyuncularýmýzýn yani müþterilerimizin özellik sýnýfýdýr.
	
	//Attribute field...
	
	private int id;					//Müþteri id.
	private String firstName;		//Müþteri isim.
	private String lastName;			//Müþteri soyad.
	private String nationalityId;	//Müþteri tc numarasý.
	private LocalDate dateOfBirth;	//Müþteri doðum tarihi.
	private double balance;			//Müþteri hesap bakiyesi.
	
	public Customer(int id, String firstName, String lastName, String nationalityId,
			LocalDate dateOfBirth) {
		//Parametreli kurucu metodumuz.
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setNationalityId(nationalityId);
		this.setDateOfBirth(dateOfBirth);
		this.balance = 0.0;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return this.nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
