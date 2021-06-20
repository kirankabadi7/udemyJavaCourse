public class OperatorsExamplesClass {
    public static void main(String[] args) {
        int varA = 6;
        int varB = 5;
        String varString = "This is my example string";
        boolean varIsCarDamaged = true;

        System.out.println("+++++++++++++++++ These are arithmetic operators +++++++++++++++++");
        int varAddition = varA +varB;
        System.out.println(" This is my addition result >> " + varAddition);
        int varSubtraction = varA - varB;
        System.out.println(" This is my subtraction result >> " + varSubtraction);
        int varDivision = varA / varB;
        System.out.println(" This is my division result >> " + varDivision);
        int varMultiplication = varA * varB;
        System.out.println(" This is my multiplication result >> " + varMultiplication);
        int varRemainder = varA % varB;
        System.out.println(" This is my remainder result >> " + varRemainder);

        System.out.println("+++++++++++++++++ These are relational operators +++++++++++++++++++");
        boolean varEquals = varA==varB;
        System.out.println(varEquals);
        boolean varGreater =varA>varB;
        System.out.println(varGreater);
        boolean varLesser = varA<varB;
        System.out.println(varLesser);
        boolean varGreaterEqual =varA>=varB;
        System.out.println(varGreaterEqual);
        boolean varLesserEqual =varA<=varB;
        System.out.println(varLesserEqual);
        boolean varNotEquals =varA != varB;
        System.out.println(varNotEquals);

        System.out.println("+++++++++++++ This is unary operator +++++++++++++++");
        int varIncrement =++varA;
        int varDecrement =--varB;
        System.out.println("My Increased value is >> " + varIncrement);
        System.out.println("My Decreased value is >> " + varDecrement);
        boolean varCarStatus = ! varIsCarDamaged;
        System.out.println("This is inverse of Car status >> " + varCarStatus);

        System.out.println("+++++++++++++++++++++++ This is Ternary operator in Java ++++++++++++++++++");
        int varTernaryOperator = varA>varB? 10:20;

        System.out.println("+++++++++++++++++++++ This is a logical operator in java +++++++++++++++++++");
        Boolean varRiskTaker = false;
        boolean varOR = varIsCarDamaged || varRiskTaker;
        System.out.println(" Will I risk this car ? >>> " + varOR);
        boolean varAND = varIsCarDamaged && varRiskTaker;
        System.out.println(" Will I risk this car ? >>> " + varAND);

    }
}
