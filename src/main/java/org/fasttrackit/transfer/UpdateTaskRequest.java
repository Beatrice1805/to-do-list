package org.fasttrackit.transfer;

import java.time.LocalDate;

// DTO (Data transfer object)
public class UpdateTaskRequest {

    private String description;
    private LocalDate deadline;
    private boolean done;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return "UpdateTaskRequest{" +
                "description='" + description + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
