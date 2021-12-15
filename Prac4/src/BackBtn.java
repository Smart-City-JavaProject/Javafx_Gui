
import java.io.*;
import java.util.*;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class BackBtn {
    static Stack<Scene> stk = new Stack<Scene>();

    static void stack_push(Scene stack) {
        stk.push(stack);
    }

    static Scene stack_pop() {

        Scene y = (Scene) stk.pop();
        System.out.println(y);
        return y;

    }

    public static void show() {
        Stage st = new Stage();
        st.setScene(stack_pop());
        st.setTitle("Smart City");
        st.show();
    }
}
