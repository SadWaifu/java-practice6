public class Euro implements Conversion {
    private static final double fRate = 33.08;

    public double getConvert(double arg_num) {
        return (fRate * arg_num);
    }
}
