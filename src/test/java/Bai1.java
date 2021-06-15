
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Bai1 {

    @Test
    public void testString(){
        String str= "You Only Live Once, But if You do it right, once is enough";
        assertThat(str).isEqualTo("You Only Live Once, But if You do it right, once is enough")
                .isNotNull();
    }
}
