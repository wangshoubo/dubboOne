package com.debug.mooc.dubbo.one.server.controller;

import com.debug.mooc.dubbo.one.enums.StatusCode;
import com.debug.mooc.dubbo.one.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RequestMapping(value = "/add")
@Controller
public class BaseController {
     static final Logger log = LoggerFactory.getLogger(BaseController.class);
     private static final String prefix ="base";
     @RequestMapping(value=prefix+"/one",method = RequestMethod.GET)
     @ResponseBody
     public BaseResponse one(@RequestParam String parms){
          BaseResponse response = new BaseResponse(StatusCode.SUCCESS);
          try{
               response.setData(parms);
          }catch (Exception e){
               response = new BaseResponse(StatusCode.FAIL);
          }
          return response;
     }

}
