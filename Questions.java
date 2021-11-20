// Objective: Create Questions class to store data relating to the questions/options/correct answers
public class Questions {

    private String question; // holds the question the user will be asked  
    private String [] AnswChoices = new String[4] ; // using an array to store possible choices
    private int correctA; // to denote which option was correct in each Q


    // the constructor to instantiate the object
    public Questions(String ourQ, String answer1, String answer2, String answer3, String answer4,int ourA) { 
        question=ourQ;
        AnswChoices[0]=answer1; 
        AnswChoices[1]=answer2; 
        AnswChoices[2]= answer3; 
        AnswChoices[3]= answer4; 
        correctA=ourA;

    }
    // mimmic the default constructor 
    public Questions () {
        question=" Blank question"; 
        AnswChoices[0]=" Insert Possible Answer 1"; 
        AnswChoices[1]=" Insert Possible Answer 2"; 
        AnswChoices[2]=" Insert Possible Answer 3"; 
        AnswChoices[3]=" Insert Possible Answer 4"; 
        correctA=0;

    }
    // standard setters and getters for the class 
    public String getQ() {
        return  question;

    }
    public void setQ(String ourQ){
        question=ourQ;

    }
    
    public String getA1() {
        return  AnswChoices[0];

    }
    public void setA1(String answer1){
        AnswChoices[0]=answer1;

    }
    public String getA2() {
        return  AnswChoices[1];

    }
    public void setA2(String answer2){
        AnswChoices[1]=answer2;

    }
    public String getA3() {
        return  AnswChoices[2];

    }
    public void setA3(String answer3){
        AnswChoices[2]=answer3;

    }
    public String getA4() {
        return  AnswChoices[3];

    }
    public void setA4(String answer4){
        AnswChoices[3]=answer4;

    }
    public int getcorr() {
        return  correctA;

    }
    public void setcorr(int ourA){
        correctA=ourA;
    }
}
