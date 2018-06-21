package com.fright.security;

import com.fright.model.sys.SysUser;
import com.fright.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("用户名不能空！");
        }

        SysUser user = sysUserRepository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("用户不存在！");

        return user;
    }
}
