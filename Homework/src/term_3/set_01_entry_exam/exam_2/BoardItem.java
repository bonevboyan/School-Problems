package term_3.set_01_entry_exam.exam_2;

import java.util.Date;

public abstract class BoardItem {
    String title;
    Date dueDate;
    Status status;


    public BoardItem(String title, Date dueDate, Status status) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    public void setTitle(String title) {
        if(title.length() <= 2) throw new IllegalArgumentException();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract Status moveForward();

    public abstract Status moveBackward();
}
