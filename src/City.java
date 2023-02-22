public class City implements Comparable<City> {
    private int codeCity;
    private String name;


    public City(int codeCity, String name) {
        this.codeCity = codeCity;
        this.name = name;
    }

    public int getCode() {
        return codeCity;
    }

    public void setCode(int code) {
        this.codeCity = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + codeCity +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return this.codeCity-o.codeCity;
    }
}
