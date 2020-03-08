public class practice1_v_18 {

    public static void main(String[] args) {

        /*  BASIC OPERATORS
            addition- +
            subtraction- -
            multiplication- *
            division- /
            remainder- %
        */

        int num1= 34;
        int num2= 5;

        double n1=34;
        double n2=5;

        int result=0;

        result=num1+num2;

        System.out.println("Addition FALSE Result: " + num1 + num2 );

        /*  This simply concatenates the numbers instead of adding them.
            Parenthesis are required to distinguish between concatenation & operations.
        OR  Use variables to define the operation and use the variable.
        */

        System.out.println("Addition Result using a 'variable to define the operation': " + result);  // using variable to define operation.

        System.out.println("Addition Result: " + (num1 + num2));
        System.out.println("Subtraction Result: " + (num1 - num2));
        System.out.println("Multiplication Result: " + (num1 * num2));
        System.out.println("Division Result using 'int': " + (num1 / num2));

        /*  Divide using INT only gives the quotient.
            To get fractional values use DOUBLE.
         */
        System.out.println("Division Result using 'double': " + (n1 / n2));
        System.out.println("Remainder Result: " + (num1 % num2));

        /* RELATIONAL OPERATORS
            == comparision
            != not equal
            < less than
            > greater than
            <= less than or equal to
            >= grater than or equal to

            Relational operators are used in CONDITIONAL statements like IF, ELSE
         */

        if (num1==num2){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }

    }
}
