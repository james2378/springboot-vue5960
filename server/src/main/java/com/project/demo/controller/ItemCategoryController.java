package com.project.demo.controller;

import com.project.demo.entity.ItemCategory;
import com.project.demo.service.ItemCategoryService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 物品类别：(ItemCategory)表控制层
 *
 */
@RestController
@RequestMapping("/item_category")
public class ItemCategoryController extends BaseController<ItemCategory, ItemCategoryService> {

    /**
     * 物品类别对象
     */
    @Autowired
    public ItemCategoryController(ItemCategoryService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
