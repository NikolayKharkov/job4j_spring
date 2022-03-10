package di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);
        ConsoleInput ci = context.get(ConsoleInput.class);

        ui.add(ci.askStr("Question ?"));
        ui.print();
    }
}
