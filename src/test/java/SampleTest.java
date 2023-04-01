import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class SampleTest {
    @Test
    @DisplayName("assertThatのテスト")
    void addTest() {
        Sample sample = new Sample();
        assertThat(sample.add(1,1)).isEqualTo(2);
    }
}