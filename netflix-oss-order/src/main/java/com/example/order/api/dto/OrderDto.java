package com.example.order.api.dto;

import lombok.Getter;

public class OrderDto {

    @Getter
    public static class Post {
        private String name;
        private int price;
        private int amount;

        public Post() {
        }
    }
}
