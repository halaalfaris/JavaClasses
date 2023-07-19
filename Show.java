
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Show {
    public String name;
    private int timesWatched;
    private double rate;
    private static int maxRate=5;
    private Date dateAdded;
    Scanner scan= new Scanner(System.in);
    public Show(){
        name = JOptionPane.showInputDialog(null,"enter the name of the show");
        dateAdded=new Date();
    }
    
    public Show(String name){
        this.name=name;
    }
    
    public double getRate(){
        return rate;
    }
    
    public int getTimeWatched(){
        return timesWatched;
    }
    
    public static int getMaxRate(){
        return maxRate;
    }
    
    public void updateRate(){
        System.out.println("rate the show "+name+"from 0 to "+maxRate);
    int temp=Integer.parseInt(JOptionPane.showInputDialog(null,"rate this show"));
    while(temp<0 ||temp>maxRate){
        System.out.println("enter a valid rating");
        temp=scan.nextInt();
    }
    timesWatched++;
    rate=(rate*(timesWatched-1)+temp)/timesWatched;
    
    }
    public Date getDate(){
        return dateAdded;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Show){
            if (((Show) o).rate==rate)
                return true;
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return "name: "+name+" ,rate: "+rate+" ,time watched: "+timesWatched+" ,Date: "+dateAdded;
    }
}
