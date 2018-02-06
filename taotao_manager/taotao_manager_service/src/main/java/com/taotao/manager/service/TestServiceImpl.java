package com.taotao.manager.service;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.manager.mapper.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 胡家宇
 * @version 2.3
 * @description com.taotao.manager.service
 * @date 2018/2/6
 */
@Service
public class TestServiceImpl implements TestService {
   @Autowired
    private TestMapper testMapper;
    @Override
    public String queryDate() {
        return testMapper.queryDate();
    }
}
