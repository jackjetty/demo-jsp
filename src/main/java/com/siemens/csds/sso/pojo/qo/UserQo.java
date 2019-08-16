package com.siemens.csds.sso.pojo.qo;

import com.siemens.csds.sso.base.BaseQo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserQo extends BaseQo{

    private static final long serialVersionUID = -6566695544675147704L;
    private String id;
    private String name;

}