import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class NameAgeClientConsumerTest {
    @Test
    public void demonstrateUnshadedSeam() {
        NameAgeClient client = new NameAgeClient();

        HashMultimap<String, Integer> nameAges = HashMultimap.create();
        nameAges.put("jon", 10);

        client.addAll(nameAges);

        assertThat(client.maxAge("jon"), equalTo(10));
    }
}
