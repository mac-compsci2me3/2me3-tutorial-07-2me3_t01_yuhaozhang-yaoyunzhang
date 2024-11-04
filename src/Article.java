import java.util.ArrayList;
import java.util.List;  

public class Article extends ArticleComponent {
    private List<ArticleComponent> components = new ArrayList<>();

    public void addComponent(ArticleComponent component) {
        components.add(component);
    }

    public void removeComponent(ArticleComponent component) {
        components.remove(component);
    }
    // Factory Method to return an ArticleIterator for the components
    public ArticleIterator iterator() {
        return new ArticleIterator(components);
    }

    @Override
    public void display() {
        System.out.println("Displaying Article:");
        for (ArticleComponent component : components) {
            component.display();
        }
    }

}