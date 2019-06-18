package com.example.springbootnetty.controller;

import com.example.springbootnetty.po.Users;
import com.example.springbootnetty.utils.IMoocJSONResult;
import io.netty.util.internal.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("u")
public class HelloController {
    @PostMapping("/registOrLogin")
    public IMoocJSONResult registOrLogin(@RequestBody Users user){
        if(StringUtils.isBlank(user.getUsername())||StringUtils.isBlank(user.getPassword())){
                        return IMoocJSONResult.errorMsg("用户名或密码不能为空");
        }
        return IMoocJSONResult.ok();
    }
}
