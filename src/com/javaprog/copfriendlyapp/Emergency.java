package com.javaprog.copfriendlyapp;

public class Emergency {
private int id;
private String name,incidenttype,location,patientaddress,bloodgroup,actiontaken,witnessphno,offenderphno;
//private int fine,paid,due;
private String phno1,phno2,phno3;


public Emergency() {}

public Emergency(String name, String incidenttype, String location,String phno1,String phno2,String phno3, String patientaddress, String bloodgroup,
		String actiontaken, String witnessphno, String offenderphno) {
	super();
	
	this.name = name;
	this.incidenttype = incidenttype;
	this.location = location;
	this.phno1 = phno1;
	this.phno2 = phno2;
	this.phno3 = phno3;
	this.patientaddress = patientaddress;
	this.bloodgroup = bloodgroup;
	this.actiontaken = actiontaken;
	this.witnessphno= witnessphno;
	this.offenderphno = offenderphno;
}

public Emergency(int id, String name, String incidenttype, String location,String phno1,String phno2,String phno3, String patientaddress, String bloodgroup,
		String actiontaken, String witnessphno, String offenderphno) {
	super();
	this.id = id;
	this.name = name;
	this.incidenttype = incidenttype;
	this.location = location;
	this.phno1 = phno1;
	this.phno2 = phno2;
	this.phno3 = phno3;
	this.patientaddress = patientaddress;
	this.bloodgroup = bloodgroup;
	this.actiontaken = actiontaken;
	this.witnessphno= witnessphno;
	this.offenderphno = offenderphno;
}

public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getincidenttype() {
	return incidenttype;
}
public void setincidenttype(String incidenttype) {
	this.incidenttype = incidenttype;
}
public String getlocation() {
	return location;
}
public void setlocation(String location) {
	this.location = location;
}
public String getphno1() {
	return phno1;
}
public void setphno1(String phno1) {
	this.phno1 = phno1;
}
public String getphno2() {
	return phno2 ;
}
public void setphno2(String phno2) {
	this.phno2 = phno2;
}
public String getphno3() {
	return phno3;
}
public void setphno3(String phno3) {
	this.phno3 = phno3;
}
public String getpatientaddress() {
	return patientaddress;
}
public void setpatientaddress(String patientaddress) {
	this.patientaddress = patientaddress;
}
public String getbloodgroup() {
	return bloodgroup;
}
public void setbloodgroup(String bloodgroup) {
	this.bloodgroup = bloodgroup;
}
public String getactiontaken() {
	return actiontaken;
}
public void setactiontaken(String actiontaken) {
	this.actiontaken = actiontaken;
}
public String getwitnessphno() {
	return witnessphno;
}
public void setwitnessphno(String witnessphno) {
	this.witnessphno = witnessphno;
}
public String getoffenderphno() {
	return offenderphno;
}
public void setoffenderphno(String offenderphno) {
	this.offenderphno = offenderphno;
}

}
