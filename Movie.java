
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Movie extends Show{
    private double duration;
    private int productionYear;
    Scanner scan= new Scanner(System.in);
    
    public Movie(){
        super();
        duration=Double.parseDouble(JOptionPane.showInputDialog(null,"enter duration"));
        productionYear=Integer.parseInt(JOptionPane.showInputDialog(null,"enter production year"));
        
    }
    
    public Movie(String name, double duration,int productionYear){
        super(name);
        this.duration=duration;
        this.productionYear=productionYear;
    }
    
    public double getDuration(){
        return duration;
    }
    
    public int getProductionYear(){
        return productionYear;
    }
    
    @Override
    public boolean equals(Object o){
        
        if(((Movie)o).getProductionYear()==getProductionYear() && super.equals(o))
            return true;
        
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\n duration: "+duration+"production year: "+productionYear;
        
    }
}
