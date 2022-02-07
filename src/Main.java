public class Main {

    public static void main(String[] args) {

        String[][] word= new String[7][4];
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j <word[i].length ; j++) {
                if(i==0 || i==3 || i==6){
                    word[i][j]=" * ";
                }
                else if(j==0 | j==3){
                    word[i][j]=" * ";
                }
                else{
                    word[i][j]="   ";
                }
            }
        }
        
        for (String[] i: word){
            for(String j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
