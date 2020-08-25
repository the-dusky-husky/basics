package factory;

import factory.phoneImpl.Phone;
import factory.phoneImpl.SamsungS10;
import factory.phoneImpl.SamsungS8;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class SamsungFactory implements PhoneFactory {

    @Override
    public Phone createPhone(String model) {
        if (model.equals("samsungs8"))
            return new SamsungS8();
        if (model.equals("samsungs10"))
            return new SamsungS10();
        return null;
    }
}
