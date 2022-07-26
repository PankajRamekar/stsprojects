package com.tyss.homedelivery.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	private String userName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<UserAddress> userAddressList = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
	private List<DeliveryGuy> deliveryGuys = new ArrayList<DeliveryGuy>();
}
