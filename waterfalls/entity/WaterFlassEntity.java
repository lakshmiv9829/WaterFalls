package com.xworkz.waterfalls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "waterfalls")
public class WaterFlassEntity {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "WID")
	private int wID;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "HEIGHT")
	private double height;
	@Column(name = "DEPTH")
	private double depth;
	@Column(name = "ELEGENERATED")
	private boolean electricityGenerated;
	@Column(name = "SOURACERIVER")
	private String sourceriver;
	@Column(name = "ENTRYFEE")
	private int entryFee;
	@Column(name = "DESTINATATION")
	private String Destinatation;
	@Column(name = "RATING")
	private double rating;
	@Column(name = "NO_OF_DEATH")
	private int noOfDeath;
	@Column(name = "NO_OF_VISITORS")
	private int noOfVisitors;

}
