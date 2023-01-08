#include <iostream>
#include <string>
#include <cassert>

class Game{

public:
    virtual std::string result() = 0;
};

class FakeFootballGame : public Game{

public:

    std::string result(){

        return "5:3";
    }
};

int main(){
    FakeFootballGame game = FakeFootballGame();
    assert(game.result() == "5:3");
    std::cout<<"Ok";
}
