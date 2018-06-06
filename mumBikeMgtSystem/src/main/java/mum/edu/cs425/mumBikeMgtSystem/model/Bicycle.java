package mum.edu.cs425.mumBikeMgtSystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bicycle")
public class Bicycle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bicycleId;
	@Column(name="color")
	private String color;
	@Column(name="model")
	private String model;
	@Column(name="make")
	private String make;
	@Column(name="size")
	private String size;
	
	//private long OwnerId;
	@Column(name="desc")
	private String desc;
	public long getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(long bicycleId) {
		this.bicycleId = bicycleId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
