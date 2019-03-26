package AbstractFactory;

public class SpringFactory implements SkinFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new springbutton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SpringComboBox();
	}
}
