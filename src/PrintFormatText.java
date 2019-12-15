public class PrintFormatText {
    static void textInTable(String name, String city, int age, String hobby) {

        String texttable = "---------------\n"+"Имя:" + name + "\n" +//вывод в табличном варианте
                "Город: " + city + "\n" +
                "Возраст: " + age + "\n" +
                "Хобби: " + hobby + "\n";
        System.out.println(texttable);
    }

    static void textForm(String name, String city, int age, String hobby) {
        String textline ="---------------\n"+"Человек по имени "+ name +" живет в городе " + city+".\n"+//вывод в строковом варианте
        "Этому человеку "+ age+" лет и любит он заниматься "+ hobby+".\n" ;
        System.out.println(textline);
    }
    static void anotherForm(String name, String city, int age, String hobby) {
        String another = "---------------\n"+ name +" - имя \n" +
                city+" - город \n"+ age+" - возраст\n" + hobby +" - хобби \n";//вывод в ином варианте
        System.out.println(another);
    }

}