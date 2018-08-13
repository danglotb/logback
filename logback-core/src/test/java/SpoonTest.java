import org.junit.Test;
import spoon.Launcher;

/**
 * Created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 13/08/18
 */
public class SpoonTest {

    @Test
    public void testSpoon() throws Exception {
        final Launcher launcher = new Launcher();
        launcher.addInputResource("src/main/java");
        launcher.addInputResource("src/test/java");

        launcher.buildModel();
    }
}
