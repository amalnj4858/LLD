package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class BallFlyWeightFactory {
    private static final Map<String, Ball> ballFlyweightCache = new HashMap<>();

    public static Ball getBall(String color, String radius) {
        StringBuilder ballHash = new StringBuilder();
        ballHash.append(color);
        ballHash.append(radius);
        String ballString = ballHash.toString();
        if(ballFlyweightCache.containsKey(ballString)) {
            return ballFlyweightCache.get(ballString);
        }
        Ball ball = new Ball(color, radius);
        ballFlyweightCache.put(ballString, ball);
        return ball;
    }
}
