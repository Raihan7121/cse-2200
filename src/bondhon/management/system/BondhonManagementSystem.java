
package bondhon.management.system;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;


public class BondhonManagementSystem extends JFrame implements ActionListener{
    BondhonManagementSystem(){
              setSize(1672,827);
        setLocation(0,0);
       setBounds(0,0,1672,827);
      setLayout(null);
     
       
            String imageurl="C:\\Users\\Acer\\Documents\\NetBeansProjects\\Bondhon Management System\\src\\icon/home14.jpg";
            File imageFile = new File(imageurl);
         //if (imageFile != null && imageFile.exists()) {
            ImageIcon imageIcon = new ImageIcon(imageFile.getAbsolutePath());
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance( 1672, 872, Image.SCALE_SMOOTH);
             ImageIcon ll=new ImageIcon(scaledImage);
        //} else {
            //btn_dashpic.setIcon(null);
        //}
      
      // ImageIcon ll=new ImageIcon(ClassLoader.getSystemResource("icon/home14.jpg")) ;
       JLabel image1 =new JLabel(ll) ;           //to show pic 
       image1.setBounds(0,0,1672,827);
       add(image1);
       
       JLabel text=new JLabel("WELLCOME TO BONDHON");
       text.setBounds(20,600,700,180);
       text.setForeground(Color.red);
//      // text.setFont(new Font("serif", font.PLAIN,78));
             text.setFont(new Font("Times New Roman", 5, 28));
       image1.add(text);
      
       JButton next=new JButton("Next");
       next.setBounds(1400,700,70,30);
       next.setBackground(Color.green);
       next.setForeground(Color.magenta);
       next.addActionListener(this);// ai buttn e click  
       next.setFont(new Font("Times New Roman", 3, 18));
       image1.add(next);
       
       setVisible(true);
       
      
      
       while(true){
           text.setVisible(false);
           try {
               Thread.sleep(500);
          }catch(Exception e){
               e.printStackTrace();
           }
            text.setVisible(true);
            
           try {
               Thread.sleep(500);
           }catch(Exception e){
               e.printStackTrace();
         }
      }
      
    
    
   
  
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    new BondhonManagementSystem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        setVisible(false); 
       
        Login LoginFrame=new Login();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
    }
    
}
