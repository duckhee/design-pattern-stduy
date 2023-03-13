package kr.co.won.designpatternstudy._03_behavioral_patterns._20_state._02_after;

import java.util.ArrayList;
import java.util.List;

// Context가 된다.
public class OnlineCourse {

    private State state;

    private List<Student> students;

    private List<String> reviews;

    public OnlineCourse() {
        this.state = new Draft(this);
        this.students = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void changeState(State state) {
        this.state = state;
    }
}
