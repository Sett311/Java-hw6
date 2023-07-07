import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "100,380,10",
            "9700,100000,1",
            "9900,10000,0",
            "0,99,0",
            "1,100,1"
    })
    public void gottaChekTheSelectionRules(int rangeMin, int rangeMax, int expected) {
        SQRService service = new SQRService();

        int actual = service.caclSqrtRange(rangeMin, rangeMax);
        Assertions.assertEquals(expected, actual);
    }
}
