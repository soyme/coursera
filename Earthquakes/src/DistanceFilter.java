public class DistanceFilter implements Filter {
    private String name;
    private Location city;
    private double maxDistance;

    public DistanceFilter(String name, Location city, double maxDistance) {
        this.name = name;
        this.city = city;
        this.maxDistance = maxDistance;
    }

    @Override
    public boolean satisfies(QuakeEntry qe) {
        return qe.getLocation().distanceTo(city) < maxDistance;
    }

    @Override
    public String getName() {
        return name;
    }
}
