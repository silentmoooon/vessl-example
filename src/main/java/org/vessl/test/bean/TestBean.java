package org.vessl.test.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@ToString
public class TestBean {
    private int id;
    private String name;
    private int age;
    private LocalDateTime addTime;
}
