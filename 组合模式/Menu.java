package 组合模式;

import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> lists = new java.util.ArrayList<MenuComponent>();
    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }
    @Override
    public void print() {
        for(int i = 0; i < level; i++)
        {
            System.out.print('-');
        }
        System.out.println(name);
        for(MenuComponent menuComponent : lists)
        {
            menuComponent.print();
        }
    }
    @Override
    public void add(MenuComponent menuComponent) {
       lists.add(menuComponent);
    }

    @Override
    public void removeMenuComponent(MenuComponent menuComponent) {
        lists.remove(menuComponent);
    }
    @Override
    public MenuComponent getChild(int i) {
        return lists.get(i);
    }
    

}