package kr.co.won.designpatternstudy._02_structural_patterns._09_decorator._02_after;

// concrete Class
public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println("comment = " + comment);
    }
}
