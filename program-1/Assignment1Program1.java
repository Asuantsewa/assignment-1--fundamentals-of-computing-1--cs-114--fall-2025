public class Assignment1Program1 {
  public static void main(String[] args) {

  }
}
// letter1 and letter2 would be created by some other method that you must define
String[] letter1 = new String[]{"JJJJJJJ", "JJJJJJ", "JJJJ", "JJJJ",};
String[] letter2 = new String[]{"EEEEEEEEE" , "EEEE", "EEEEEEEEEE", "EEEE", "EEEEEEEEEE"};

String[] concat = new String[letter1.length];

for (int i = 0 ; i < concat.length ; i++); 
    concat[i] = letter1[i] + "\t" + letter2[i];
for (String s : concat)
    System.out.println(s);
