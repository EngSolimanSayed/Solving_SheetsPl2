// Q8.3
public class Test11 {
    public static void main(String[] args) {

        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        
        int[] correctCounts = new int[answers.length];

        
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            correctCounts[i] = correctCount;
        }

        
        for (int i = 0; i < correctCounts.length - 1; i++) {
            for (int j = i + 1; j < correctCounts.length; j++) {
                if (correctCounts[i] > correctCounts[j]) {
                    
                    int temp = correctCounts[i];
                    correctCounts[i] = correctCounts[j];
                    correctCounts[j] = temp;

                    
                    char[] tempAnswers = answers[i];
                    answers[i] = answers[j];
                    answers[j] = tempAnswers;
                }
            }
        }

        
        for (int i = 0; i < correctCounts.length; i++) {
            System.out.println("Student " + i + "'s correct count is " + correctCounts[i]);
        }
    }
}
