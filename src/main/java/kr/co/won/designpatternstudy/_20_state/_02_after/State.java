package kr.co.won.designpatternstudy._20_state._02_after;

public interface State {

     void addReview(String review, Student student);

     void addStudent(Student student);
}
