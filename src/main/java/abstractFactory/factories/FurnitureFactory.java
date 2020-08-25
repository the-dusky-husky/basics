package abstractFactory.factories;

import abstractFactory.products.Chair;
import abstractFactory.products.Sofa;
import abstractFactory.products.Table;

/**
 * Created by abhisheks on 24-04-2020.
 */
public interface FurnitureFactory {

    Table createTable();
    Chair createChair();
    Sofa createSofa();
}
