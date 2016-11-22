package variable.scope;

/**
 * Created by desair4 on 11/21/2016.
 */
public class Friend {

    //Access modifiers
    String iceCream;//Default scope : Can only be seen/accessed in that class and in that package/folder
    public String movies;   //open to everything.
    private String password = "dummy";// can access only inside this class

    /*  public void printPassword(){
          System.out.println(password);
      }
    */
    public void printMovies() {
        System.out.println(movies);
    }
}
