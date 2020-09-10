package co.yixiang.modules.order.vo;

import lombok.*;

import java.io.Serializable;

/**
 * @ClassName OrderCountDTO
 * @Author hupeng <610796224@qq.com>
 * @Date 2019/10/30
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserOrderCountVo implements Serializable {
    //订单支付没有退款 数量
    private Integer orderCount;
    //订单支付没有退款 支付总金额
    private Double sumPrice;
    //订单待支付 数量
    private Integer unpaidCount;
    private Integer unshippedCount; //订单待发货 数量
    private Integer receivedCount;  //订单待收货 数量
    private Integer evaluatedCount;  //订单待评价 数量
    private Integer completeCount;  //订单已完成 数量
    private Integer refundCount;   //订单退款
}
