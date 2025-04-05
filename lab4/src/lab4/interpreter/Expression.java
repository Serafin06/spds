package lab4.interpreter;

import java.util.Map;

public interface Expression {
	public boolean interpret(Map<String, Boolean> context);
}