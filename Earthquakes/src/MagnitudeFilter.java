public class MagnitudeFilter implements Filter {
    String name;
    private double min;
    private double max;

    public MagnitudeFilter(String name, double min, double max) {
        this.name = name;
        this.min = min;
        this.max = max;
    } 

    @Override
    public boolean satisfies(QuakeEntry qe) {
        return qe.getMagnitude() >= min && qe.getMagnitude() <= max;
    }

    @Override
    public String getName() {
        return name;
    }
}
