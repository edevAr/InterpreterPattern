public class SubtractExpression implements Expression {
    private String expression;
    public SubtractExpression(String expression){
        this.expression = expression;
    }
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.subtract(expression);
    }
}
