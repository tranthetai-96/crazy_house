package com.fpt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.Entity.RoleEntity;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {
	RoleEntity findOneByCode(String code);
}
