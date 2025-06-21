package 策略模式;

public class SaleMan {
    strategy s;
    public SaleMan(strategy s) {
        this.s = s;
    }
    public void setStrategy(strategy s) {
        this.s = s;
    }
    public void sale() {
        s.show();
    }

}
