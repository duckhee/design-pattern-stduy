package kr.co.won.designpatternstudy._01_creational_patterns._05_prototype._02_after;

import java.util.Objects;

public class GithubIssue implements Cloneable {
    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    // clone method 구현 -> shallow copy
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    // clone method 구현 -> deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        GithubRepository cloneRepository = new GithubRepository();
        cloneRepository.setUser(this.repository.getUser());
        cloneRepository.setName(this.repository.getName());
        GithubIssue cloneIssue = new GithubIssue(cloneRepository);
        cloneIssue.setId(this.getId());
        cloneIssue.setTitle(this.getTitle());
        return cloneIssue;
    }


    // equals 구현

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GithubIssue that)) return false;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
