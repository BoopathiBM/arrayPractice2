/*
 create a stiring array with days of the week
 find longest String
 */
package demo;

public class StringElement{
    public void stringElement(){
        String[] daysOfTheWeek = {"Sunday","Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saterday"};
        String dayWithMoastCharacter = "";
        for(String day : daysOfTheWeek){
            if(day.length() > dayWithMoastCharacter.length()){
                dayWithMoastCharacter = day ;
            }
        }
        System.out.println("Day with most number of character: "+ dayWithMoastCharacter);
        
        System.out.println("Days in Reverse Order: ");
        for(int  i = daysOfTheWeek.length - 1; i >0 ; i--){
            System.out.println(daysOfTheWeek[i]);
        }
    }
}