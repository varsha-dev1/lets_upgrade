package quiz_application;

public class Game {

	Question[] questions = new Question[5];
	Player player = new Player();
	
	String[] questionsOfQuiz={"The first Indian woman to get Nobel Prize?","Which is the hardest rock?","Where is the smallest bone in the body?","What is the origin of the word 'Tea'?","First World War commenced in?"};
    String[] firstOption={"Indira Gandhi","Granite","Nose","Italian","1914"};
    String[] secondOption={"Mother Teresa","Diamond","Elbow","Japanese","1913"};
    String[] thirdOption={"Sarojini Naidu","Sandstone","Ear","Chinese","1916"};
    String[] fourthOption={"Vijayalakshmi Pandit","Marble","Ankle","Indian","1912"};
    char[] answers={'b','b','c','c','a'};

	
	
	public void initializeGame(){
		for(int i=0;i<5;i++){
            questions[i] = new Question();
        }

        for(int i=0;i<5;i++){

            questions[i].question = questionsOfQuiz[i];
            questions[i].optionA = firstOption[i];
            questions[i].optionB = secondOption[i];
            questions[i].optionC = thirdOption[i];
            questions[i].optionD = fourthOption[i];
            questions[i].correctAnswer = answers[i];
        }        
	}
	
	 public void play(){
         player.getDetails();
         for(int i=0; i<5; i++){
             boolean status = questions[i].showQusetion();
             if(status == true){
                 System.out.println("Well played :)");
                 player.score = player.score + 10;
             }else{
                 System.out.println("Sorry! Better luck next time");
                 player.score = player.score - 10;
             }
         }
       System.out.println("\n"+player.playerName+" your total score is: "+player.score+" out of 50");
   }
}
