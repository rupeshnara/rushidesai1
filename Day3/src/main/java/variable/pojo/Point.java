package variable.pojo;

/**
 * Created by desair4 on 11/21/2016.
 * <p>
 * Plain old java objects -> focuses on encapsulation
 */
public class Point {
    //instance variables
    private String x;
    private Integer y;  //compare with int y
    private String password;
    private int distance;

/*    String restrictAccessOfX() {
        //Check some condtion
        boolean someCondition = true;
        if (someCondition) {
            return x;
        }else{
            return "Crap";
        }
    }
*/

    //Accessors
    public String getX() {
        //Check some condition
        boolean someCondition = true;
        if (someCondition) {
            return x;
        } else {
            return "Crap";
        }
    }

    //Mutators
    public void setX(String x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setDistance(int i) {
        distance = i;
    }
}
