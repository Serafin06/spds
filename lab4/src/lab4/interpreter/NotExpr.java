package lab4.interpreter;

import java.util.Map;

public class NotExpr implements Expression {
	private Expression expr;

	public NotExpr(Expression expr) {
		this.expr = expr;
	}

	@Override
	public boolean interpret(Map<String, Boolean> context) {
		return !expr.interpret(context); // Wyrażenie "nie"
	}

}
