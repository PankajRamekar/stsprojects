package com.tyss.homedelivery.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;

	private String address;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

}
