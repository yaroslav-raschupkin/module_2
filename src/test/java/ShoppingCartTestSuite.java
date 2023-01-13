import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses( {CalculateDiscountTest.class, AppendFormattedTest.class, FormatTicketTest.class} )
public class ShoppingCartTestSuite {
}
