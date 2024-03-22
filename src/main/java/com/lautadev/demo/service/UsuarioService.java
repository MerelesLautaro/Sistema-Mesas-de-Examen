package com.lautadev.demo.service;

import com.lautadev.demo.model.Rol;
import com.lautadev.demo.model.Usuario;
import com.lautadev.demo.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepository usuRepo;
    
    @Autowired
    private RolService rolService;
    
    @Override
    public void crearUsuario(Usuario usuario) {
        if (usuario.getRol() != null && usuario.getRol().getId() != null) {
            Long rolId = usuario.getRol().getId();
            Rol rol = rolService.findRol(rolId);
            usuario.setRol(rol);
        }
        usuRepo.save(usuario);
    }
    @Override
    public List<Usuario> traerUsuario() {
        List<Usuario> listaUsuarios = usuRepo.findAll();
        return listaUsuarios;
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = usuRepo.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuRepo.deleteById(id);
    }

    @Override
    public void editarUsuario(Usuario usuario) {
        this.crearUsuario(usuario);
    }

    @Override
    public Usuario login(Usuario usuario) {
        List<Usuario> listaUsuarios = this.traerUsuario();
        for (Usuario usu : listaUsuarios) {
            if (usuario.getNombre_usuario().equals(usu.getNombre_usuario())
                    && usuario.getContrasenia_usuario().equals(usu.getContrasenia_usuario())) {
                return usu; // Devolver el usuario encontrado en la lista
            }
        }
        return null; // Si no se encuentra coincidencia, devolver null
    }

}
