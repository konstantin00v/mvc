package com.konstantin.mvc.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int client_id;

    @Column(name = "initials_client")
    private String initials_client;

    @Column(name = "birth_date")
    private String birth_date;

    @Override
    public String toString() {
        return "Client{" +
                ", initials_client='" + initials_client + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }

    public Client() {
    }

    public Client(String initials_client, String birth_date) {
        this.initials_client = initials_client;
        this.birth_date = birth_date;
    }
}
