import com.mscharhag.oleaster.runner.OleasterRunner;
import com.titusnachbauer.stack.Stack;
import org.junit.runner.RunWith;

import java.util.EmptyStackException;

import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;
import static com.mscharhag.oleaster.matcher.Matchers.*;

@RunWith(OleasterRunner.class)
public class StackTest {
    private Stack stack;
    {
        beforeEach(() -> {
            stack = new Stack();
        });
        describe("A new stack", () -> {
            it("should be empty", () -> {
                expect(stack.isEmpty()).toEqual(true);
            });

            it("throws an exception when you try to pop", () -> {
                expect(() -> {
                    stack.pop();
                }).toThrow(EmptyStackException.class);
            });

            it("should not be empty after push", () -> {
                stack.push(2);
                expect(stack.isEmpty()).toEqual(false);
            });
        });
        describe("A stack containing one element", () -> {
            beforeEach(() -> {
                stack = new Stack();
                stack.push(5);
            });
            it("should return the previously pushed number when popped", () -> {
                expect(stack.pop()).toEqual(5);
            });
            it("should be empty after pop", () -> {
                stack.pop();
                expect(stack.isEmpty()).toEqual(true);
            });
        });
        describe("A stack containing two elements", () -> {
            beforeEach(() -> {
                stack = new Stack();
                stack.push(4);
                stack.push(17);
            });
        });
    }
}
