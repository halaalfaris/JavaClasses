

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Platform {
    private ArrayList<Show> showList= new ArrayList<Show>();
    

    public Platform() {
    }
    public void addShow(){
        String num = JOptionPane.showInputDialog(null,"what type of show do you want? \n 1.Movie\n 2.Series");
        if(num.charAt(0)=='1')
            showList.add(new Movie());
        else if(num.charAt(0)=='2')
            showList.add(new Series());
        else if (num== null)
            return;
        else
            JOptionPane.showMessageDialog(null,"wrong input");
        
    }
    public void searchShows(){
        String showName = JOptionPane.showInputDialog(null,"what show do you want to search");
        for(int i=0;i<showList.size();i++){
            if(showList.get(i).name.equals(showName))
                JOptionPane.showMessageDialog(null, showList.get(i).toString()); 
            return;
                }
        JOptionPane.showMessageDialog(null, "Could not find show with title");
                
    }
    public void watchShow(){
        String num = JOptionPane.showInputDialog(null,"what type of show do you want? \n 1.Movie\n 2.Series");
        String Names="";
        if(num.charAt(0)=='1'){
            for(int i=0;i<showList.size();i++){
                if(showList.get(i) instanceof Movie){
                    Names+=showList.get(i)+"\n";
                
                }
            } 
            String choice=JOptionPane.showInputDialog(null, Names);
            for (int i = 0; i < showList.size(); i++) {
                if(showList.get(i).name.equals(choice))
                    showList.get(i).updateRate();
            }
 
            
            
        }
        else if(num.charAt(0)=='2'){
            for(int i=0;i<showList.size();i++){
                if(showList.get(i) instanceof Series){
                    Names+=showList.get(i).toString()+"\n";
                   
                }
        }
            String choice=JOptionPane.showInputDialog(null, Names);
            for (int i = 0; i < showList.size(); i++) {
                if(showList.get(i).name.equals(choice))
                    showList.get(i).updateRate();
             
         }
       
        }
    }
}
    
