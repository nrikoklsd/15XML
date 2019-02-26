package comparator;

import model.Gun;

import java.util.Comparator;
// task 7
public class GunComparator implements Comparator<Gun> {
    public int compare(Gun o1, Gun o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
//    @Override
//    public int compare(Gun o1, Gun o2) {
//        return Double.compare(o1.getChars().getAlcFraction(), o2.getChars().getAlcFraction());
//    }
}
