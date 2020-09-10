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
@Table(name= "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "id_order")
	private long id_order;
	
	@Column(name = "id_ref")
	private String id_ref;
	
	@Column(name = "id_customer")
	private String id_customer;
	
	@Column(name = "customer_name")
	private String customer_name;
	
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

	public long getId_order() {
		return id_order;
	}
	public void setId_order(long id_order) {
		this.id_order = id_order;
	}
	public String getId_ref() {
		return id_ref;
	}
	public void setId_ref(String id_ref) {
		this.id_ref = id_ref;
	}
	public String getId_customer() {
		return id_customer;
	}
	public void setId_customer(String id_customer) {
		this.id_customer = id_customer;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
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
	public void setId(long id) {
		this.id = id;
	}
	public long getUnits() {
		return units;
	}
	public void setUnits(long units) {
		this.units = units;
	}

}
