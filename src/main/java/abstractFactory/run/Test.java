package abstractFactory.run;

import abstractFactory.factories.FurnitureFactory;
import abstractFactory.factories.ModernFactory;
import abstractFactory.factories.VictorianFurniture;
import abstractFactory.products.Chair;

/**
 * Created by abhisheks on 23-04-2020.
 */
public class Test {

    public static void main(String[] args) {

        FurnitureFactory furnitureFactory=startup();
        System.out.println(furnitureFactory.createChair());
        System.out.println(furnitureFactory.createSofa());
        System.out.println(furnitureFactory.createTable());
    }

    //use confiruation by application top provide furniture factory to client
    private static FurnitureFactory startup() {

        FurnitureFactory furnitureFactory = new VictorianFurniture();
        return furnitureFactory;
    }
}
