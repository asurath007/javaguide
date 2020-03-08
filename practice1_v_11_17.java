public class practice1_v_11_17 {

    public static void main(String[] args) {

        //variables
        String firstname = "Asutosh ";
        String lastname = "Rath";


        //single line comment

        /*
        block comment
        ...
        ...
         */

        //different types of variables

        //integers- upto 2^32 value
        int age = 21;

        //byte- small byte (-128 to 127)
        byte b= -128;

        //short- 2x byte (-32768 to 32767)
        short s= -32768;

        //float- 1.34, 3.14, 5.96... add f to end to distinguish b/w float & double
        float pi=3.14f;

        //double- decimal values
        double d=2666666.3556669696;

        //char- character- single quotes to differentiate from string
        char c= 'h';

        //boolean
        boolean b1=true;

        System.out.println("my byte is " + b);
        System.out.println("my short is " + s);
        System.out.println("my float is " + pi);
        System.out.println("my  double is " + d);
        System.out.println("my char is " + c);
        System.out.println("my boolean is " + b1);
        System.out.println("My name is " + firstname + lastname + ". I am " + age + " years old." );
    }
}
