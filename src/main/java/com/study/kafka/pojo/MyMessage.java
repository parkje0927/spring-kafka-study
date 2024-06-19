package com.study.kafka.pojo;

public record MyMessage(
        int id,
        int age,
        String name,
        String content
) {
}
