interface ClosureTest {
    public int calculate(int input);
    
}

public class ClosureTestDemo {

    public ClosureTest genData() {
        int closureVar = 10;
        ClosureTest ct = (n) -> {
            return n + closureVar;
        };
        return ct;
    }

    public int testClosure(ClosureTest ct)  {
        return ct.calculate(90);
    }

    public static void main(String argsp[]) {
        ClosureTestDemo ctDemo = new ClosureTestDemo();
        System.out.println(ctDemo.testClosure(ctDemo.genData()));
    }
}

