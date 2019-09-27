package com.issam.projectmanagment.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Project Name is required")
	private String projectName;
	
	@Size(min = 4 , max = 5)
	@Column(updatable = false , unique = true)
	private String projectIdentifier;
	@NotBlank(message = "The Description is required")
	private String description;
	
	private Date start_date;
	private Date end_date;
	
	private Date created_At;
	private Date updated_At;
	
	
	public Project() {
		super();
	}
	
	
	@PrePersist
	protected void create_At() {
		this.created_At = new Date();
	}
	
	@PreUpdate
	protected void update_At() {
		this.updated_At = new Date();
	}

	
	
	

}
