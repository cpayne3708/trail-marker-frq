
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runner
{
    
    public static void main(String[] args) {
        int[] elevations = new int[]{25,30,30,35,30,40};
        Trail t = new Trail(elevations);
        print(t.isLevelTrailSegment(0,4)); //true
        
        elevations = new int[]{25,55,0,29,60,17};
        t = new Trail(elevations);
        print(t.isDifficult());  //true
    }
    
    public static void print(Object o) {
        System.out.println(o);
    }
}
