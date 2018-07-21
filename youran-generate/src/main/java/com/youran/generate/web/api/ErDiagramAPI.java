package com.youran.generate.web.api;

import com.youran.common.pojo.vo.ReplyVO;
import com.youran.generate.pojo.vo.ErDiagramVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * <p>Title: 实体关系图</p>
 * <p>Description: </p>
 *
 * @author cbb
 * @date 2018/7/17
 */
public interface ErDiagramAPI {

    /**
     * ER图查看
     */
    @ApiOperation(value = "ER图查看")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "projectId", dataType = "int", value = "项目id", paramType = "query"),
        @ApiImplicitParam(name = "entityIds", dataType = "int", value = "实体id", paramType = "query"),
    })
    ReplyVO<ErDiagramVO> show(Integer projectId, List<Integer> entityIds);


}