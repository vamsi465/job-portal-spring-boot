package com.vamsi.springProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
    @Min(1)
    private int jobId;
    @NotBlank
private String JobTitle;
    @NotBlank
private String company;
    @NotBlank
private String location;

}
