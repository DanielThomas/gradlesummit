import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class NameAgeClient {
    Multimap<String, Integer> agesByName = HashMultimap.create();

    public void addAll(HashMultimap<String, Integer> agesByName) {
        this.agesByName.putAll(agesByName);
    }

    public Integer maxAge(String name) {
        return agesByName.get(name).stream().max(Integer::max).orElse(0);
    }
}
