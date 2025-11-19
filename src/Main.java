//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("+4 dog =" + dog);
        System.out.println("+4 cat =" + cat);
        System.out.println("+4 paper =" + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7693;
        System.out.println("-3.5dog =" + dog);
        System.out.println("-1.6cat =" + cat);
        System.out.println("-7693paper =" +paper);
        var friend = 19;
        System.out.println(friend + " friend");
        friend = friend * 2;
        System.out.println("x2 =" + friend);
        friend = friend / 7;
        System.out.println("/7 =" + friend);
        var frog = 3.5;
        System.out.println(frog + " frog");
        frog = frog * 10;
        System.out.println("*10 = frog " + frog);
        frog = frog / 3.5;
        System.out.println("/3.5 = frog " + frog);
        var result = frog + friend;
        System.out.println ("frog + friend = " + result);
        var boxerW1 = 78.2;
        var boxerW2 = 82.7;
        result = boxerW1 + boxerW2;
        System.out.println ("boxer + boxer2 = " + result);
        result = boxerW2 - boxerW1;
        System.out.println ("разница = " + result + "кг.");
        result = boxerW2 % boxerW1;
        System.out.println ("разница = " + result + "кг.");
        var hoursWork = 640;
        var timeWorker = 8;
        var staff = hoursWork / timeWorker;
        System.out.println(staff + " сотрудников");

        result = hoursWork / timeWorker;
        System.out.println ("Всего работников в компании " + result + " человек");
        var staff2 = staff + 94;
        System.out.println("+94 сотрудника=" + staff2);
        var timeWorker2 = hoursWork / staff2;
        System.out.println("Если в компании работает " + staff2 + " человек, то всего " + timeWorker2 + " часов работы может быть поделено между сотрудниками");
    }
}
