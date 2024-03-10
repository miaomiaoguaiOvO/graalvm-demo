//package com.mmg.common.configs;
//
//import com.mmg.common.mapper.WebUserMapper;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.mapper.MapperFactoryBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MapperConfig {
//
//    @Autowired
//    private SqlSessionFactory sqlSessionFactory;
//
//    @Bean
//    public MapperFactoryBean<WebUserMapper> userMapper() {
//        MapperFactoryBean<WebUserMapper> factoryBean = new MapperFactoryBean<>();
//        factoryBean.setMapperInterface(WebUserMapper.class);
//        factoryBean.setSqlSessionFactory(sqlSessionFactory);
//        return factoryBean;
//    }
//}
