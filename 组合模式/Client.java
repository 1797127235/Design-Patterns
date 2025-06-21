package 组合模式;

public class Client {
    public static void main(String[] args) {
        // 菜单一级菜单
        MenuComponent menu1 = new Menu( "菜单管理",  2);
        menu1.add(new MenuItem( "页面访问",  3));
        menu1.add(new MenuItem( "操作日志",  3));
        menu1.add(new MenuItem( "数据采集",  3));
        menu1.add(new MenuItem( "网络采集",  3));
        // 移除重复的"网络采集"

        MenuComponent menu2 = new Menu( "权限管理",  2);
        menu2.add(new MenuItem( "页面访问",  3));
        menu2.add(new MenuItem( "权限管理",  3));

        MenuComponent menu3 = new Menu("角色管理",  2);
        menu3.add(new MenuItem( "页面访问",  3));
        menu3.add(new MenuItem( "清单角色",  3));
        menu3.add(new MenuItem("权限管理",  3));

        // 总菜单---顶级菜单
        MenuComponent component = new Menu( "系统管理",  1);
        // 添加一级菜单到总菜单
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        component.print();
    }
}
