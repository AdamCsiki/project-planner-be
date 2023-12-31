package com.adamc.eventplannerbe.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditTaskRequest {
    private String taskName;
    private String taskDetails;
}
