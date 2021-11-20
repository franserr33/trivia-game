// Objective: Create a Trivia Game that will ask 10 pre-determined questions, keep score, then declare the winner
import java.util.Scanner; // for user input
public class TriviaGame { 
    public static void main(String[] args) throws Exception {
        Scanner keyboard= new Scanner(System.in);  // create scanner obj to take input
        String player1,player2; // strings for their names
        // int to hold how high their scores went, initilize to zero assume all were answered incorrectly
        int score1=0;
        int score2=0; 
        // storing their inputs seperately in arrays 
        int[] user1picks= new int[5];
        int[] user2picks= new int[5];
        // Ask for and store both players' names
        System.out.print("Helo, Player One enter your name"); 
        player1= keyboard.nextLine();       
        System.out.println("Thank you. Now, Player Two Enter your name:") ;
        player2=keyboard.nextLine();
        // Instantiating 10 Question obeject with trivia questions of my liking 
        Questions Q1= new Questions ("Speed skating originated in which country?","1. Germany", 
                                    "2. Netherlands", "3. Grece", "4. Mexico",2) ;
        Questions Q2= new Questions ("What is the most densely populated state in the U.S.?","1. Connecticut",
                                     "2. New Jersey", "3. Rhode Island", "4.Maryland",2) ;
        Questions Q3= new Questions ("Where was albert Einstein born?","1. Greenland", "2. France", "3. Britain", "4. Germany",4) ;
        Questions Q4= new Questions ("What is electricity?","1. Flow of water", "2. Flow of air", 
                                     "3. Flow of electrons", "4. Flow of atoms",3) ;
        Questions Q5= new Questions ("what is the approximate speed of sound in km/h?","1. ~320km/h",
                                     "2. ~120km/h", "3. ~620km/h", "4. ~1200km/h",4) ;
        Questions Q6= new Questions ("How do people usually tell a tree's age?","1. Counting rings on the trunk", 
                                     "2. To measure the widith of the trunk","3. To count number of leaves", "4. To measure its height", 1) ;
        Questions Q7= new Questions ("What is the sun mainly composed of?","1. Lava", "2. Molten rock", "3. Gas", "4. Water", 3) ;
        Questions Q8= new Questions ("Winterfell was historically home to which house in Game of Thrones?",
                                     "1.Lannisters", "2. Starks", "3. Tully's", "4. Targaryens", 2 ) ;
        Questions Q9= new Questions ("Which company is known for the Mario video games?","1. Microsoft", 
                                     "2. Sony", "3. SEGA", "4. Nintendo", 4 ) ;
        Questions Q10= new Questions ("First Disney movie in color?","1. Sleeping Beauty", 
                                        "2. Snow White and the Seven Dwarfs", "3. Cars", "4. Bambi", 2 ) ;
        /* Create two arryas to hold the correct answers, I will use this to compare to the user's input 
           Structured like this because I already pre-determinded who would get what questions asked to them */
        int [] correctAnswers1={Q1.getcorr(),Q3.getcorr(),Q5.getcorr(),Q7.getcorr(),Q9.getcorr()};  
        int [] correctAnswers2 = {Q2.getcorr(),Q4.getcorr(), Q6.getcorr(), Q8.getcorr(), Q10.getcorr()};

        /* All five questions for player one then player two gets a turn
         I will let Player One get the odd questions and Player 2 get the even questions */
        System.out.println(player1+" you will begin by answering five trivia quetions");
        System.out.println (Q1.getQ()); 
        System.out.println (Q1.getA1() + "\n" + Q1.getA2()+"\n" + Q1.getA3()+"\n" + Q1.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user1picks[0]=keyboard.nextInt(); 
        //Player 1's 2nd question 
        System.out.println(Q3.getQ()); 
        System.out.println (Q3.getA1() + "\n" + Q3.getA2()+"\n" + Q3.getA3()+"\n" + Q3.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user1picks[1]=keyboard.nextInt(); 
        // Player 1's 3rd question 
        System.out.println(Q5.getQ()); 
        System.out.println (Q5.getA1() + "\n" + Q5.getA2()+"\n" + Q5.getA3()+"\n" + Q5.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user1picks[2]=keyboard.nextInt();
        // Player 1's 4th question 
        System.out.println(Q7.getQ()); 
        System.out.println (Q7.getA1() + "\n" + Q7.getA2()+"\n" + Q7.getA3()+"\n" + Q7.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user1picks[3]=keyboard.nextInt();
        // Player 1's 5th/final question 
        System.out.println(Q9.getQ()); 
        System.out.println (Q9.getA1() + "\n" + Q9.getA2()+"\n" + Q9.getA3()+"\n" + Q9.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user1picks[4]=keyboard.nextInt(); 
        // Now, Player Two 
        System.out.println("\n \n \n" +player2+" now it is your turn to answer five trivia questions");
        System.out.println (Q2.getQ()); 
        System.out.println (Q2.getA1() + "\n" + Q2.getA2()+"\n" + Q2.getA3()+"\n" + Q2.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user2picks[0]=keyboard.nextInt(); 
        // Player 2's 2nd question
        System.out.println(Q4.getQ()); 
        System.out.println (Q4.getA1() + "\n" + Q4.getA2()+"\n" + Q4.getA3()+"\n" + Q4.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user2picks[1]=keyboard.nextInt(); // index 1 corresponds to position two 
        // Player 2's 3rd question
        System.out.println(Q6.getQ()); 
        System.out.println (Q6.getA1() + "\n" + Q6.getA2()+"\n" + Q6.getA3()+"\n" + Q6.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user2picks[2]=keyboard.nextInt();
        // Player 2's 4th question 
        System.out.println(Q8.getQ()); 
        System.out.println (Q8.getA1() + "\n" + Q8.getA2()+"\n" + Q8.getA3()+"\n" + Q8.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user2picks[3]=keyboard.nextInt();
        // Player 2's 5th/final question
        System.out.println(Q10.getQ()); 
        System.out.println (Q10.getA1() + "\n" + Q10.getA2()+"\n" + Q10.getA3()+"\n" + Q10.getA4()); 
        System.out.println ("Please Enter your Answer with the number asociated with your answer: (1,2,3,4) "); 
        user2picks[4]=keyboard.nextInt(); 
        // award points to player one
        for (int i =0; i<user1picks.length;i++ ) { 
            if (user1picks[i]==correctAnswers1[i]) { 
                score1+=1;
            } 
        } 
        // award points to player 2
        for (int j =0; j<user2picks.length;j++ ) { 
            if (user2picks[j]==correctAnswers2[j]) { 
                score2+=1;
            }  
        } 
        // decision structure for printing out who won, or whether they were tied. 
        if (score1>score2) { 
            System.out.println("Thank you both for playing my game. Congrats "+ player1+", you earned:"+score1+" points.");
            System.out.println(player2+" you earned " + score2);
        } else if (score2>score1) { 
            System.out.println("Thank you both for playing my game. Congrats "+ player2+", you earned:"+score2+" points."); 
            System.out.println(player1+" you earned  " + score1+" points.");
        } else { 
            System.out.println("You both have the amount of points. Score:" +score1);
        }
        keyboard.close(); // close the keyboard
    }  
    
}
