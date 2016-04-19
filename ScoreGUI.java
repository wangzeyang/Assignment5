import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ScoreGUI extends JFrame implements ActionListener{    
	JTextField [] Text= new JTextField[4];
        JLabel[] Label= new JLabel[5];
        JPanel panel=new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3= new JPanel();
        JPanel panel4= new JPanel();
        JPanel panel5= new JPanel();
        JButton button= new JButton("Calculate");
        JTextField []Text2 = new JTextField[4];
        JLabel label2 =new JLabel("");
        JLabel label3 =new JLabel("Score");
        JLabel label4 =new JLabel("Weight");
        JPanel name = new JPanel();
        JLabel name1= new JLabel("Name");
        JTextField Text5 = new JTextField();
        public static int grade1, grade2, grade3, grade4;
        public static String Getname;
        public static double weight1, weight2, weight3, weight4;
        
        //  Construct the constructor for the JFrame
         
       public ScoreGUI(){
    	   
    	   name.setLayout(new GridLayout(1,2));
    	   name.add(name1);
    	   name.add(Text5);
    	   panel.setLayout(new GridLayout(5,1));
    	   panel2.setLayout(new GridLayout(5,1));
    	   panel3.setLayout(new GridLayout(5,1));
    	   panel5.setLayout(new GridLayout(1,3));
    	   button.addActionListener(this);
    	   Label[0]= new JLabel("");
			Label[1]= new JLabel("Assignment");
			Label[2]= new JLabel("Mid Term");
			Label[3]= new JLabel("Quiz");
			Label[4]= new JLabel("Final Exam");
			
			for(int i=0;i<=4;i++){
				panel.add(Label[i]);
			}
			panel2.add(label3);
			for(int i=0;i<=3;i++){
				Text[i]= new JTextField();
				panel2.add(Text[i]);
			}
			panel3.add(label4);
			for(int i=0; i<=3;i++){
				Text2[i]= new JTextField();
				panel3.add(Text2[i]);
				
			}
			
            panel4.add(button);
            panel5.add(panel);
            panel5.add(panel2);
            panel5.add(panel3);
            add(name, BorderLayout.NORTH);
            add(panel5,BorderLayout.CENTER);
            add(panel4,BorderLayout.SOUTH);
           pack();
           setLocationRelativeTo(null);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
       }
		
	

		public void actionPerformed(ActionEvent e) {
			 Getname=Text5.getText();
			if(e.getSource()==button){
				JOptionPane.showMessageDialog(null,"Hello, "+Getname+"."+"Your final score is "+ FinalGrade());
			}
			
		}
		
		// Define a method to get the final score
		 
		public double FinalGrade(){
			grade1=Integer.parseInt(Text[0].getText());
			grade2=Integer.parseInt(Text[1].getText());
			grade3=Integer.parseInt(Text[2].getText());
			grade4=Integer.parseInt(Text[3].getText());
			weight1=Double.parseDouble(Text2[0].getText());
			weight2=Double.parseDouble(Text2[1].getText());
			weight3=Double.parseDouble(Text2[2].getText());
			weight4=Double.parseDouble(Text2[3].getText());
			
			return grade1*weight1+grade2*weight2+grade3*weight3+grade4*weight4;
		}
}