
package healthypets;

abstract class Djur {
    private String name;
    private String typ;
    private int vikt;
        
    public Djur(String name, int vikt, String typ) {
        this.name = name;
        this.vikt = vikt;
        this.typ = typ;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getVikt() {
        return this.vikt;
    }
    
    public String getTyp() {
        return this.typ;
    }
        
    public abstract void printMe();
}
