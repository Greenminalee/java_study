package week01_02.sub02;

public class Sub02 {

    public int num1 = 0;
    public int num2 = 0;

    public Sub02(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int calculate(String symbol){
        int result = 0;

        switch (symbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }

}
