class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = 30 * hour - 5.5 * minutes;
        if (angle < 0){angle = -1 * angle;}
        if (angle > 180.0){angle = 360 - angle;}
        return angle;
    }
}