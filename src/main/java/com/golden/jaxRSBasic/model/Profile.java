package com.golden.jaxRSBasic.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
	
	private long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;

}
