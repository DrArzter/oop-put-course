#include <iostream>
class Truck{
public:
    int load; /* in kilograms */
    int fuel; /* in liters */
    int range_left; /*in kilometers*/
    int add_fuel; /*fuel to be added*/
    int add_load; /*kilograms to be added to the thruck*/
};
class loading_station{
public:
    int storage; /*current amount of storaged kilograms*/
};
class fuel_station{
public:
    int fuel_on_station;
};
int main() {
    Truck truck;
    fuel_station station1;
    loading_station loading1;
    truck.fuel=100;
    truck.add_fuel = 50;
    truck.load = 15000;
    truck.range_left = 100;
    truck.add_load = 6000;
    loading1.storage = 12000;
    station1.fuel_on_station = 500;

    std::cout <<"Truck fuel before station " << truck.fuel << std::endl;
    std::cout <<"Truck load before station " << truck.load << std::endl;
    truck.fuel=truck.fuel + truck.add_fuel;
    station1.fuel_on_station = station1.fuel_on_station - truck.add_fuel;
    truck.load=truck.load + truck.add_load;
    loading1.storage= loading1.storage - truck.add_load;
    std::cout <<"Truck fuel after station " << truck.fuel << std::endl;
    std::cout <<"Truck load after station " << truck.load << std::endl;
    std::cout << "_____________________________" << std::endl;
    std::cout <<"Fuel left on station " << station1.fuel_on_station << std::endl;
    std::cout <<"Goods left on station " << loading1.storage << std::endl;
    return 0;
}
