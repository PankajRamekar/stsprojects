package com.tyss.homedelivery.pojo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryGuy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deliveryGuyId;

	private String deliveryGuyName;

	private String location;

	private LocalDateTime availableFrom;

	private LocalDateTime availableTo;

	private Double rating;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_delivery", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "delivery_id"))
	private List<User> users = new ArrayList<User>();

}
