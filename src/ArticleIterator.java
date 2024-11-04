import java.util.Iterator;
import java.util.List;

public class ArticleIterator implements Iterator<ArticleComponent> {
    private List<ArticleComponent> components;
    private int index = 0;

    // Constructor that takes a list of ArticleComponent objects
    public ArticleIterator(List<ArticleComponent> components) {
        this.components = components;
    }

    // Override hasNext() to check if more components are available
    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    // Override next() to return the next component and increment the index
    @Override
    public ArticleComponent next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return components.get(index++);
    }
}
