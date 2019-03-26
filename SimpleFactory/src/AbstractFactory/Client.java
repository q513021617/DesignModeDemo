package AbstractFactory;

public class Client {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkinFactory factory;
		Button btn;
		TextField textField;
		ComboBox comboBox;
		
		factory=(SkinFactory)XMLUtil.getBean();
		
		btn=factory.createButton();
		textField=factory.createTextField();
		comboBox=factory.createComboBox();
		btn.display();
		textField.display();
		comboBox.display();
	}

}
