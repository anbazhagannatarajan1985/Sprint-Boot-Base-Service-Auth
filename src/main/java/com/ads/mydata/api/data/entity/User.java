package com.ads.mydata.api.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator
	(
		name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator"
	)
    private String id;
    private String name;
    @Indexed
    private String username;
    @Indexed
    private String password;
    private String mobileNo; 
    private String userProfileUrl;
    private Date   lastLoggedIn;
    private List<String> roleIds;
    @Indexed
    private Boolean status;
    @Indexed
    private String emailAddress;
    @Indexed
    private Boolean isDefaultUser;
    private Boolean sendOtp;
    private String userType;
    private Date   createdDate;
    private Date   updatedDate;
    private String createdBy;
    private String updatedBy;
}
