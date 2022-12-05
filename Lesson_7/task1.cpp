#include <algorithm>
#include <fstream>
#include <iostream>
#include <string>

class elfes{

private:

    int max;
    int total;

public:

    elfes(std::string paath)
    {
        std::string input = paath;
        std::string line;
        std::fstream file(input);
        this -> max = 0;
        this -> total = 0;
        while(std::getline(file, line)) {
            if (line.size() == 0) {
                max = std::max(max, total);
                total = 0;
            } else {
                total += std::stoi(line);
            }
        }
    }

    void maximum_calories() {

        max = std::max(max, total);
        std::cout << max << '\n';
    }
};

int main(){
    elfes newelf("C:/Users/drarzter/CLionProjects/untitled2/Day01_test1.txt");
    newelf.maximum_calories();
    return 0;
}
