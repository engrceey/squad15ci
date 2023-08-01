package com.projectreadiness.projectreadiness.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@ApiModel
@Data
public class TestDto {

    @NotBlank(message="name should not be empty")
    private String name;
}
