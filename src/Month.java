public enum Month {
    JANUARY("Január", "Janvier"),
    FEBRUARY("Február", "Févriér"),
    MARCH("Március", "Mars"),
    APRIL("Április", "Avril"),
    MAY("Május", "Mai"),
    JUNE("Junius", "Juin"),
    JULY("Július","Juillet"),
    AUGUST("Augusztus", "Aout"),
    SEPTEMBER("Szeptember", "Septembre"),
    OCTOBER("Október", "Octobre"),
    NOVEMBER("November", "Novembre"),
    DECEMBER("December", "Decembre");

    private String hunMO;

    private String frenchMO;

    private Month(String hunMO,String frenchMO){
        this.hunMO = hunMO;
        this.frenchMO = frenchMO;
    }

    public String getHunMO() {
        return hunMO;
    }

    public String getFrenchMO() {
        return frenchMO;
    }
}
