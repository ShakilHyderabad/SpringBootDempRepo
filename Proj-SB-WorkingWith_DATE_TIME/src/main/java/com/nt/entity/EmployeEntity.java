package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="EMP_DATA")
public class EmployeEntity implements Serializable {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Column(name="ENAME",length = 20)
  @Type(type="string")
  private String name;	
 
  //java8 date and time api
 
  @Column(name="DOB")
  @CreationTimestamp
  
  private LocalDateTime dob;
  private LocalDate doj;
  
  /*java.util.Date api
  @CreationTimestamp
  @Column(name="DOB")
  @Temporal(value=TemporalType.TIMESTAMP)	
  private Date dob;
  
  
  @UpdateTimestamp
  @Temporal(value=TemporalType.DATE)	
  private Date doj;*/

  public EmployeEntity() {
	
  }

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDateTime getDob() {
	return dob;
}

public void setDob(LocalDateTime dob) {
	this.dob = dob;
}

public LocalDate getDoj() {
	return doj;
}

public void setDoj(LocalDate doj) {
	this.doj = doj;
}

@Override
public String toString() {
	return "EmployeEntity [id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + "]";
}

}