package demo;

public class ActorController {

	public Actor construct(ActorBuilder ab) {
		Actor actor;
		ab.BuildType();
		ab.BuildSex();
		ab.BuildFace();
		ab.BuildCostume();
		ab.BuildHairstyle();
		actor=ab.createActor();
		return actor;
	}

}
