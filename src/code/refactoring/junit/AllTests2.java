package code.refactoring.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayListTest.class, FileReaderTest.class, JunitSimpleTest.class, VectorTest.class })
public class AllTests2 {

}
