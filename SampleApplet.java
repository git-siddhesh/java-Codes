import java.applet.Applet;
import java.awt.*;

/*<applet code="SampleApplet" width="300" height="200"></applet> */
public class SampleApplet extends Applet{

// Creating component reference variable
	Label lab1, lab2;
	TextField tf1, tf2;
	Button b1;

//Method overriding
	public void init(){
//Initialize components
		lab1 = new Label("First no :");
		tf1 = new TextField("Text   Field :");
		lab2 = new Label("Second no :");
		tf2 = new TextField("text field");
		b1 = new Button("Submit ");
		// Setting the layout 
		setLayout(null);
		//definig the position of layout

		lab1.setBounds(20,60,100,20);
		// We can directly call add fuction of applet function
		add(lab1);add(lab2);add(tf1);add(tf2);add(b1);

	}
}