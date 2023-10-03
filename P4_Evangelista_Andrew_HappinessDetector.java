import com.controlStructures.*;
/*
    Name:       Andrew
    Date:       9/26
    Period:     4

    Is this lab fully working?  Yes
*/
public class P4_Evangelista_Andrew_HappinessDetector implements HappinessDetector{
    public boolean isHappy(int num, int a, int b) {
        return 
            num < 0 ? false :
            num > 30 && num < 54 ? true :
            num >= 81 && num <= 99 && num % 2 != 0 ? true :
            num < 16 ? !(num % a == 0 && num % b != 0) :
            num % a == 0 && num % b != 0;
    }
}
