/**
 * Created by ЭМПРиО on 14.10.2016.
 */
public class Player {
    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}
