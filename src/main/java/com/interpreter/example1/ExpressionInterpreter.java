package com.interpreter.example1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 表达式解释器类
 **/
public class ExpressionInterpreter {

    //Deque双向队列，可以从队列的两端增加或者删除元素
   private Deque<Expression>  numbers = new LinkedList<>();  //改

   
   //接收表达式进行解析
   public long interpret(String expression){

       String[] elements = expression.split(" ");

       int length = elements.length;

       //获取表达式中的数字
       for (int i = 0; i < (length+1)/2; ++i) {
           //在 Deque的尾部添加元素
           numbers.addLast(new NumExpression(elements[i])); //改
       }

       //获取表达式中的符号
       for (int i = (length+1)/2; i < length; ++i) {
           String operator = elements[i];
           //符号必须是 + - * / 否则抛出异常
           boolean isValid = "+".equals(operator) || "-".equals(operator)
                   || "*".equals(operator) || "/".equals(operator);
           if (!isValid) {
               throw new RuntimeException("Expression is invalid: " + expression);
           }

            //pollFirst()方法, 移除Deque中的第一个元素,并返回被移除的值
           Expression exp1 = numbers.pollFirst(); //改
           Expression exp2  = numbers.pollFirst();

           Expression result = null;  //运算结果

           //对number1和number2进行运算
           if (operator.equals("+")) {
               result = new PluExpression(exp1,exp2);
           } else if (operator.equals("-")) {
               result = new SubExpression(exp1,exp2);
           } else if (operator.equals("*")) {
               result = new MulExpression(exp1,exp2);
           } else if (operator.equals("/")) {
               result = new DivExpression(exp1,exp2);
           }

           //将运算结果添加到集合头部
           long num = result.interpret();
           numbers.addFirst(new NumExpression(num));
       }

       //运算完成numbers中应该保存着运算结果,否则是无效表达式
       if (numbers.size() != 1) {
           throw new RuntimeException("Expression is invalid: " + expression);
       }
       //移除Deque的第一个元素,并返回
       return numbers.pop().interpret();
   }
}
