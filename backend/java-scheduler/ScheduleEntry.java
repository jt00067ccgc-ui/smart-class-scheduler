package backend.java.scheduler;

public class ScheduleEntry {
    private String section;
    private String professor;
    private String room;
    private String timeSlot;
    private String day;
    private String subjectCode;

    public ScheduleEntry(String section, String professor, String room, String timeSlot, String day, String subjectCode) {
        this.section = section;
        this.professor = professor;
        this.room = room;
        this.timeSlot = timeSlot;
        this.day = day;
        this.subjectCode = subjectCode;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }
}