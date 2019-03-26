package AbstractFactory;

public class SummerFactory implements SkinFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new summerbutton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SummerComboBox();
	}

	
}
