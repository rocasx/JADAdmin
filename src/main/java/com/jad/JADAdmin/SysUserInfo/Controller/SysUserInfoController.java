package com.jad.JADAdmin.SysUserInfo.Controller;

import com.jad.JADAdmin.Common.Model.JsonResult;
import com.jad.JADAdmin.Common.Model.SearchLayer;
import com.jad.JADAdmin.SysUserInfo.Service.SysUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "用户管理相关接口")
@RestController
@RequestMapping("SysUserInfo")
public class SysUserInfoController {
    @Resource
    private SysUserInfoService service;

    @ApiOperation("分页获取用户接口")
    @GetMapping("getList")
    public JsonResult getList(SearchLayer search) {
        return service.getList(search);
    }
}
