package com.combination;

/**
 * 抽象根节点 对于客户端而言，只需针对抽象编码，无需关心具体子类是树节点还是叶子节点
 */
public abstract class Component {
    public abstract void add(Component component);
    public abstract void del(Component component);
    public abstract Component getComponent(int i);
    public abstract void operation();//业务方法
}
