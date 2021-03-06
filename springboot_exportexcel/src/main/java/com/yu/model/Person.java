package com.yu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019/8/3.
 */
@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {


    private Integer id;
    private String name;
    private String phoneNum;
    private String address;
    private String outcome;
    private Integer money;
}