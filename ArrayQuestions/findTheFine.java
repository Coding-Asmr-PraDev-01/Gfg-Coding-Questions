/*
  Question => 
    Given an array of penalties fine[], an array of car numbers car[], and also the date.
    The task is to find the total fine which will be collected on the given date. 
    Fine is collected from odd-numbered cars on even dates and vice versa.
*/

public long totalFine( long n, long date, long car[], long fine[]){
    long fined = 0;
    for(int i = 0; i < car.length; i++){
        if(date % 2 != 0){
            if(car[i] % 2 == 0){
                fined += fine[i];
            }
        }else {
            if(car[i] % 2 != 0){
                fined += fine[i];
            }
        }
    }
    return fined;
}
