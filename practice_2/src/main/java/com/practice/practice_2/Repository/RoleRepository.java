package com.practice.practice_2.Repository;

import com.practice.practice_2.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
