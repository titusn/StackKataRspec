import com.mscharhag.oleaster.runner.OleasterRunner;
import com.titusnachbauer.stack.Stack;
import org.junit.runner.RunWith;

import java.util.EmptyStackException;

import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;
import static com.mscharhag.oleaster.matcher.Matchers.*;

@RunWith(OleasterRunner.class)
public class StackTest {
    private Stack stack = new Stack();
    {
        describe("A new stack", () -> {
            it("should be empty", () -> {
                expect(stack.isEmpty()).toEqual(true);
            });

            it("throw an exception when you try to pop", () -> {
                expect(() -> {
                    stack.pop();
                }).toThrow(EmptyStackException.class);
            });
        });
    }
}
