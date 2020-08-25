package abstractFactory.factories;

import abstractFactory.products.*;

/**
 * Created by abhisheks on 24-04-2020.
 */
public class ModernFactory implements FurnitureFactory {

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
