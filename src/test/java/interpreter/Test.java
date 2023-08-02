package interpreter;


import com.interpreter.example.ExpressionInterpreter;

public class Test {
    @org.junit.Test
    public void test(){
        ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter();
        long interpret = expressionInterpreter.interpret("10 5 3 1 1 + - * /");
        System.out.println(interpret);
    }

    @org.junit.Test
    public void test1(){
        com.interpreter.example1.ExpressionInterpreter expressionInterpreter = new com.interpreter.example1.ExpressionInterpreter();
        long interpret = expressionInterpreter.interpret("10 5 3 1 1 + - * /");
        System.out.println(interpret);

    }
}
