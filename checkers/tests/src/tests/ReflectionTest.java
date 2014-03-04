package tests;

import java.io.File;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import checkers.util.test.ParameterizedCheckerTest;

/**
 * Tests the reflection resolution using a toy type system.
 * 
 * @author rjust
 *
 */
public class ReflectionTest extends ParameterizedCheckerTest {

    public ReflectionTest(File testFile) {
        super(testFile, tests.reflection.ReflectionTestChecker.class, "reflection", "-Anomsgtext");
    }

    @Parameters
    public static Collection<Object[]> data() { return testFiles("reflection"); }
}
