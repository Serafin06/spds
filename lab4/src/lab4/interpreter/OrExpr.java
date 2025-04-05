package lab4.interpreter;

import java.util.Map;

public class OrExpr implements Expression {

	private Expression left;
	private Expression right;

	public OrExpr(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Map<String, Boolean> context) {
		return left.interpret(context) || right.interpret(context); 
	}

}
