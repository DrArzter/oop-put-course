#include <iostream>
using namespace std;
#include <string>

class glass
{

public:

    string brand;
    int weight;
    int height;
    int volume;

    glass(string b, int w, int h, int v){

        brand=b;
        weight=w;
        height=h;
        volume=v;

    }

    glass()
    {
        cout << "Enter the brand: \n";
        cin >> brand;
        cout << "Enter the weight: \n";
        cin >> weight;
        cout << "Enter the heught: \n";
        cin >> height;
        cout << "Enter the volume: \n";
        cin >> volume;
    }

    void display()
    {
        cout << "Brand: " << brand << "\tWeight: " << weight << "\tgrams\tHeight: " << height << " centimeters\t" << "\tVolume:" << volume << " cubic centimeters\n";
    }
};

int main()
{
    cout << "Here is an example glass:\n";
    glass glass2 ("Aboba",5,15,500);
    cout << "Brand: " << glass2.brand << "\tWeight: " << glass2.weight << "grams\t Height: " << glass2.height << " centimeters\tVolume: " << glass2.volume << " cubic centimeters\n\n";
    cout << "Create your own glass!\n";
    glass glass1;
    glass1.display();

    return 0;
}
