package com.portfolioweb.gmp.Security.Repository;

import com.portfolioweb.gmp.Security.Entity.Rol;
import com.portfolioweb.gmp.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
