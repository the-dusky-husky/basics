package abstractFactory.factories;

import abstractFactory.products.*;

/**
 * Created by abhisheks on 24-04-2020.
 */
public class VictorianFurniture implements FurnitureFactory {

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
