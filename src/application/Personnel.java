package application;
/*
Thaddeus Albert Bartz
William Christian Leonard
Period 5
PSET6-0 SuperProject
February 12, 2018
*/
import java.time.LocalDate;

public class Personnel {

	private String personnelName;
	private String personnelAge;
	private LocalDate personnelDOE;
	private LocalDate personnelDOB;
	private double wage;
	private Boolean employed;
	private String employeeNotes;
	
	
	//default
	public Personnel() {
		this.personnelName = "";
		this.personnelAge = "";
		this.personnelDOE = LocalDate.EPOCH;
		this.personnelDOB = LocalDate.EPOCH;
		this.wage = 0.00;
		this.employed = false;
	}
	
	//full
	public Personnel(String personnelName, String personnelAge, LocalDate personnelDOE, LocalDate personnelDOB, double wage) {
		this.personnelName = personnelName;
		this.personnelAge = personnelAge;
		this.personnelDOE = personnelDOE;
		this.personnelDOB = personnelDOB;
		this.wage = wage;
	}
	
	public String getPersonnelName() {
		return personnelName;
	}
	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}
	public String getPersonnelAge() {
		return personnelAge;
	}
	public void setPersonnelAge(String personnelAge) {
		this.personnelAge = personnelAge;
	}
	public LocalDate getPersonnelDOE() {
		return personnelDOE;
	}
	public void setPersonnelDOE(LocalDate personnelDOE) {
		this.personnelDOE = personnelDOE;
	}
	public LocalDate getPersonnelDOB() {
		return personnelDOB;
	}
	public void setPersonnelDOB(LocalDate personnelDOB) {
		this.personnelDOB = personnelDOB;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public Boolean getEmployed() {
		return employed;
	}
	public void setEmployed(Boolean employed) {
		this.employed = employed;
	}
	public String getEmployeeNotes() {
		return employeeNotes;
	}
	public void setEmployeeNotes(String employeeNotes) {
		this.employeeNotes = employeeNotes;
	}
	
	
}
