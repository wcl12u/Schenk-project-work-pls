package application;

/*
Thaddeus Albert Bartz
William Christian Leonard
Period 5
PSET6-0 SuperProject
February 12, 2018
*/

import java.time.LocalDate;

import javafx.scene.image.Image;

public class Owner {

	private String ownerName;
	private String ownerAddress;
	private String ownerPhoneNumber;
	private int ownerAge;
	private Image ownerID;
	private LocalDate dateOfAdoption;
	private String ownerStateOfResidence;
	
	//Default
	public Owner() {
		this.ownerName = "No Data Entered";
		this.ownerAddress = "No Data Entered";
		this.ownerPhoneNumber = "No Data Entered";
		this.ownerAge = -1;
		this.ownerID = new Image("/application/AddImageImage.png");
		this.dateOfAdoption = LocalDate.EPOCH;
		this.ownerStateOfResidence = "";
		}
	//Full
	public Owner(String ownerName, String ownerAddress, String ownerPhoneNumber, int ownerAge, Image ownerIDLink,
			LocalDate dateOfAdoption, String ownerStateOfResidence) {
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerAge = ownerAge;
		this.ownerID = ownerIDLink;
		this.dateOfAdoption = dateOfAdoption;
		this.ownerStateOfResidence = ownerStateOfResidence;
	}
	//No ID
	public Owner(String ownerName, String ownerAddress, String ownerPhoneNumber, int ownerAge, LocalDate dateOfAdoption,
			String ownerStateOfResidence) {
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerAge = ownerAge;
		this.dateOfAdoption = dateOfAdoption;
		this.ownerStateOfResidence = ownerStateOfResidence;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}
	public void setOwnerPhoneNumber(String ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}
	public int getOwnerAge() {
		return ownerAge;
	}
	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}
	public Image getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(Image ownerIDLink) {
		this.ownerID = ownerIDLink;
	}
	public LocalDate getDateOfAdoption() {
		return dateOfAdoption;
	}
	public void setDateOfAdoption(LocalDate dateOfAdoption) {
		this.dateOfAdoption = dateOfAdoption;
	}
	public String getOwnerStateOfResidence() {
		return ownerStateOfResidence;
	}
	public void setOwnerStateOfResidence(String ownerStateOfResidence) {
		this.ownerStateOfResidence = ownerStateOfResidence;
	}
	
	
	
}
