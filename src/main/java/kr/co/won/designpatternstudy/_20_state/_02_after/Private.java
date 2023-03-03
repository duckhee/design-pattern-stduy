package kr.co.won.designpatternstudy._20_state._02_after;

public class Private implements State {

    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        // . 이 3개 정도 나오면 refactoring의 냄새(코드가 잘못된 위치에 있다고 한다.)가 난다고 표현을 한다. => 하나의 refactoring 요소가 될 수 있다.
        if (this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("private 코스는 수강하는 학생만 리뷰를 남길 수 있습니다.");
        }
    }

    @Override
    public void addStudent(Student student) {
        if(student.isAvailable(this.onlineCourse)){
            this.onlineCourse.getStudents().add(student);
        }else{
            throw new UnsupportedOperationException("private 코스를 수강할 수 없습니다.");
        }
    }
}
