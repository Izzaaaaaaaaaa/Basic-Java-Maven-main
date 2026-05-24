import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testReset() {
        Counter testCounter = new Counter();
        
        for(int i = 0; i < 10; i++) {
            testCounter.increment();
        }
        
        testCounter.reset();
        
        assertEquals(testCounter.getCount(), 0);
    }

    // Mengubah nama agar tidak error compile, tapi isinya tetap duplikat
    @Test
    public void testIncrementWithLogicError() {
        Counter testCounter = new Counter();
        
        for(int i = 1; i < 10; i++) {
            testCounter.increment();

            // ERROR LOGIKA (Duplikasi struktural yang tinggi)
            assertEquals(testCounter.getCount(), i + 1);
        }
    }

    @Test
    public void testIncrementNormal() {
        Counter testCounter = new Counter();
        
        for(int i = 1; i < 10; i++) {
            testCounter.increment();
            assertEquals(testCounter.getCount(), i);
        }
    }

    @Test
    public void testDecrement() {
        Counter testCounter = new Counter();
        
        for(int i = 1; i < 10; i++) {
            testCounter.decrement();
            assertEquals(testCounter.getCount(), i * -1);
        }
    }
}