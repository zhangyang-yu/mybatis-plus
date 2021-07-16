package com.zhangyang.mybatisplusproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@ToString
@TableName("cpec_batch_acpt_info")
public class CpecBatchAcptInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "承兑人名称")
    private String acptName;

    @ApiModelProperty(value = "承兑人代码")
    private String acptCode;

    @ApiModelProperty(value = "企业编号")
    private String entCode;

    @ApiModelProperty(value = "企业名称")
    private String entName;

    @ApiModelProperty(value = "企业英文名称")
    private String entNameEng;

    @ApiModelProperty(value = "企业社会信用代码")
    private String soccode;

    @ApiModelProperty(value = "承兑人开户行名称")
    private String dimAcptBranchName;

    @ApiModelProperty(value = "承兑人开户行行号")
    private String dimAcptBranchId;

    @ApiModelProperty(value = "票据号码")
    private String billNo;

    @ApiModelProperty(value = "承兑日期")
    private LocalDate dimAcptDay;

    @ApiModelProperty(value = "出票日期")
    private LocalDate dimIssueDay;

    @ApiModelProperty(value = "出票人名称")
    private String issueName;

    @ApiModelProperty(value = "票据到期日")
    private LocalDate expirDay;

    @ApiModelProperty(value = "票面金额（元）")
    private BigDecimal billAmount;

    @ApiModelProperty(value = "企业上传日期")
    private LocalDate entInsertDate;

    @ApiModelProperty(value = "企业上传时间")
    private LocalDateTime entInsertDatetime;

    @ApiModelProperty(value = "票据介质 ME01 纸票 ME02 电票")
    private String mediaType;

    @ApiModelProperty(value = "披露模式 默认2 1.系统自动披露，2.企业操作披露，3.不披露")
    private String billShowMode;

    @ApiModelProperty(value = "披露状态1.已披露，2.未披露")
    private String showStatus;

    @ApiModelProperty(value = "披露日期")
    private LocalDate showDate;

    @ApiModelProperty(value = "系统备注")
    private String remark;

    @ApiModelProperty(value = "企业信用评级信息链接")
    private String entCreditRateUrl;

    @ApiModelProperty(value = "录入时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "数据状态")
    private Integer status;

    @ApiModelProperty(value = "收票日期")
    private LocalDate dimRgtDay;

    @ApiModelProperty(value = "披露方式 1-系统推送未披露 2-企业自主填写")
    private String showType;
}
