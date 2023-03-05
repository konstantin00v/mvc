package com.konstantin.mvc.entity;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table( name = "order")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int order_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @Column( name = "purchase_amount")
    private int purchaseAmount;

    @Override
    public String toString() {
        return "OrderBook{" +
                ", client=" + client+
                ", purchaseAmount=" + purchaseAmount +
                '}';
    }

    public Order() {
    }

    public Order(Client client, int purchaseAmount) {
        this.client = client;
        this.purchaseAmount = purchaseAmount;
    }
}