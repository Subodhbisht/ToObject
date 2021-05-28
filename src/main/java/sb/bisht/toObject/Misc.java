package sb.bisht.toObject;

import sb.bisht.toObject.model.Order;

public class Misc {

    public static void main(String[] args) throws Exception {

        String s = "{\"userId\":1,\"order\":\"Samsung N\",\"price\":\"1000000\",\"orderPlacedOn\":1622130279662}";
        Order order = StringToObject.fromString(s, Order.class);
        System.out.println("Order must be empty for now"+ order);
    }
}