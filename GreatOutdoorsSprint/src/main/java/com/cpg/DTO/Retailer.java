package com.cpg.DTO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="RetailorDTOGreatOutdoors")
public class Retailer {
	@Id
	@Column(name="Retailor_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotBlank(message = "Reatailor_id cannot be empty")
	private long retailorId;
	@Column(name="Retailor_ItemName")
	@NotBlank(message = "Reatailor_ItemName cannot be empty")
	private String itemName;
	@Column(name="Item_ReceivedTime")
	@NotBlank(message = "Item_ReceivedTime cannot be empty")
	private Date itemReceived;
	@Column(name="Item_SoldTime")
	@NotBlank(message = "Item_SoldTime cannot be empty")
	private Date itemSold;
	public long getRetailorId() {
		return retailorId;
	}
	public void setRetailorId(long retailorId) {
		this.retailorId = retailorId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getItemReceived() {
		return itemReceived;
	}
	public void setItemReceived(Date itemReceived) {
		this.itemReceived = itemReceived;
	}
	public Date getItemSold() {
		return itemSold;
	}
	public void setItemSold(Date itemSold) {
		this.itemSold = itemSold;
	}
	
	
}
