package com.hello.springcloud.alibaba.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zrj
 * @date 2021/1/20
 * @since V1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}
