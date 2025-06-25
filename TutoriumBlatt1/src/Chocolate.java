public class Chocolate {
    final private String name;
    private double preis;

    public Chocolate(String name, double preis){
        this.name = name;
        this.preis = preis;
    }

    public String getName(){
        return name;
    }

   public double getPreis(){
        return preis;
    }

    public void setPreis(double preis){
        this.preis = preis;
    }

    @Override
    public String toString(){
        return "Name: " +name+ " " + "Preis: " +preis;
    }

    @Override
    public boolean equals(Object object){
        if (object == null) return false;
        if(object == this) return true;
        if (object instanceof Chocolate){
            if(this.name.equals(((Chocolate) object).getName()) ){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return name.hashCode() * 31;
    }
}
