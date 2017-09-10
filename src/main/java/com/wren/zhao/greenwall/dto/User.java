package com.wren.zhao.greenwall.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wren.zhao on 2017/9/10.
 */
@Data
@NoArgsConstructor
public class User {
    private Long id;
    private String hscode;
    private String openid;
    private Integer status;
    private String sessionId;
    
}
