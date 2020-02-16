public class AddExpression implements Expression {
    private String expression;
    public AddExpression(String expression){
        this.expression = expression;
    }
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.add(expression);
    }
}
