public class USD implements Conversion {
    private static final double fRate = 27.17;

    public double getConvert(double arg_num) {
        return (fRate * arg_num);
    }
}
