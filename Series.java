
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Series extends Show{
    private int numOfEpisodes;
    private double episodeDuration;
    Scanner scan= new Scanner(System.in);
    public Series(){
        super();
        numOfEpisodes=Integer.parseInt(JOptionPane.showInputDialog(null,"enter num of episodes"));;
        episodeDuration=Double.parseDouble(JOptionPane.showInputDialog(null,"enter production year"));;
    }
    
    public Series(String name, int numOfEpisodes, double episodeDuration){
        super(name);
        this.numOfEpisodes=numOfEpisodes;
        this.episodeDuration=episodeDuration;
    }
    
    public int getNumOfEpisodes(){
        return numOfEpisodes;
    }
    
    public double getEpisodeDuration(){
        return episodeDuration;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\n numOfEpisodes: "+ numOfEpisodes+"episodeDuration: "+episodeDuration;
    }
}
