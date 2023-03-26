package kz.stargazer.arkham_horror_client.Mechanics;

import lombok.Data;

@Data
public class TestResult {
    private boolean failed = false;
    private int success;

    public TestResult(int success) {
        this.success = success;

    }

    public void checkFail(){
        if (success == 0) {
            failed = true;
        }
    }
}
