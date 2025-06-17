//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
var dog = 8.0;
var cat = 3.6;
var paper = 763789;
System.out.println(dog);
System.out.println(cat);
System.out.println(paper);
dog = dog + 4;
System.out.println(dog);
cat = cat + 4;
System.out.println(cat);
paper = paper + 4;
System.out.println(paper);
dog = dog - 3.8;
System.out.println(dog);
cat = cat - 1.6;
System.out.println(cat);
paper = paper - 7639;
System.out.println(paper);
var friend = 19;
System.out.println(friend);
friend = friend + 2;
System.out.println(friend);
friend = friend / 7;
System.out.println(friend);
var frog = 3.5;
System.out.println(frog);
frog = frog * 10;
System.out.println(frog);
frog = frog / 3.5;
System.out.println(frog);
frog = frog + 4;
System.out.println(frog);
var boxerWeight1 = 78.2;
System.out.println(boxerWeight1);
var boxerWeight2 = 82.7;
System.out.println(boxerWeight2);
var generalWeight = boxerWeight1 + boxerWeight2;
System.out.println(generalWeight);
var differenceWeight = boxerWeight2 - boxerWeight1;
System.out.println("Разница между бойцами " + differenceWeight + " кг");
var balanceWeight = boxerWeight2 % boxerWeight1;
System.out.println(balanceWeight);
var totalHours = 640;
System.out.println(totalHours);
var oneEmployeeHours = 8;
System.out.println(oneEmployeeHours);
var totalEmployees = totalHours / oneEmployeeHours;
System.out.println("Всего работников в компании " + totalEmployees + " человек");
totalEmployees = totalEmployees + 94;
System.out.println(totalEmployees);
var totalHours2 = totalEmployees * oneEmployeeHours;
System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");
    }
}