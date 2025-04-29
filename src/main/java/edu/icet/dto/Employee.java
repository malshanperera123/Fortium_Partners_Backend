package edu.icet.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private String department;
    private Double salary;
}
