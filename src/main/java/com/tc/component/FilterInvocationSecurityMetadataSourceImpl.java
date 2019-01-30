package com.tc.component;

import com.tc.entity.Role;
import com.tc.service.ResourceService;
import  com.tc.entity.Resource;
import com.tc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class FilterInvocationSecurityMetadataSourceImpl implements FilterInvocationSecurityMetadataSource{

    @Autowired
    private ResourceService resourceService;

    @Autowired
    private RoleService roleService;

    //接收用户请求的地址，返回访问该地址需要的所有权限
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation)o).getRequestUrl();
        //得到用户的请求地址,控制台输出一下
        System.out.println("用户请求的地址是："+requestUrl);
        //如果登录页面就不需要权限
        if("/login".equals(requestUrl)){
            return null;
        }

        Resource resource = resourceService.getResourceByUrl(requestUrl);
        if(resource == null){
            //如果没有匹配的url则说明大家都可以访问
            return SecurityConfig.createList("ROLE_LOGIN");
        }
        //将resource所需要到的roles按框架要求封装返回
        List<Role> roles = roleService.getRolesByResourceId(resource.getId());
        int size = roles.size();
        String[] values = new String[size];
        for (int i = 0;i<size;i++){
            values[i] = roles.get(i).getRole_name();
        }

        return SecurityConfig.createList(values);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
