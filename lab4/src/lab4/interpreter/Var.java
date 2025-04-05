package lab4.interpreter;

import java.util.Map;

public class Var implements Expression {
	private String name;

	public Var(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(Map<String, Boolean> context) {
		return context.getOrDefault(name, false); // Pobiera wartość zmiennej z kontekstu
	}

}
