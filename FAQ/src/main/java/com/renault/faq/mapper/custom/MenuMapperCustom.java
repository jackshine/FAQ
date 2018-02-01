package com.renault.faq.mapper.custom;

import org.apache.ibatis.annotations.Param;

import com.renault.faq.entity.custom.MenuCustom;

import java.util.List;

public interface MenuMapperCustom {
    //获得菜单列表
    public List<MenuCustom> listMenu(@Param(value = "status") Integer status) throws Exception;
}
