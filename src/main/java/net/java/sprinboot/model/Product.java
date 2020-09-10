package net.java.sprinboot.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "id_ref")
	private long id_ref;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "units")
	private long units;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@CreationTimestamp
	private Date createAdt;
	
	@CreationTimestamp
	private Date updatedAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getCreateAdt() {
		return createAdt;
	}
	public void setCreateAdt(Date createAdt) {
		this.createAdt = createAdt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public long getId_ref() {
		return id_ref;
	}
	public void setId_ref(long id_ref) {
		this.id_ref = id_ref;
	}
	public long getUnits() {
		return units;
	}
	public void setUnits(long units) {
		this.units = units;
	}
	

}
