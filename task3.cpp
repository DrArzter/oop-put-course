#include <iostream>
#include <string>
using namespace std;

class Brand

{
private:
    string name;
    string country;

public:

    Brand(string b, string c)
    {
        name = b;
        country = c;
    }
    Brand(){};
};


class Vehicle
{

private:
    Brand brand;
    string model;
    string frame_type;
    double engine_volume;
    double weight;

public:

    Vehicle(Brand b, string m, string f, double e, double w)
    {
        brand = b;
        model = m;
        weight = w;
        frame_type = f;
        engine_volume = e;
    }

    void display()
    {

        cout << "\nModel: " << model << "\nFrame type: " << frame_type << "\nEngine power: " << engine_volume << " cubic liters\n" << "Weight: " << weight << " Tons";

    }

};

int main()

{
Brand brand("Mercedes-Benz", "Germany");
Vehicle vehicle1(brand,"E-Class","Coupe",3.50,2.5);
vehicle1.display();

}



