package com.backendMarch.librarymanagementsystem.DTO;

import com.backendMarch.librarymanagementsystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentRequestDto {

    private String name;

    private String email;

    private int age;

    private Department department;
}
