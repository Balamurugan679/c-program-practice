#include <stdio.h>
int main(){
    float item_price = 0.0f;
    char name[30];
    int count = 0;
    char currency = '$';
    float total = 0.0f;
    printf("The Shopping cart calculatorpizza \n");
    printf("The item name : ");
    scanf("%[^\n]", name);
    printf("price of the item :");
    scanf("%f", &item_price);
    printf("how many items : ");
    scanf("%d", &count);
    total = item_price * count;
    printf("your total will be for the item %s will be %c %0.2f\n", name, currency, total);
    return 0;
}