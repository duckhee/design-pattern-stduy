package kr.co.won.designpatternstudy._03_behavioral_patterns._20_state._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student keesun = new Student("keesun");
        keesun.addPrivate(onlineCourse);
        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("test", student);
        onlineCourse.addStudent(keesun);
        System.out.println("onlineCourse review = " + onlineCourse.getReviews());
        System.out.println("onlineCourse.getState() = " + onlineCourse.getState());
        System.out.println("onlineCourse.getStudents() = " + onlineCourse.getStudents());
    }
}
