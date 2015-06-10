import org.junit.Test;
import shaded.com.google.common.collect.HashMultimap;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class NameAgeClientConsumerTest {
    @Test
    public void demonstrateShadedSeam() {
        NameAgeClient client = new NameAgeClient();

        // shaded type is exposed to consumers
        shaded.com.google.common.collect.Multimap<String, Integer> nameAges =
                HashMultimap.create();
        nameAges.put("jon", 10);

        client.addAll(nameAges);

        assertThat(client.maxAge("jon"), equalTo(10));
    }
}
