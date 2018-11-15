
/**
 * Write a description of class Trail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trail
{
    // instance variables - replace the example below with your own
    private int[] markers;

    /**
     * Constructor for objects of class Trail
     */
    public Trail(int[] markers)
    {
        this.markers = markers;
    }

    /**
     * @param start starting index of segment
     * @param end ending index of segment
     * @returns true if Trail does not vary by more than 10m in elevation
     */
    public boolean isLevelTrailSegment(int start,int end) {
        int min = markers[start];
        int max = markers[start];
        for (int i = start;i<=end;i++) {
            if (markers[i] < min) {
                min = markers[i];
            }
            if (markers[i] > max) {
                max = markers[i];
            }
        }
        return (max - min) <= 10;
    }

    /**
     * @returns true if Trail has more than three segments in which elevation changes more than 30m
     */
    public boolean isDifficult() {
        int numDifficult = 0;
        int lastElevation = markers[0];
        for (int i = 1;i<markers.length;i++) {
            if (Math.abs(markers[i] - lastElevation) >= 30) {
                numDifficult++;
            }
            lastElevation = markers[i];
        }
        return numDifficult >= 3;
    }
}
