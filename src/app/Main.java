package app;

public class Main {
    public static void main(String[] args) {
        Spivrobitnyk spivrobitnyk = new Spivrobitnyk("Катя Ярмак", "Smm", "kateyarmak025@gmail.com", "+380974546724", 33);

        System.out.println("ПІБ: " + spivrobitnyk.getPib());
        System.out.println("Посада: " + spivrobitnyk.getPosada());
        System.out.println("Email: " + spivrobitnyk.getEmail());
        System.out.println("Телефон: " + spivrobitnyk.getTelefon());
        System.out.println("Вік: " + spivrobitnyk.getVik());

        Car car = new Car();
        car.start();
    }
}
