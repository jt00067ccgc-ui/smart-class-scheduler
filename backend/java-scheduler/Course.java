public class Course {
    private String courseId;
    private String courseName;
    private String section;
    private String professorId;
    private List<String> enrolledStudents;

    // Constructor
    public Course(String courseId, String courseName, String section, String professorId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.section = section;
        this.professorId = professorId;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(String studentId) {
        this.enrolledStudents.add(studentId);
    }

    public void disenrollStudent(String studentId) {
        this.enrolledStudents.remove(studentId);
    }
}