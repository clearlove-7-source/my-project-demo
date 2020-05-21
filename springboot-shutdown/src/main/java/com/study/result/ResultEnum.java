package com.study.result;


/**
 * 结果枚举
 */
public enum ResultEnum {
    /**
     * 操作成功！
     */
    CODE_1(1, "操作成功！"),
    /**
     * 操作失败！
     */
    CODE_2(2, "操作失败！"),
    /**
     * 调用xxx服务失败！
     */
    CODE_3(3, "调用xxx服务失败！"),
    /**
     * 验证码错误或已过期！
     */
    CODE_4(4, "验证码错误或已过期！"),
    /**
     * 用户名或者密码错误！
     */
    CODE_5(5, "用户名或者密码错误！"),


    /**
     * token无效,禁止访问!
     */
    CODE_401(401, "token无效,禁止访问!"),
    /**
     * 授权失败,禁止访问！
     */
    CODE_403(403, "授权失败,禁止访问！"),

    /**
     * 请求超时，请稍后再试！
     */
    CODE_504(504, "请求超时，请稍后再试！"),

    /**
     * 服务器神游中！
     */
    CODE_666(666, "服务器神游中！");


    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

//    CODE_4(4, "账号或者密码错误！"),
//    CODE_5(5, "图像数据为空！"),
//    CODE_6(6, "图像数据传输异常！"),
//    CODE_7(7, "图片上传大小不能超过5M！"),
//    CODE_8(8, "图片上传格式错误！"),
//    CODE_9(9, "手机号码不能为空！"),
//    CODE_10(10, "短信验证码不能为空！"),
//    CODE_11(11, "短信验证码错误！"),
//    CODE_12(12, "登陆类型不能为空！"),
//    CODE_13(13, "openId不能为空！"),
//    CODE_14(14, "该手机号码已被注册！"),
//    CODE_15(15, "userId不能为空！"),
//    CODE_16(16, "姓名不能为空！"),
//    CODE_17(17, "身份证号码不能为空！"),
//    CODE_18(18, "身份证正面照不能为空！"),
//    CODE_19(19, "身份证反面照不能为空！"),
//    CODE_20(20, "行驶证正面照不能为空！"),
//    CODE_21(21, "行驶证反面照不能为空！"),
//    CODE_22(22, "该用户还没通过审核！"),
//    CODE_23(23, "账号不能为空！"),
//    CODE_24(24, "密码不能为空！"),
//    CODE_25(25, "该账号已被占用！"),
//    CODE_26(26, "参数错误！"),
//    CODE_50(50, "过期时间不能为空！"),
//    CODE_51(51, "分类名称不能为空！"),
//    CODE_52(52, "分类排序不能为空！"),
//    CODE_53(53, "分类名重复！"),
//    CODE_54(54, "该分类下有商品不能删除！"),
//    CODE_55(55, "分类编号为空！"),
//    CODE_56(56, "商品名称不能为空！"),
//    CODE_57(57, "商品描述不能为空！"),
//    CODE_59(59, "商品价格不能为空！"),
//    CODE_60(60, "商品详情图不能为空！"),
//    CODE_61(61, "商品价格不能为空！"),
//    CODE_62(62, "新增商品失败！"),
//    CODE_63(63, "商品编号不能为空！"),
//    CODE_65(65, "商品数量不能为空！"),
//    CODE_66(66, "购物车编号不能为空！"),
//    CODE_67(67, "商品数量不能为空！"),
//    CODE_68(68, "商品不存在！"),
//    CODE_69(69, "地址编号不能为空！"),
//    CODE_70(70, "地址信息不存在！"),
//    CODE_71(71, "订单编号不能为空！"),
//    CODE_72(72, "交易单号不能为空！"),
//    CODE_73(73, "支付类型不能为空！"),
//    CODE_74(74, "省市区不能为空！"),
//    CODE_75(75, "地址不能为空！"),
//    CODE_76(76, "参数传递错误！"),
//    CODE_77(77, "联系人不能为空！"),
//    CODE_78(78, "联系方式不能为空！"),
//    CODE_79(79, "邮编不能为空！"),
//    CODE_101(101, "该账号已被禁用！"),
//    CODE_102(102, "该账号正在审核中！"),
//    CODE_120(120, "您有订单还在进行中！"),
//    CODE_121(121, "消息类型不能为空！"),
//    CODE_122(122, "没有找到该订单信息！"),
//    CODE_123(123, "该订单已支付！"),
//    CODE_124(124, "该订单已取消！"),
//    CODE_127(127, "支付流水号不能为空！"),
//    CODE_128(128, "支付类型不能为空！"),
//    CODE_129(129, "该订单已支付或已取消！"),
//    CODE_130(130, "订单更新失败！"),
//    CODE_131(131, "支付金额出错！"),
//    CODE_201(201, "状态不能为空！"),
//    CODE_202(202, "发送的验证码的类型不能为空！"),
//    CODE_203(203, "验证码发送失败,联系管理员！"),
//    CODE_207(207, "修改密码不能为空！"),
//    CODE_208(208, "原密码不能为空！"),
//    CODE_209(209, "原密码不对！"),
//    CODE_401(401, "账号或者密码错误！"),
//    CODE_403(403, "没有获取授权！"),
//    CODE_404(404, "找不到该路径！"),
//    CODE_405(405, "请求方式错误！"),
//    CODE_415(415, "请求参数格式错误！"),
//    CODE_500(500, "服务器出错了，请联系后台开发人员！"),
//    CODE_1001(1001, "获取短信验证码失败！"),
//    CODE_1002(1002, "服务器数据异常！"),
//    CODE_9999(9999, "服务器无法处理请求！");