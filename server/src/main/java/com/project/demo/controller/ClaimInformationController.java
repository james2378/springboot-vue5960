package com.project.demo.controller;

import com.project.demo.entity.ClaimInformation;
import com.project.demo.service.ClaimInformationService;
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
 * 认领信息：(ClaimInformation)表控制层
 *
 */
@RestController
@RequestMapping("/claim_information")
public class ClaimInformationController extends BaseController<ClaimInformation, ClaimInformationService> {

    /**
     * 认领信息对象
     */
    @Autowired
    public ClaimInformationController(ClaimInformationService service) {
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
