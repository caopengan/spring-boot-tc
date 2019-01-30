package com.tc.mapper;

import com.tc.entity.Resource;

public interface ResourceMapper {

    Resource getResourceByUrl(String requestUrl);
}
