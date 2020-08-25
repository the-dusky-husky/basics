package factory;

import com.sun.org.apache.regexp.internal.RE;
import factory.phoneImpl.IPhoneS;
import factory.phoneImpl.IphoneX;
import factory.phoneImpl.Phone;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class IPhoneFactory implements PhoneFactory {

    @Override
    public Phone createPhone(String model) {
        if (model.equals("iphonex"))
            return new IphoneX();
        if (model.equals("iphones"))
            return new IPhoneS();
        return null;
    }
}
