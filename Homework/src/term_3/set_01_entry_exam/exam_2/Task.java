package term_3.set_01_entry_exam.exam_2;

import java.util.Date;

public class Task extends BoardItem {
    String assignee;

    public Task(String title, Date dueDate, String assignee) {
        super(title, dueDate, Status.todo);
        setAssignee(assignee);
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        if (assignee.length() <= 2) throw new IllegalArgumentException();
        this.assignee = assignee;
    }

    @Override
    public Status moveForward() {
        if (status.equals(Status.todo)) {
            status = Status.inprogress;
            return status;
        }

        if (status.equals(Status.inprogress)) status = Status.done;
        return status;
    }

    @Override
    public Status moveBackward() {
        if (status.equals(Status.inprogress)) {
            status = Status.todo;
            return status;
        }
        if (status.equals(Status.done)) status = Status.inprogress;
        return status;
    }
}
