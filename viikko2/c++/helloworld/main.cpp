#include <iostream>
#include "Opiskelija.h"
#include "Harjoittelija.h"

using namespace std;

int main(){

	Opiskelija* maija = new Harjoittelija("Maija", "22222", "GoFore", 2000);
	maija->tulostaTiedot();

	Harjoittelija* pekka = new Harjoittelija("Pekka", "33333", "Nokia", 2000);
	pekka->tulostaTiedot();

	//Luodaan opiskelija stackiin (automaattisesti vapautettava)
	/*
	Opiskelija pekka{"Kalle", "12345 "};
	pekka.tulostaTiedot();

	//Luodaan opiskelija heappin
	Opiskelija* jarkko = new Opiskelija("Jarkko", "33212"); // new tekee muistinvarauksen
	jarkko->tulostaTiedot();
	delete jarkko;

	cout<<"Hello world!" <<endl;
	
*/	delete maija;
	delete pekka;
	return 0;
}