public class Main {
    public static void main(String[] args) {
//озунуз каалаган бир класс тузунуз,ал класстын ичинде бир
//кайтаруучу метод тузунуз ал бизге стринг кайтарсын
//ал метод бизге узгон обьектибиздинмаанилерин чыгарып берсин
help student1 = new help();
student1.name = "Erbol";
student1.surname = "Zholbars";
student1.age = 18;
student1.getAge();
help student2 = new help();
student2.name = "Ars";
student2.surname = "Sabrov";
student2.age = 15;
student2.getAge();
        System.out.println(student1.name +" " + student1.surname +" " + student1.age + "\n" + student2.name + " " + student2.surname+ " " + student2.age);

    }
}