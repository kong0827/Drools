package com.kxj.controller;/**
 * @author xiangjin.kong
 * @date 2020/4/7 9:59
 * @desc
 */

import com.kxj.entity.Product;
import com.kxj.service.JewelleryShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName JewelleryShopController
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2020/4/7 9:59
 * @Version 1.0
 **/
@RestController
public class JewelleryShopController {

    private final JewelleryShopService jewelleryShopService;

    @Autowired
    public JewelleryShopController(JewelleryShopService jewelleryShopService) {
        this.jewelleryShopService = jewelleryShopService;
    }

    @RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
    public Product getQuestions(@RequestParam(required = true) String type) {

        Product product = new Product();
        product.setType(type);
        jewelleryShopService.getProductDiscount(product);
        return product;
    }

}
