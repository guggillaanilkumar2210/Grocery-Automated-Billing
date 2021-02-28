import java.util.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class Billing implements ActionListener {
	JFrame f; 
	JLabel l1,l2,l3,l4,l5;
	JComboBox c1,c2,c3,c4,c5;
	JButton b1,b2;
	public Billing()
	{
		f=new JFrame("Billing");
		l1 = new JLabel("Rice");
		l2 = new JLabel("Vegetables");
		l3 = new JLabel("Fruits");
		l4 = new JLabel("Snacks");
		l5 = new JLabel("Oils");
		c1 = new JComboBox();
		c1.addItem("select");
		c1.addItem("BPT");
		c1.addItem("Sona Masoori");
		c1.addItem("Basmati");
		c1.addItem("Brown Rice");
		c1.addItem("74");
		c2 = new JComboBox();
		c2.addItem("select");
		c2.addItem("Tomato");
		c2.addItem("Potato");
		c2.addItem("carrot");
		c2.addItem("Brinjal");
		c2.addItem("Beetroot");
		c3 = new JComboBox();
		c3.addItem("Select");
		c3.addItem("Apple");
		c3.addItem("Papaya");
		c3.addItem("Mango");
		c3.addItem("Grapes");
		c3.addItem("Watermelon");
		c4 = new JComboBox();
		c4.addItem("Select");
		c4.addItem("Biscuits");
		c4.addItem("Chocolates");
		c4.addItem("Icecream");
		c4.addItem("Waffers");
		c4.addItem("Chocopie");
		c5 = new JComboBox();
		c5.addItem("Select");
		c5.addItem("SunflowerOil");
		c5.addItem("PalmenOil");
		c5.addItem("GroundnutOil");
		c5.addItem("MustardOil");
		b1 = new JButton("Submit");
		b2 = new JButton("Reset");
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,600);
		l1.setBounds(50,50,150,30);
		c1.setBounds(250,50,200,30);
		l2.setBounds(50,100,150,30);
		c2.setBounds(250,100,200,30);
		l3.setBounds(50,150,150,30);
		c3.setBounds(250,150,200,30);
		l4.setBounds(50,225,150,30);
		c4.setBounds(250,225,200,30);
		l5.setBounds(50,275,150,30);
		c5.setBounds(250,275,200,30);
		b2.setBounds(280,350,150,30);
		b1.setBounds(30,350,150,30);
		f.add(l1);
		f.add(c1);
		f.add(l2);
		f.add(c2);
		f.add(l3);
		f.add(c3);
		f.add(l4);
		f.add(c4);
		f.add(l5);
		f.add(c5);
		f.add(b1);
		f.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String args[])
	{
		Billing obj = new Billing();
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		if(ae.getSource()==b1)
		{
			boolean Filled = true;
			int select = c1.getSelectedIndex();
			if(select==0)
			{
				Filled = false;
				JOptionPane.showMessageDialog(c1,"select the kind of rice required");
			}
			int select1 = c2.getSelectedIndex();
			if(select1==0)
			{
				Filled = false;
				JOptionPane.showMessageDialog(c2,"select the kind of Vegetables required");
			}
			int select3 = c3.getSelectedIndex();
			if(select3==0)
			{
				Filled = false;
				JOptionPane.showMessageDialog(c3,"select the kind of Fruits required");
			}
			int select4 = c4.getSelectedIndex();
			if(select4==0)
			{
				Filled = false;
				JOptionPane.showMessageDialog(c4,"select the kind of Snacks required");
			}
			int select5 = c5.getSelectedIndex();
			if(select5==0)
			{
				Filled = false;
				JOptionPane.showMessageDialog(c5,"select the kind of Oils required");
			}
			File myObj = new File("C:\\Users\\anilk\\OneDrive\\Desktop\\Bill.txt");
			FileWriter myWriter = new FileWriter("C:\\Users\\anilk\\OneDrive\\Desktop\\Bill.txt");
			int p,d,t1=0,t2=0,t3=0,t4=0,t5=0,tp=0;
			if(Filled==true)
			{
				if(c1.getSelectedItem().toString()=="BPT")
				{
					p = 1250;
					d = 200;
					t1=p-d;
					myWriter.write(c1.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t1);
				}
				if(c1.getSelectedItem().toString()=="Sona Masoori")
				{
					p = 1500;
					d = 300;
					t1=p-d;
					myWriter.write(c1.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t1);
				}
				if(c1.getSelectedItem().toString()=="Basmati")
				{
					p = 2000;
					d = 150;
					t1=p-d;
					myWriter.write(c1.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t1);
				}
				if(c1.getSelectedItem().toString()=="74")
				{
					p = 1300;
					d = 200;
					t1=p-d;
					myWriter.write(c1.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t1);
				}
				if(c1.getSelectedItem().toString()=="Brown Rice")
				{
					p = 2250;
					d = 250;
					t1=p-d;
					myWriter.write(c1.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t1);
				}
				myWriter.write("\n");
				if(c2.getSelectedItem().toString()=="Tomato")
				{
					p = 50;
					d = 5;
					t2=p-d;
					myWriter.write(c2.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t2);
				}
				if(c2.getSelectedItem().toString()=="Potato")
				{
					p = 35;
					d = 3;
					t2=p-d;
					myWriter.write(c2.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t2);
				}
				if(c2.getSelectedItem().toString()=="carrot")
				{
					p = 100;
					d = 20;
					t2=p-d;
					myWriter.write(c2.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t2);
				}
				if(c1.getSelectedItem().toString()=="Brinjal")
				{
					p = 40;
					d = 4;
					t2=p-d;
					myWriter.write(c1.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t2);
				}
				if(c2.getSelectedItem().toString()=="Beetroot")
				{
					p = 25;
					d = 5;
					t2=p-d;
					myWriter.write(c2.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t2);
				}
				myWriter.write("\n");
				if(c3.getSelectedItem().toString()=="Apple")
				{
					p = 250;
					d = 20;
					t3=p-d;
					myWriter.write(c3.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t3);
				}
				if(c3.getSelectedItem().toString()=="Papaya")
				{
					p = 40;
					d = 10;
					t3=p-d;
					myWriter.write(c3.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t3);
				}
				if(c3.getSelectedItem().toString()=="Mango")
				{
					p = 300;
					d = 15;
					t3=p-d;
					myWriter.write(c3.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t3);
				}
				if(c3.getSelectedItem().toString()=="Grapes")
				{
					p = 75;
					d = 15;
					t3=p-d;
					myWriter.write(c2.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t3);
				}
				if(c3.getSelectedItem().toString()=="Watermelon")
				{
					p = 100;
					d = 20;
					t3=p-d;
					myWriter.write(c3.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t3);
				}
				myWriter.write("\n");
				if(c4.getSelectedItem().toString()=="Biscuits")
				{
					p = 25;
					d = 2;
					t4=p-d;
					myWriter.write(c4.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t4);
				}
				if(c4.getSelectedItem().toString()=="Chocolates")
				{
					p = 100;
					d = 10;
					t4=p-d;
					myWriter.write(c4.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t4);
				}
				if(c4.getSelectedItem().toString()=="Icecream")
				{
					p = 60;
					d = 6;
					t4=p-d;
					myWriter.write(c4.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t4);
				}
				if(c4.getSelectedItem().toString()=="Waffers")
				{
					p = 10;
					d = 2;
					t4=p-d;
					myWriter.write(c4.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t4);
				}
				if(c4.getSelectedItem().toString()=="Chocopie")
				{
					p = 50;
					d = 2;
					t4=p-d;
					myWriter.write(c4.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t4);
				}
				myWriter.write("\n");
				if(c5.getSelectedItem().toString()=="SunflowerOil")
				{
					p = 100;
					d = 20;
					t5=p-d;
					myWriter.write(c5.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t5);
				}
				if(c5.getSelectedItem().toString()=="PalmenOil")
				{
					p = 80;
					d = 12;
					t5=p-d;
					myWriter.write(c5.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t5);
				}
				if(c5.getSelectedItem().toString()=="GroundnutOil")
				{
					p = 120;
					d = 10;
					t5=p-d;
					myWriter.write(c5.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t5);
				}
				if(c5.getSelectedItem().toString()=="MustardOil")
				{
					p = 150;
					d = 25;
					t5=p-d;
					myWriter.write(c5.getSelectedItem().toString()+" \nSelling Price = "+p+"\nDiscount = "+d+"\nFinal Price = "+t5);
				}
			}
			tp = t1+t2+t3+t4+t5;
			myWriter.write("\n");
			myWriter.write("Total price is : "+tp);
			myWriter.close();
			System.out.println("Succesfully executed!");
		}
		else if(ae.getSource()==b2)
		{
			c1.setSelectedIndex(0);
			c2.setSelectedIndex(0);
			c3.setSelectedIndex(0);
			c4.setSelectedIndex(0);
			c5.setSelectedIndex(0);
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

