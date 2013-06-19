package com.gof.mode.behavior.interpreter;

import java.util.Stack;

import org.junit.Test;

import com.gof.entity.mode.behavior.interpreter.Context;
import com.gof.entity.mode.behavior.interpreter.Expression;
import com.gof.entity.mode.behavior.interpreter.NonterminalExpression;

public class InterpreterTest {

	@Test
	public void test() {
	    String expression = "2";  
        char[] charArray = expression.toCharArray();  
        Context ctx = new Context();  
        Stack<Expression> stack = new Stack<Expression>();  
        for(int i=0;i<charArray.length;i++){  
        	stack.push(new NonterminalExpression());
            //进行语法判断，递归调用  
        }  
        Expression exp = stack.pop();  
        exp.interpreter(ctx);  
	}

}
