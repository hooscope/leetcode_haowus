package top_interview_question;



public class question_12 {
    public static String intToRoman(int num) {

        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


        String s = "";
        for (int i=0;i<values.length;i++){
            while (num>=values[i]){
                num -= values[i];
                s += reps[i];
            }
        }


        return s;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(125));
    }
}
