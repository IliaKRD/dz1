import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10));
        boxes.add(new HeavyBox(20));
        boxes.add(new HeavyBox(30));
        for (HeavyBox box : boxes)
        {
            System.out.println(box);
        }
        boxes.set(0, new HeavyBox(1));
        boxes.remove(boxes.size()-1);
        for (HeavyBox box : boxes)
        {
            System.out.println(box);
        }
        Iterator<HeavyBox> iterator = boxes.iterator();
        while (iterator.hasNext())
        {
            HeavyBox text = iterator.next();
            System.out.println(text);
        }
        for (int i =0; i< boxes.size(); i++)
        {
            System.out.println(boxes.get(i));
        }
        boxes.clear();
    }
}