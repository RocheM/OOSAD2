#include <iostream>
#include "firstlib.h"
#include <string>
using namespace std;

int main()
{

	int ndays;
	string loc;

	printGreeting();

	cout << "Enter number of days (1-3)" << endl;
	cin >> ndays;

	weatherForecast(ndays);
	
	cout << "Enter a location:" << endl;
	cin >> loc;

	cout << getMyLocation(loc);


	return 0;
}
