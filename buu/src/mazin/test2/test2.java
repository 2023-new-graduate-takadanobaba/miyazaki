package mazin.test2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test2 {
    private VendingMachine2 sut;
    @Test
    public void ボタンを押したかどうかわかる(){
        // 準備 Arrange
        VendingMachine2 sut = new VendingMachine2();
        // 実行 act
        Button button = sut.getButton("コーラ");
        button.push();
        boolean isButtonPushed = sut.isButtonPushed();

        // 検証 Assert
        assertEquals(true,button.isButtonPushed);
    }
}
