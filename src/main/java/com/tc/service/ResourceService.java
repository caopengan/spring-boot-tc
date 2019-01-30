package com.tc.service;

import com.tc.entity.Resource;

public interface ResourceService {

    Resource getResourceByUrl(String requestUrl);
}
