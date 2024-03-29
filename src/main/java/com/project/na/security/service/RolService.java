
package com.project.na.security.service;

import com.project.na.security.entity.Rol;
import com.project.na.security.enums.RolNombre;
import com.project.na.security.repository.IRolRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    IRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }

    public List<Rol> verRoles() {
        return irolRepository.findAll();
    }

}
