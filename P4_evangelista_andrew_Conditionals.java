/*
    Name:       Andrew
    Date:       8/24
    Period:     4

    Is this lab fully working?  Yes
*/
class P4_evangelista_andrew_Conditionals {
    public static void main(String[] args) {
        int teacher = 2;
        int computer = 36;
        int student = 34;
        int table = 6;
        if(teacher==1 && computer >= student && student%2 == 0 && student/table <= 6){
            System.out.print("Classroom is valid"); 
    
        } else {
            System.out.print("Classroom is invalid");
        }
    }
}