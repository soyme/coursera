public class PhaseFilter implements Filter {
    private String name;
    private String where;
    private String phrase;

    public PhaseFilter(String name, String where, String phrase) {
        this.name = name;
        this.where = where;
        this.phrase = phrase;
    } 

    @Override
    public boolean satisfies(QuakeEntry qe) {
        return "start".equals(where) && qe.getInfo().startsWith(phrase)
                || "end".equals(where) && qe.getInfo().endsWith(phrase)
                || "any".equals(where) && qe.getInfo().contains(phrase);
    }

    @Override
    public String getName() {
        return name;
    }
}
