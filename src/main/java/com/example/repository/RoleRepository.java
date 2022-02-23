package com.example.repository;

import com.example.entity.Role;
import com.example.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bekjon Bakhromov
 * @created 22.02.2022-3:36 PM
 */

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRoleName(RoleName roleName);
}
