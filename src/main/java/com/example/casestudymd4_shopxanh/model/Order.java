package com.example.casestudymd4_shopxanh.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orderr")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private Date createAt;
    private Double money;

    private int status;

    public Order(User user, Date createAt, Double money, int status) {
        this.user = user;
        this.createAt = createAt;
        this.money = money;
        this.status = status;
    }

    public Order(Long id, User user, Date createAt, Double money, int status) {
        this.id = id;
        this.user = user;
        this.createAt = createAt;
        this.money = money;
        this.status = status;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
