package sb.bisht.toObject.model;

import sb.bisht.toObject.annotations.Required;

import java.util.Date;

public class Order {

    @Required
    private Long userId;

    @Required
    private String order;

    @Required
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