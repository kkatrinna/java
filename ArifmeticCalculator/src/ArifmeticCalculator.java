public class ArifmeticCalculator {
    private int a;
    private int b;
    public ArifmeticCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(EnamOperation operation) {
        switch (operation) {
            case ADD: {
                return a+b;
            }
            case SUBTRACT: {
                return a-b;
            }
            case MULTIPLY: {
                return a*b;
            }
        }
        return 0;
    }
}
