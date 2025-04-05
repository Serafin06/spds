package lab4.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Spr {

	public static void main(String[] args) {

		Expression e = new AndExpr(new OrExpr(new Var("a"), new Var("b")), new NotExpr(new Var("c")));

		Map<String, Boolean> context = new HashMap<>();
		context.put("a", true);
		context.put("b", false);
		context.put("c", false);

		System.out.println(e.interpret(context));
	}

}
