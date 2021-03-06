package com.tc.serviceImpl;

import com.tc.entity.Resource;
import com.tc.mapper.ResourceMapper;
import com.tc.service.ResourceService;
import org.springframework.stereotype.Service;

@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {

    @javax.annotation.Resource
    private ResourceMapper resourceMapper;

    @Override
    public Resource getResourceByUrl(String requestUrl) {
        return resourceMapper.getResourceByUrl(requestUrl);
    }
}
