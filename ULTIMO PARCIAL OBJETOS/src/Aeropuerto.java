public class Aeropuerto {
    private String code;
    private String name;
    private String population;
    private String country;
    private String GMT;
    public Aeropuerto(String code, String name, String population, String country, String GMT) {
        this.code = code;
        this.name = name;
        this.population = population;
        this.country = country;
        this.GMT = GMT;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getPopulation() {
        return population;
    }
    public String getCountry() {
        return country;
    }
    public String getGMT() {
        return GMT;
    }
}
