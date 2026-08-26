package com.vamsi.springProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
    private int jobId;
private String JobTitle;
private String company;
private String location;

}
