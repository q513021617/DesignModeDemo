package demo;

public class client {

	public static void main(String[] args) {
		
		ActorBuilder ab;
		ab=(ActorBuilder)XMLUtil.getBean();
		Actor actor;
		ActorController ac=new ActorController();
		actor=ac.construct(ab);
		String type=actor.getType();
		System.out.println(type+"����ۣ�");
		System.out.println("�Ա�"+actor.getSex());
		System.out.println("���ݣ�"+actor.getFace());
		System.out.println("��װ��"+actor.getConstume());
		System.out.println("����"+actor.getHairstyle());
	}

}
