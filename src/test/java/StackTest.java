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
        describe("Given an new stack", () -> {
            beforeEach(() -> {
                stack = new Stack();
            });

            it("should be empty", () -> {
                expect(stack.isEmpty()).toEqual(true);
            });
            it("should throw an exception", () ->{
                expect(() -> {
                    stack.pop();
                }).toThrow(EmptyStackException.class);
            });
            it("after a push it should not be empty", () ->{
                stack.push(3);
                expect(stack.isEmpty()).toEqual(false);
            });
        });
        describe("Given a stack containing one element", () ->{
            beforeEach(() -> {
                stack = new Stack();
                stack.push(7);
            });
            describe("when popped", () -> {
                it("should be empty", () -> {
                    stack.pop();
                    expect(stack.isEmpty()).toEqual(true);
                });
            });
        });
    }
}
