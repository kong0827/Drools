package com.kxj.entity;/**
 * @author xiangjin.kong
 * @date 2020/4/7 9:51
 * @desc
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @ClassName Product
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2020/4/7 9:51
 * @Version 1.0
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String type;
    private int discount;
}
