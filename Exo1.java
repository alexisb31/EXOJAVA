public class Exo1 {
    public static void Superflue(){
        String expr1 = "(a + b) - (2 * c) | Les deuxiemes parentheses pour (2 * c) sont superflues";
        System.out.println(expr1);
        String expr2 = "(2 * x) / (y * z) | Les premieres parentheses pour (2 * x) sont superflues";
        System.out.println(expr2);
        String expr3 = "(x + 3) * (n % p) | Les deuxiemes parentheses pour (n % p) sont superflues";
        System.out.println(expr3);
        String expr4 = "(-a) / (-(b + c)) | Les premieres parentheses pour (-a) sont superflues";
        System.out.println(expr4);
        String expr5 = "(x / y) % (-z) | Les deuxiemes parentheses pour (-z) sont superflues";
        System.out.println(expr5);
        String expr6 = "x / (y % (-z)) | Les premieres parentheses pour (y...) sont superflues";
        System.out.println(expr6);
    }
    public static void main(String[]args){
        Superflue();
    }
}
