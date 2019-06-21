package com.debug.mooc.dubbo.one.server.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.debug.mooc.dubbo.one.entity.ItemInfo;
import com.debug.mooc.dubbo.one.enums.StatusCode;
import com.debug.mooc.dubbo.one.mapper.ItemInfoMapper;
import com.debug.mooc.dubbo.one.response.BaseResponse;
import com.debug.mooc.dubbo.one.service.IDubboItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Path;
import java.util.List;

@Service(protocol = {"dubbo","rest"},validation = "true",timeout=20000,version="1.0")
@Path("moocOne")
public class DubboItemService implements IDubboItemService {
    private static final Logger log = LoggerFactory.getLogger(DubboItemService.class);
    @Autowired
    private ItemInfoMapper mapper;
    @Override
    @Path("/item/list")
    public BaseResponse listItems() {
        BaseResponse response = new BaseResponse(StatusCode.SUCCESS);
        try {
            List<ItemInfo> itemInfos = mapper.selectAll();
            response.setData(itemInfos);
        }catch (Exception e){
            e.printStackTrace();
            response= new BaseResponse(StatusCode.FAIL);
        }
        return response;
    }
}
