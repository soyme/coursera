public class MinMagFilter implements Filter {
    private String name;
    private double min;
    
    public MinMagFilter(String name, double min) {
        this.name = name;
        this.min = min;
    }

    @Override
    public boolean satisfies(QuakeEntry qe) { 
        return qe.getMagnitude() >= min;
    }

    @Override
    public String getName() {
        return name;
    }
}
