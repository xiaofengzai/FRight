package com.fright.security;

import com.fright.model.sys.SysUser;
import com.fright.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("用户名不能空！");
        }

        SysUser user = userRepository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("用户不存在！");

        return user;
    }
}
