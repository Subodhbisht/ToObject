package sb.bisht.toObject.model;

import java.util.Date;

public class Order {

    private Long userId;
    private String order;
    private String price;
    private Date orderPlacedOn;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getOrderPlacedOn() {
        return orderPlacedOn;
    }

    public void setOrderPlacedOn(Date orderPlacedOn) {
        this.orderPlacedOn = orderPlacedOn;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", order='" + order + '\'' +
                ", price='" + price + '\'' +
                ", orderPlacedOn=" + orderPlacedOn +
                '}';
    }
}