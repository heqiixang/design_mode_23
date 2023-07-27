package com.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点 是一个容器对象既可以包含树枝节点，也可以包含叶子节点
 */
public class Composite extends Component {
    //集合保存子节点的数据
    private ArrayList<Component> list = new ArrayList();
    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void del(Component component) {
        list.remove(component);
    }

    @Override
    public Component getComponent(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component component:list) {
            component.operation();
        }
    }
}
