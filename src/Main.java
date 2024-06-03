//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // используйте шаблон a +- bi COMMANDS c +- di
        // деление выводит только int значения, придумать как парсить до дабла не смог,
        // ибо пришлось бы всю логику переписывать
        View view = new View(new LogableCalculator(new Calculator()));
        view.run();
    }
}