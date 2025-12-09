package com.upc.apicarloszegarra_final.security.repositories;
import com.upc.apicarloszegarra_final.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
