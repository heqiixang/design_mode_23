package com.visitor;

/**
 * 访问者接口
 * @author spikeCong
 * @date 2022/10/18
 **/
public interface Visitor {

    public void visit(Candy candy);  //糖果重载方法

    public void visit(Wine wine);  //酒类重载方法

    public void visit(Fruit fruit);  //水果重载方法
}
