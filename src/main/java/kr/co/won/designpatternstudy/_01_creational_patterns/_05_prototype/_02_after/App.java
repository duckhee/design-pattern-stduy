package kr.co.won.designpatternstudy._01_creational_patterns._05_prototype._02_after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println("clone.getUrl() = " + clone.getUrl());

        // 동일한 Instance는 아니다.
        System.out.println(githubIssue != clone);
        // 하지만 값은 같아야하므로 equals()를 구현을 해줘야한다.
        System.out.println(clone.equals(githubIssue));
        // class type은 같아야한다.
        System.out.println(clone.getClass() == githubIssue.getClass());
    }
}
