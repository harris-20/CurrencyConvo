import java.awt.*;  
import java.awt.event.*;  
public class TextFieldExample extends Frame implements ActionListener{  

    Label l1,l2,l3,l4,l5,l6,l7,l8;  
    TextField t1,t2,t3,t4,t5,t6;
    Button b1,b2;
    Frame f;
    
    TextFieldExample(){  
    Frame f= new Frame("Rice's Currency Converter");
    l1=new Label("US Dollars:");  
    l1.setBounds(50,100, 100,30); 
    l7=new Label("Haari Sushil Raj M");  
    l7.setBounds(20,50, 150,30);
    t1=new TextField();  
    t1.setBounds(150,100,100,20);  
    l2=new Label("Russian Rubles");  
    l2.setBounds(50,200, 100,30); 
    t2=new TextField(); 
    t2.setBounds(150,200,100,20);  
    l3=new Label("Japanese Yen");  
    l3.setBounds(50,250, 100,30); 
    t3=new TextField(); 
    t3.setBounds(150,250,100,20);  
    l4=new Label("Canadian Dollar");  
    l4.setBounds(50,300, 100,30);  
    t4=new TextField(); 
    t4.setBounds(150,300,100,20);  
    l5=new Label("European Euro");  
    l5.setBounds(50,350, 100,30);  
    t5=new TextField(); 
    t5.setBounds(150,350,100,20); 
    l6=new Label("Mexican Peso");  
    l6.setBounds(50,400, 100,30);    
    t6=new TextField();  
    t6.setBounds(150,400,100,20);   
    
    Color clr1 = new Color(204,204,204);
    
    b1=new Button("Convert");  
    b1.setBounds(50,150,50,20);  
    b2=new Button("Exit");  
    b2.setBounds(150,150,50,20);  
    b1.addActionListener(this);  
    b2.addActionListener(this); 
    
    f.setBackground(clr1);
    
    f.add(l1); f.add(l2);
    f.add(l3);f.add(l4);f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);
    f.add(t6);f.add(l5);f.add(l6);//f.add(l7);f.add(l8);  
    f.add(b1);f.add(b2);
    f.setSize(400,500);  
    f.setLayout(null);  
    f.setVisible(true);  
       }       
    public void windowClosing(WindowEvent e) {  
    f.dispose();  
     }   
    public void actionPerformed(ActionEvent e) {  
        String s1=t1.getText();  
        int a=Integer.parseInt(s1);   
        double r=0;  
        double j=0;  
        double c=0;  
        double eu=0;  
        double m=0;  
        if(e.getSource()==b1){  
            r=a*79.37;
            j=a*104.66;
            c=a*0.75;
            eu=a*0.86;
            m=a*21.9;
            
           String rus=String.valueOf(r);  
           t2.setText(rus);  
           String jap=String.valueOf(j);  
           t3.setText(jap);
           String can=String.valueOf(c);  
           t4.setText(can);
           String euro=String.valueOf(eu);  
           t5.setText(euro);
           String mex=String.valueOf(m);  
           t6.setText(mex);
              
        }else if(e.getSource()==b2){  
            dispose();
        }  
        
       
    }  
public static void main(String[] args) {  
    new TextFieldExample();  
}  
} 