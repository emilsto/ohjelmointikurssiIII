#pragma once
#include <string>
using namespace std;

class Opiskelija{
private:
    /* data */
    string mNimi;
    string mOpiskelijanumero;
    unsigned short int mOpintopisteet;
public:
    Opiskelija(/* args */);
    Opiskelija(string aNimi, string aOpiskelijanumero);
    ~Opiskelija(); //kutsutaan automaattisesti kun olio vapautetaan

    //Metodit (API)
    void setNimi( string aNimi);
    void setOpiskelijanumero(string aOpiskelijanumero);
    void setOpintipisteet(unsigned short int aOpintopisteet);

    string getNimi();
    string getOpiskelijanumero();
    unsigned short int getOpintopisteet();

    void tulostaTiedot();


};
