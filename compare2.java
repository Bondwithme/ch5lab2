
/**
 * Write a description of class compare2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class compare2
{
    public static Integer largest(Integer i1, Integer i2) {
        if(i1.compareTo(i2) > 0) {
            return i1;
        }
        else {
            return i2;
        }
    }
}
