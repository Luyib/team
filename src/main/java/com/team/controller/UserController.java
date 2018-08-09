package com.team.controller;

import com.google.gson.Gson;
import com.team.VO.ResultVO;
import com.team.entity.Users;
import com.team.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author 穿长裙的年代
 * 2018/8/7 21:41
 */
@RestController
@RequestMapping("/hi")
public class UserController {

    @Autowired
    private UserService userService;

    /** 返回json字符串. */
    @RequestMapping("/json")
    public String json(){
        Users user = userService.findOne(1);
        ResultVO resultVO = new ResultVO();
        resultVO.setData(user);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        Gson gson = new Gson();
        return gson.toJson(resultVO);
    }
}
