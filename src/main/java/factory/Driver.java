package factory;

import factory.phoneImpl.Phone;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class Driver {

    public static void main(String[] args) {

        PhoneFactory phoneFactory = new IPhoneFactory();
        Phone phone = phoneFactory.createPhone("iphonex");
        System.out.println(phone);

    }
}
