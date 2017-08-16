import org.junit.*;
import static org.junit.Assert.*;
public class DepositTest{

  private Deposit initialDeposit;

// this method is executed before each test in the class, so as to execute some pre-conditions necessary for the test
  @Before
  public void instanciate(){
  initialDeposit = new Deposit(1234567890, 5000.00);
  }

  @Test
  public void deposit_instantiatesCorrectly_true() {
    assertEquals(true, initialDeposit instanceof Deposit);
  }

  @Test
  public void eachDepositIsInstantiatedCorrectlyWithAccountNumber_true() {
    assertEquals(1234567890, initialDeposit.getAccountNumber());
  }

  @Test
  public void eachDepositIsInstantiatedCorrectlyWithAmount_true(){
    assertEquals(5000.00,5000.99,0.99); initialDeposit.getAmount();
  }
}
