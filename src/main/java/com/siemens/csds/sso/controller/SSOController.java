package com.siemens.csds.sso.controller;
import com.siemens.csds.sso.bean.ResultBean;
import com.siemens.csds.sso.pojo.qo.UserQo;
import com.siemens.csds.sso.pojo.vo.UserVo;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class SSOController{

    @RequestMapping(value = {"/","/index"})
    public String index(Map<String, Object> model){

        model.put("time", new Date());
        model.put("message", "hello jsp");
        return "index";
    }

    @GetMapping(value = "/user/{userId}")
    @ResponseBody
    public ResultBean<String> getUser(HttpServletRequest request, HttpServletResponse response,@PathVariable(value="userId",required = false) String userId){

        log.info("get request:{}",userId);
        return new ResultBean<String>(userId);

    }


    @PostMapping(value = "/user/{userId}")
    @ResponseBody
    public ResultBean<UserVo> createUser(HttpServletRequest request, HttpServletResponse response,@PathVariable(value="userId",required = false) String userId,
            @RequestBody UserQo userQo){

        log.info("post request:{}",userQo.getName());
        UserVo userVo= UserVo.builder().name(userQo.getName()).build();
        return new ResultBean<UserVo>(userVo);

    }
}