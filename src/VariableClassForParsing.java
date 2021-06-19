public class VariableClassForParsing {
    public static void main(String[] args) {
        byte varByte =2;
        short varShort =10;
        int varInteger =1234;
        float varFloat =23.34f;
        long varLong = 12323122132L;
        double varDouble =1232323213;
        char varChar ='E';
        System.out.println( "My byte is " + varByte);
        System.out.println("My short is " + varShort);
        System.out.println("My int is " + varInteger);
        System.out.println("My float is " + varFloat);
        System.out.println("My long is " + varLong);
        System.out.println("My double is " + varDouble);
        System.out.println("My char is " + varChar );
        String varString ="This is my string example";
        System.out.println("String ?? >>>> " + varString);
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
        int convertFloat =(int) varFloat;
        float convertDouble =(float)varDouble;
        System.out.println("Check if string has same words ? >> " + varString.contains("example"));
        System.out.println("Convert our string to uppercase >> " + varString.toUpperCase());
        System.out.println("This is my Converted value of float >> " + convertFloat);
        System.out.println("This is my Converted value of double >> " + convertDouble);



    }
}
