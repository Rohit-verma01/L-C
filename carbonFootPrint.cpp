#include <iostream>
#include <string>
using namespace std;

class EmailEntity {
private:
    string email;
    int inbox;
    int sent;
    int spam;

public:
    EmailEntity() : inbox(0), sent(0), spam(0) {}

    void getInput() {
        cout << "Enter your email: ";
        cin >> email;
        cout << "Enter the number of mail in your inbox: ";
        cin >> inbox;
        cout << "Enter the number of mail in your sent mail: ";
        cin >> sent;
        cout << "Enter the number of mail in your spam mail: ";
        cin >> spam;
    }

    void calculateCarbonFootprint() {
        double inboxCarbonFootprint = (inbox * 4.0) / 1000;
        double sentCarbonFootprint = (sent * 4.0) / 1000;
        double spamCarbonFootprint = (spam * 0.3) / 1000;
        double totalCarbonFootprint = inboxCarbonFootprint + sentCarbonFootprint + spamCarbonFootprint;

        cout << "emailId: " << email << endl;
        cout << "inbox: " << inboxCarbonFootprint << " KG" << endl;
        cout << "sent: " << sentCarbonFootprint << " KG" << endl;
        cout << "spam: " << spamCarbonFootprint << " KG" << endl;
        cout << "Total Carbon Footprint of " << email << " is " << totalCarbonFootprint << " KG" << endl;
    }
};
