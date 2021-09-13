import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class HescoBillCalc extends Frame implements ActionListener{ 
	JFrame f;
	JLabel L1,result,trollyL1,trollyL2;
    JTextField tf1,result_tf;  
    JButton calc,exit,clear,about;  
    HescoBillCalc(){  
		f=new JFrame("Age Compare");
		f.setBounds(0,0,1000,1000);

		trollyL1=new JLabel("Sindhiana Transport Co.");
		trollyL1.setBounds(140,20,300,50);
		Font font1=new Font("Adobe Hebrew",Font.BOLD,25);
		trollyL1.setFont(font1);

		trollyL2=new JLabel("Hesco Bill Calculation");
		trollyL2.setBounds(150,40,300,50);
		Font font2=new Font("Adobe Hebrew",Font.BOLD,25);
		trollyL2.setFont(font2);		
		
		L1=new JLabel("Enter Electric units");
		L1.setBounds(10,100,200,30);
		
		result=new JLabel("Charges will be");
		result.setBounds(10,200,200,30);
		
        tf1=new JTextField();  
        tf1.setBounds(200,100,200,30);
			
		result_tf=new JTextField();
		result_tf.setBounds(200,200,200,30);
		result_tf.setEditable(false);
		
        calc=new JButton("Calculate");  
        calc.setBounds(50,150,150,30);  
				
		
		exit=new JButton("EXIT");
		exit.setBounds(20,300,100,40);
		
		clear=new JButton("CLEAR");
		clear.setBounds(120,300,100,40);
		
		about=new JButton("ABOUT");
		about.setBounds(220,300,100,40);
		
   
		calc.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
		about.addActionListener(this);
		
		f.add(calc);
		f.add(trollyL1);
		f.add(trollyL2);
		f.add(L1);
		f.add(result);
		f.add(tf1);
		f.add(result_tf);
		f.add(exit);
		f.add(clear);
		f.add(about);
		
        setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true); 
		f.show();
	}
	private void clear()
	{
		tf1.setText("");
		result_tf.setText("");
	}			
             
    public void actionPerformed(ActionEvent e){
		if(calc==e.getSource()){	
		String s1=tf1.getText();
		int units=Integer.parseInt(s1);
		int a;
		int b;
		int c;
		int d;
		int e1;
		int total;
			if(units<=100){
				result_tf.setText(""+(units*2));
			}
				if(units>100 && units<=200)
				{
					a=100*2;
					b=(units-100);
					total=((b*4)+a);
					result_tf.setText(""+(total));
				}
					if(units>200 && units<=300)
					{
						a=100*2;
						b=100*4;
						c=(units-200);
						total=((units*6)+a+b);
						result_tf.setText(""+(total));
					}
						if(units>300 && units<=400)
						{
							a=100*2;
							b=100*4;
							c=(100*6);
							d=units-300;
							total=((d*8)+a+b+c);
							result_tf.setText(""+(total));
						}
							if(units>400)
							{
								a=100*2;
								b=100*4;
								c=100*6;
								d=100*8;
								e1=units-400;
								total=((e1*10)+a+b+c+d);
								result_tf.setText(""+(total));
							}
		}//main if ends
		if(clear==e.getSource()){
			clear();
		}
		if(exit==e.getSource()){
			System.exit(0);
		}
		if(about==e.getSource()){
			JOptionPane.showMessageDialog(null,"Name: Danish Azeem \nOrganization: Muet \nContact: 03066558872");
		}				
    }  
public static void main(String[] args) {  
    new HescoBillCalc();  
}  
}  