package factory;

import factory.phoneImpl.Phone;

/**
 * Created by abhisheks on 24-05-2020.
 */
public interface PhoneFactory {

    Phone createPhone(String model);
}
