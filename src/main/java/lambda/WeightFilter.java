package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhisheks on 16-05-2020.
 */
public class WeightFilter implements AppleFilterInterface{


    @Override
    public boolean applyFilter(Apple apple) {
        if (apple.getWeight()>=50)
            return true;
        return false;
    }
}