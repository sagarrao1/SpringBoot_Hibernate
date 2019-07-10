package com.javabrains.Hibernate3.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;	
	private String userName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinedDate;	
	
	@ElementCollection()
	@JoinTable(name = "USER_ADDRESS",
			joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name = "f-gen", strategy = "increment")	
	@CollectionId(columns = { @Column(name ="ADDRESS_ID") }, generator = "f-gen", type = @Type(type = "long"))
	private Collection<Address> ListOfaddresses= new ArrayList<Address>();
	
	
//	@Embedded
//	@AttributeOverrides( { 
//	@AttributeOverride(column = @Column(name="HOME_STREET_NAME"), name = "street"),
//	@AttributeOverride(column = @Column(name="HOME_CITY_NAME"), name = "city"),
//	@AttributeOverride(column = @Column(name="HOME_STATE_NAME"), name = "state"),
//	@AttributeOverride(column = @Column(name="HOME_PINCODE"), name = "pincode")
//	})
//	private Address home_address;
//	
//	@Embedded
//	private Address office_address;	
	
	
	private String description;
	
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}	
		
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Address> getListOfaddresses() {
		return ListOfaddresses;
	}

	public void setListOfaddresses(Collection<Address> listOfaddresses) {
		ListOfaddresses = listOfaddresses;
	}


	
//	public Address getHome_address() {
//		return home_address;
//	}
//
//	public void setHome_address(Address home_address) {
//		this.home_address = home_address;
//	}
//
//	public Address getOffice_address() {
//		return office_address;
//	}
//
//	public void setOffice_address(Address office_address) {
//		this.office_address = office_address;
//	}

	
}
