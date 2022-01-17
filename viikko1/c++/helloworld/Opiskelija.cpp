#include "Opiskelija.h"
#include <iostream>
using namespace std;

Opiskelija::Opiskelija() : mNimi("tuntematon"), mOpiskelijanumero("0000"), mOpintopisteet(0)
{
    cout << "Opiskelijan oletusrakentaja" <<endl;
}

Opiskelija::Opiskelija(string aNimi, string aOpiskelijanumero)
: mNimi(aNimi), mOpiskelijanumero(aOpiskelijanumero), mOpintopisteet(0)
{
    cout <<"Opiskelijan 2 parametrinen rakentaja" <<endl; 
}

Opiskelija::~Opiskelija()
{
    cout <<"Opiskelija " << mNimi << " vapautettu muistista" << endl;
}

void Opiskelija::setNimi(string aNimi)
{
    mNimi = aNimi;  
}

void Opiskelija::setOpintipisteet(unsigned short int aOpintopisteet)
{
    mOpintopisteet = aOpintopisteet;
}

void Opiskelija::setOpiskelijanumero(string aOpiskelijanumero)
{
    mOpiskelijanumero = aOpiskelijanumero;
}

string Opiskelija::getNimi()
{
    return mNimi;
}

string Opiskelija::getOpiskelijanumero()
{
    return mOpiskelijanumero;
}

unsigned short int Opiskelija::getOpintopisteet()
{
    return mOpintopisteet;
}

void Opiskelija::tulostaTiedot()
{
 cout<<"Nimi: " << mNimi << endl;
 cout<<"Opiskelijanumero: " << mOpiskelijanumero <<endl;
 cout<<"Opintopisteet: " << mOpintopisteet <<endl;
}