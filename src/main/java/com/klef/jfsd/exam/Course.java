package com.klef.jfsd.exam;

public class Course {
    private int courseId;
    private String courseName;
    private int credits;
    private Instructor instructor;

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits +
               ", instructor=" + instructor + "]";
    }
}
