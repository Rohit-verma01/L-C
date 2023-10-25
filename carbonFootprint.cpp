#include <iostream>
#include <string>
using namespace std;

struct EmailEntity {
    string email;
    int inbox;
    int sent;
    int spam;
};

void getCarbonFootprint(EmailEntity entity) {
    
        double inboxCarbonFootprint = (entity.inbox*4.0)/1000;
        double sentCarbonFootprint = (entity.sent*4.0)/1000;
        double spamCarbonFootprint = (entity.spam*0.3)/1000;
        double totalCarbonFootprint = inboxCarbonFootprint+sentCarbonFootprint+spamCarbonFootprint; 
        
        cout << "emailId: " << entity.email << endl;
        cout << "inbox: " << inboxCarbonFootprint << " KG" << endl;
        cout << "sent: " << sentCarbonFootprint << " KG" << endl;
        cout << "spam: " << spamCarbonFootprint << " KG" << endl;
        cout << "Total Carbon Footprint of " << entity.email << " is " << totalCarbonFootprint << " KG" << endl;
}

int main() {
    
    EmailEntity emailEntity;

    cout << "Enter your email: ";
    cin >> emailEntity.email;
    cout << "Enter the number of mail in your inbox : ";
    cin >> emailEntity.inbox;
    cout << "Enter the number of mail in your sent mail : ";
    cin >> emailEntity.sent;
    cout << "Enter the number of mail in your spam mail : ";
    cin >> emailEntity.spam;

    getCarbonFootprint(emailEntity);

    return 0;
}
