package com.example.RentalAdsBoard.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "chats")
public class Chat extends BaseEntity<Chat>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chat_id")
    private Integer chatId;

    @Column(name = "user_from")
    String userFrom;

    @Column(name = "user_to")
    String userTo;

    @Column(name = "message")
    String message;


    @Override
    public Integer getId() {
        return chatId;
    }

    @Override
    public List<Chat> getList() {
        return null;
    }
}
