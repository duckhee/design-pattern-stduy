package kr.co.won.designpatternstudy._16_iterator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// iterator
public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> internalIterator;


    public RecentPostIterator(Board board) {
        List<Post> posts = board.getPosts();
        Collections.sort(posts, (c1, c2) -> c2.getCreatedDateTime().compareTo(c1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }

    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return internalIterator.next();
    }
}
