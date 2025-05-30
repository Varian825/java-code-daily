
package runtime;

import data.Brand;
import data.BrandList;
import data.CarList;
import ui.Menu;

public class CarManager {

    public static void main(String[] args) {
        BrandList bl = new BrandList();
        String brandUrl = "C:\\K19JavaF1\\17-Van-PE-17-2-2022\\brands.txt";
        String carUrl = "C:\\K19JavaF1\\17-Van-PE-17-2-2022\\cars.txt";
        bl.loadFromFile(brandUrl);
        //bl.updateBrand();
        //bl.addBrand();
        //bl.listBrands();//xem lại
        /*
        Brand brand = bl.getUserChoice();
        System.out.println("Brand da chon ne: \n" + brand);
        */
        CarList cl = new CarList(bl);
        cl.loadFromFile(carUrl);
        
        Menu menu = new Menu("Car management system menu");
        menu.addnewoption("List all brands");
        menu.addnewoption("Add a new brand");
        menu.addnewoption("Search a brand based on its ID");
        menu.addnewoption("Update a brand");
        menu.addnewoption("Save brands to the file, named brands.txt");
        menu.addnewoption("List all cars in ascending order of brand names");
        menu.addnewoption("List cars based on a part of an input brand name");
        menu.addnewoption("Add a car");
        menu.addnewoption("Remove a car based on its ID");
        menu.addnewoption("Update a car based on its ID");
        menu.addnewoption("Save cars to file, named cars.txt");
        
        while(true){
            menu.print();
            int choice = menu.getChoice();
            switch(choice){
                case 1: {
                    bl.listBrands();
                    break;
                }
                case 2: {
                    bl.addBrand();
                    break;
                }
                case 3: {
                    bl.searchBrand();
                    break;
                }
                case 4: {
                    bl.updateBrand();
                    break;
                }
                case 5: {
                    bl.saveToFile(brandUrl);
                    break;
                }
                case 6: {
                    cl.listCars();
                    break;
                }
                case 7: {
                    cl.printBasedBrandName();
                    break;
                }
                case 8: {
                    cl.addCar();
                    break;
                }
                case 9: {
                    cl.removeCar();
                    break;
                }
                case 10: {
                    cl.updateCar();
                    break;
                }
                case 11: {
                    cl.saveToFile(carUrl);
                    break;
                }              
            }
        }
    }
}
