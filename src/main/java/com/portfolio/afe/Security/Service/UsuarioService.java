/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.afe.Security.Service;

import com.portfolio.afe.Security.Enums.Entity.Usuario;
import com.portfolio.afe.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
    return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
public boolean existByNombreUsuario(String nombreUsuario){
return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
}
public boolean existByEmail(String email){
return iusuarioRepository.existsByEmail(email);
}
public void save(Usuario usuario){
iusuarioRepository.save(usuario);

}

}

