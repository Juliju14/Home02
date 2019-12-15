public class Main {
    public static void main(String[] args){
        VarText newtext = new VarText();
     String name = newtext.inputName();
      int age = newtext.inputAge();
       String city = newtext.inputCity();
       String hobby = newtext.inputHobby();

PrintFormatText.textInTable(name, city, age, hobby);
        PrintFormatText.textForm(name, city, age, hobby);
        PrintFormatText.anotherForm(name, city, age, hobby);

    }

}
