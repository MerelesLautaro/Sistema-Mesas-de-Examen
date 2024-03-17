package com.lautadev.demo.service;

import com.lautadev.demo.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    public void crearUsuario(Usuario usuario);
    public List<Usuario> traerUsuario();
    public Usuario findUsuario(Long id);
    public void eliminarUsuario(Long id);
    public void editarUsuario(Usuario usuario);
}
