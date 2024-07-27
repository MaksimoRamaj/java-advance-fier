package org.example.oop.annotations;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cat {
    private String name;
    private int age;
}
