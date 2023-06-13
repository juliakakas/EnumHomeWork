
public class Main {
    public static void main(String[] args) {
        System.out.println("Month: " + Month.JUNE + " , Season: " + Season.SUMMER);

        for (Month month : Month.values()) {
            System.out.println(month.getFrenchMO());
        }

        for (Season season: Season.values()) {
            System.out.println(season.getFrenchSE());
        }
    }
}