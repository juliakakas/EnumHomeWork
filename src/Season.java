public enum Season {
    WINTER("Tél", "Hiver"),
    SPRING("Tavasz", "Printemps"),
    SUMMER("Nyár", "Été"),
    AUTUMN("Ősz", "Automne");

    private String hunSE;
    private String frenchSE;

    private Season(String hunSE, String frenchSE){
        this.hunSE = hunSE;
        this.frenchSE = frenchSE;
    }

    public String getHunSE(){ return hunSE;}

    public String getFrenchSE() {return frenchSE;}
}
