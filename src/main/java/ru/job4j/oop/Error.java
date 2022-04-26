package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 10, "Работаем");
        error1.printInfo();
        Error error2 = new Error(false, 5, "Отдыхаем");
        error2.printInfo();
    }

    public void printInfo() {
        System.out.println("Активно: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

}
