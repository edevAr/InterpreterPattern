public class InterpreterClient {
    private InterpreterEngine interpreterEngine;
    public InterpreterClient(InterpreterEngine e){
        interpreterEngine = e;
    }
    public int interpret(String input){
        Expression expression = null;
        if(input.toLowerCase().contains("add")){
            expression = new AddExpression(input);
        }else
        if(input.toLowerCase().contains("subtract")){
            expression = new SubtractExpression(input);
        }else{
            System.out.println("Syntax error...");
            return 0;
        }
        System.out.println(input);
        return expression.interpret(interpreterEngine);
    }
    public static void main(String[]args){
        InterpreterClient interpreterClient = new InterpreterClient(new InterpreterEngine());

        System.out.println("Result = "+interpreterClient.interpret("Add 12 and 13"));
        System.out.println("Result = "+interpreterClient.interpret("subtract 17 from 13"));
        System.out.println("Result = "+interpreterClient.interpret("Add 132 and 13"));
        System.out.println("Result = "+interpreterClient.interpret("sumar 132 and 13"));
    }
}
