import java.util.ArrayList;
import java.util.List;

public class MatchAllFilter implements Filter {
    List<Filter> filterList;

    public MatchAllFilter() {
        filterList = new ArrayList<Filter>();
    } 

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    @Override
    public boolean satisfies(QuakeEntry qe) {
        for (Filter filter : filterList) {
            if (!filter.satisfies(qe)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (Filter filter : filterList) {
            sb.append(filter.getName());
            sb.append(" ");
        }

        return sb.toString();
    }
}
