package com.trongtin.shopapp.services.orderdetails;


import com.trongtin.shopapp.dtos.OrderDetailDTO;
import com.trongtin.shopapp.exceptions.DataNotFoundException;
import com.trongtin.shopapp.models.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail createOrderDetail(OrderDetailDTO newOrderDetail) throws Exception;
    OrderDetail getOrderDetail(Long id) throws DataNotFoundException;
    OrderDetail updateOrderDetail(Long id, OrderDetailDTO newOrderDetailData)
            throws DataNotFoundException;
    void deleteById(Long id);
    List<OrderDetail> findByOrderId(Long orderId);


}
