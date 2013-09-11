/**
 * Created with IntelliJ IDEA.
 * User: marko
 * Date: 05.08.13
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
public class CollectionTester {

    public static CollectionTester instance = null;

    public CollectionTester(){
        instance=this;
    }

    public static void main(String [] args){

        CollectionTester coltest = new CollectionTester();

    }

    public void giveInstanceTo(){

    }

    public static CollectionTester getInstance(){
        if(instance==null) return null;
        else return instance;
    }
}
