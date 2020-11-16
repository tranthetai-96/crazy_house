package com.fpt.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long idRole;
	
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "role")
	private List<UserEntity> news = new ArrayList<>();


	

	public List<UserEntity> getNews() {
		return news;
	}

	public void setNews(List<UserEntity> news) {
		this.news = news;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	
}
