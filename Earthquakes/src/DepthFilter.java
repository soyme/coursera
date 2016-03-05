public class DepthFilter implements Filter {
    private String name;
    private double min;
    private double max;

    public DepthFilter(String name, double min, double max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean satisfies(QuakeEntry qe) {
        return qe.getDepth() >= min && qe.getDepth() <= max;
    }

    @Override
    public String getName() {
        return name;
    }


}
