package com.siemens.csds.sso.pojo.vo;

import com.siemens.csds.sso.base.BaseVo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Builder
@Getter
public class UserVo extends BaseVo{
    private static final long serialVersionUID = 2731659739947329815L;
    private String name;
}