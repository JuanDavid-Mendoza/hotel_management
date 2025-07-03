package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.persistence.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsJpaService implements UserDetailsService {
    private final UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByNombreUsuario(username)
                .map(user -> User.builder().username(user.getNombreUsuario()).password(user.getContrasena())
                        .authorities("ROLE_USER").build())
                .orElseThrow(() -> new UsernameNotFoundException("No se encontró el usuario con el nombre: " + username));
    }
}
