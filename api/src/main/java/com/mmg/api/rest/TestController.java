package com.mmg.api.rest;

import com.mmg.common.entity.WebUser;
import com.mmg.common.service.OrderService;
import com.mmg.common.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private WebUserService webUserService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(orderService.test());
    }

    @GetMapping("/user")
    public ResponseEntity<List<WebUser>> user() {
        return ResponseEntity.ok(webUserService.webUser());
    }
}
