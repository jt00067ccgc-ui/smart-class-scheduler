package backend.java.scheduler;

import java.util.List;

public class Professor {
    private String professorId;
    private String name;
    private List<String> subjectCodes;
    private List<String> preferredDays;
    private int currentLoad;

    public Professor(String professorId, String name, List<String> subjectCodes, List<String> preferredDays, int currentLoad) {
        this.professorId = professorId;
        this.name = name;
        this.subjectCodes = subjectCodes;
        this.preferredDays = preferredDays;
        this.currentLoad = currentLoad;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjectCodes() {
        return subjectCodes;
    }

    public void setSubjectCodes(List<String> subjectCodes) {
        this.subjectCodes = subjectCodes;
    }

    public List<String> getPreferredDays() {
        return preferredDays;
    }

    public void setPreferredDays(List<String> preferredDays) {
        this.preferredDays = preferredDays;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }
}