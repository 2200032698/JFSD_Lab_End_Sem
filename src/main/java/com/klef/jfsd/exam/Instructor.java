package com.klef.jfsd.exam;

public class Instructor {
    private int instructorId;
    private String name;
    private String email;
    private String phoneNumber;

    public Instructor() {}

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Instructor [instructorId=" + instructorId + ", name=" + name +
               ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
