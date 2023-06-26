package mazin.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    private VendingMachine sut;

    @BeforeEach
    public void Setup() {
        sut = new VendingMachine();
    }

    @Test
    public void ボタンを押したかどうかわかる() {
        // 準備 Arrange
        // 実行 act
        sut.pushButton();
        boolean isButtonPushed = sut.isButtonPushed();

        // 検証 Assert
        assertEquals(true, isButtonPushed);
    }

    @Test
    public void ボタンを押すとコーラが出る() {
        // 準備 Arrange
        // 実行 act
        boolean isButtonPushed = sut.isButtonPushed();

        // 検証 Assert
        assertEquals(false, isButtonPushed);
    }

    @Test
    public void コーラを返す() {
        // 準備 Arrange
        // 実行 act
        sut.pushButton();
        String beverage = sut.getBucket();

        // 検証 Assert
        assertEquals("コーラ", beverage);
    }

    @Test
    public void _１００円コインを投入したかどうかがわかる() {
        // 準備 Arrange
        sut.insertCoin(100);
        // 実行 act
        int remainingAmount = sut.getRemainingAmount();
        // 検証 Assert
        assertEquals(100, remainingAmount);
    }

    @Test
    public void _１００円コインを投入していない場合(){
        //準備 Arrange
        
        //実行 act
        int remainingAmount = sut.getRemainingAmount();
        //検証 Assert
        assertEquals(0,remainingAmount);
    }
}