import org.junit.*;
import static org.junit.Assert.*;
public class DepositTest{

  private Deposit initialDeposit;

// this method is executed before each test in the class, so as to execute some pre-conditions necessary for the test
  @Before
  public void instanciate(){
  initialDeposit = new Deposit(1234567890, 5000.00);
  }
}
