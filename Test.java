import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;
class Recursive<I> {
    public I func;
}
public class Test {
    public static Boolean[] hasPosNeg(List<Integer> list){
        boolean hasPog = false;
        boolean hasNeg = false;

        for (int i = 0; i < list.size(); i++) {
            hasPog = list.get(i) > 0;
            hasNeg = list.get(i) < 0;
        }

        return new Boolean[] {hasPog, hasNeg};
    }
    public static void main(String[] args) throws InterruptedException {
        hasPosNeg(Arrays.asList(-1,0,1));
    }
}
