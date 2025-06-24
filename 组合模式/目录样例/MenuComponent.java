package 组合模式.目录样例;
public abstract class MenuComponent {
    protected String name;
    protected int level;
    
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void removeMenuComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();

}
