package com.debug.mooc.dubbo.one.server.controller;

import com.debug.mooc.dubbo.one.entity.ItemInfo;
import com.debug.mooc.dubbo.one.enums.StatusCode;
import com.debug.mooc.dubbo.one.mapper.ItemInfoMapper;
import com.debug.mooc.dubbo.one.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/add")
@Controller
public class BaseController {
     static final Logger log = LoggerFactory.getLogger(BaseController.class);
     private static final String prefix ="base";
     @Autowired
     private ItemInfoMapper mapper;
     @RequestMapping(value=prefix+"/one",method = RequestMethod.GET)
     @ResponseBody
     public BaseResponse one(@RequestParam String parms){
          BaseResponse response = new BaseResponse(StatusCode.SUCCESS);
          try{
               List<ItemInfo> itemInfos = mapper.selectAll();
               response.setData(itemInfos);
          }catch (Exception e){
               e.printStackTrace();
               response = new BaseResponse(StatusCode.FAIL);
          }
          return response;
     }

}
