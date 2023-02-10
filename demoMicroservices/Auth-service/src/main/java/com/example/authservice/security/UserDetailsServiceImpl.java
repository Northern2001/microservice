package com.example.authservice.security;

import com.example.authservice.repository.UserRepository;
import com.example.authservice.untity.CustomUserDetails;
import com.example.authservice.untity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private BCryptPasswordEncoder encoder;

    private UserRepository userRepository;
    @Autowired
    public void AuthServiceApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            if ("admin".equals(username)) {
                return new CustomUserDetails();
                throw new UsernameNotFoundException(username);
            }else{
                throw new UsernameNotFoundException("Username: " + username + " not found");
            }

    }
}